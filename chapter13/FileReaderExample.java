package chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args){
        String filepath = "chapter13/Test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            } 
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
