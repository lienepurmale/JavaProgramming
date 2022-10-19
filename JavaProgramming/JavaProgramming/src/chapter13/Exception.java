package chapter13;

import java.io.File;
import java.io.IOException;

public class Exception  {

    public static void main(String arg[]) throws IOException {

        createNewFile();
        createNewFileRethrow();
    }

    public static void createNewFile() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Path does not exist.");
            e.printStackTrace();

        }
    }

    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
        
    }


}
