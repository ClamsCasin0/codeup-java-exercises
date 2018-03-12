package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    //Test Methods
    public static void main(String[] args) {

//        String filePath = "src/util/tester.txt";

        //test slurp
//        List<String> results = FileHelper.slurp(filePath);
//        System.out.println(results);

        //test spit
        //1
//        List<String> testEntries = new ArrayList<>();
//        testEntries.add("entry_1");
//        testEntries.add("entry_2");
//        testEntries.add("entry_3");
//        FileHelper.spit(filePath, testEntries);
//
//        List<String> results = FileHelper.slurp(filePath);
//        System.out.println(results);

        //2
//        List<String> testEntries = new ArrayList<>();
//        testEntries.add("entry_4");
//        testEntries.add("entry_5");
//        FileHelper.spit(filePath, testEntries, true);
//
//        List<String> results = FileHelper.slurp(filePath);
//        System.out.println(results);

        //test makeExciting
//        FileHelper.makeExciting(filePath);
//        List<String> results = FileHelper.slurp(filePath);
//        System.out.println(results);

    }


    public static List<String> slurp(String filepath) {
                //creates filepath
              Path path = Paths.get(filepath);

                try {
                       return Files.readAllLines(path);
                    } catch (IOException e) {
                        System.out.printf("Error while attempting to slurp %s: %s\n", filepath, e.getMessage());
                        System.exit(1); //make runtimeException for runtime benefit
//                        throw new RuntimeException();
                        return new ArrayList<>(); // unreachable statement
                    }
            }




        //sets/allows method call for makeExciting(); , allows boolean value to eb called
    public static void spit(String filename, List<String> contents) {
               spit(filename, contents, false);
            }



            public static void spit(String filename, List<String> contents, boolean append) {
                // sets the file to open mode,
                // method either appends to an existing file,
                // or overwrites the existing contents
                StandardOpenOption option = append ? StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING;

                Path path = Paths.get(filename);

                        // creates parent pathway (directories)
                        //Files.write will create the file if it doesnt exist, but not directory
                    if (! Files.exists(path)) {
                        try {                        //added .getParent() to path.
                            Files.createDirectories(path.getParent());
                            Files.createFile(path);
                        } catch (IOException e) {
                            System.out.printf("Error creating file %s: %s\n", path, e.getMessage());
                            System.exit(1); //make runtime exception for runtime benefit
//                                throw new RuntimeException();
                            }
                    }

                        // writes file content
                        try {
                        Files.write(path, contents, option);
                        } catch (IOException e) {
                            System.out.printf("Error writing contents to %s: %s\n", filename, e.getMessage());
                            System.exit(1);  //make runtime exception
//                              throw new RuntimeException();
                   }
            }




    public static void makeExciting(String filename) {

                List<String> excitedLines = new ArrayList<>();

                        for(String line : slurp(filename)) {
                        String excitedLine = line.toUpperCase() + "!";
                        excitedLines.add(excitedLine);
                    }

                        spit(filename, excitedLines);
            }


}
