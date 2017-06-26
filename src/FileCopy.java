import java.io.*;
import java.nio.file.Files;

/**
 * Created by miral on 6/24/2017.
 * 1. Write a program to copy and paste a file to other location
 */
public class FileCopy {

    public static void copyFile(File oldLocation, File newLocation) throws IOException {
        Files.copy(oldLocation.toPath(),newLocation.toPath());
    }


    public static void main(String[] args) {
        File source=new File("C:\\Users\\miral\\IdeaProjects\\Java8Features\\src\\source.txt");
        File destination=new File("C:\\Users\\miral\\IdeaProjects\\Java8Features\\src\\destination.txt");
       try {
           FileCopy.copyFile(source, destination);
       }
       catch (IOException ex)
       {
           System.out.println("Error" +ex.getMessage());
       }
    }
}
