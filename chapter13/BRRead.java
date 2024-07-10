package chapter13;
import java.io.*;
//use a BufferedReader to read characters from the console. 
class BRRead {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Enter characters, 'q' to quit.");

        //read character
        do{
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
