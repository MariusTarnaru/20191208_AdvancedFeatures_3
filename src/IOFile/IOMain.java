package IOFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IOMain {

    public static void main(String[] args) throws IOException {

        File absoluteFile = new File("D:\\JAVA\\20191208_AdvancedFeatures 3\\src\\IOFile\\ioExample.txt");
        File relativeFile = new File("ioExample");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteFile))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(absoluteFile.getName() + ": " + fileLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path absolutePath = Paths.get("D:\\JAVA\\20191208_AdvancedFeatures 3\\src\\IOFile\\ioExample.txt");
        // List<String> listaMea = Arrays.asList("ceva de adaugat", "urmatorul append");
        // Files.write(absolutePath, listaMea, StandardOpenOption.APPEND);
        System.out.println(absolutePath);
        List<String> listaMea = Files.readAllLines(absolutePath);
        System.out.println("ioExample file has: " + countWords(listaMea) + " words");
        System.out.println("ioExample file has: " + countOneWord(listaMea) + " of specific word");

    }

    // Exercitii din slideul Advanced Features pagina 86
    private static int countWords(List<String> fileLines) {
        int words = 0;
        for (String line : fileLines) {
            words += line.split(" ").length;
        }
        return words;
    }

    private static int countOneWord(List<String> fileLines) {
        int words = 0;
        for (String line : fileLines) {
            words += line.split("Lorem").length - 1;
        }
        return words;
    }


}



