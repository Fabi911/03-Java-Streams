package de.students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) throws IOException {
        List<String> students = Files.lines(Path.of("students.csv")).collect(Collectors.toList());
        System.out.println(students);
        List<String> students2=students.stream()
                .filter(line -> !line.contains("ID"))
                .collect(Collectors.toList());
        System.out.println(students2);
        List<String> students3 =students2.stream()
                .filter(line -> line != null && !line.trim().isEmpty())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(students3);
    }
}
