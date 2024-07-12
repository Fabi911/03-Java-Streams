import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Integer> evenNumbers = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> doubledNumbers = evenNumbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        List<Integer> sortedNumbers = doubledNumbers.stream()
                .sorted()
                .collect(Collectors.toList());
        int sum = sortedNumbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum of all numbers: " + sum);
        sortedNumbers.forEach(System.out::println);
        List<Integer> processedNumbers = sortedNumbers.stream()
                .collect(Collectors.toList());
        System.out.println("New list of processed numbers: " + processedNumbers);
    }
}
