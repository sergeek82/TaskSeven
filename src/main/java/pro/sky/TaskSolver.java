package pro.sky;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TaskSolver {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Path.of("src/main/resources/file.txt"))) {
            String[] strings = stream.toArray(String[]::new);
            for (int i = 0; i < strings.length; i++) {
                System.out.println(strings[i + 5]);
            }
        } catch (ArrayIndexOutOfBoundsException | IOException e) {
            e.printStackTrace();
        }
    }
}
