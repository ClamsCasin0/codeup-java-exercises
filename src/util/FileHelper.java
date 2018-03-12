package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {


    public static List<String> slurp(String filepath) {
              Path path = Paths.get(filepath);
                try {
                       return Files.readAllLines(path);
                    } catch (IOException e) {
                        System.out.printf("Error when trying to slurp %s: %s\n", filepath, e.getMessage());
                        System.exit(1);
                        return new ArrayList<>(); // we'll never get here, but the compiler doesn't know that
                    }
            }

    public void spit(String filename, List<String> contents[, boolean append]) {

        String directory;
        String filename;
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

    }

    public void makeExciting(String filename) {
//        List<String> readme = Files.readAllLines(Paths.get("README.md"));
        ArrayList<String> lowerCasedReadme = new ArrayList<>();

        for(String line : readme) {
            lowerCasedReadme.add(line.toLowerCase());

        }
        Files.write(Paths.get("README-lowercased.md"), lowerCasedReadme);
    }


}
