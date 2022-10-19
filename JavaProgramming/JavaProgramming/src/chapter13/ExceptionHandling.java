package chapter13;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String arg[]){


        createNewFile();

    }
    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        } catch (IOException e){
            System.out.println("Path does not exist.");
            e.printStackTrace();

        }
    }

}

