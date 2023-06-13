package az.coders.chapter1.lesson19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class SecondProblem {
    public static void main(String[] args) throws IOException {

        String originalFilePath = "C:\\Users\\user\\Desktop\\forChanging.txt";

        String destinationDirectoryPath = "C:\\Users\\user\\Downloads";

        File originalFile = new File(originalFilePath);
        File destinationDirectory = new File(destinationDirectoryPath);

        File newFile = new File(destinationDirectory, originalFile.getName());

        try {

            Files.copy(originalFile.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println(newFile.getAbsolutePath());
    }
}

