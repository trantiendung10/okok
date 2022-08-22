package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TestFile {
    public static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path));
    }

    public static void WriteFile(String path, String content) throws IOException {
        Files.writeString(Paths.get(path), content, StandardOpenOption.APPEND);
    }

    public static void main(String[] args) {
        String filePath = "E:\\A_Star/dd.txt";

        String content = null;
        try {
            WriteFile(filePath, "ok");
            content = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(content);
    }
}
