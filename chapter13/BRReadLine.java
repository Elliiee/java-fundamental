package chapter13;
import java.io.*;

class BRReadLine {
    public static void main(String[] args) throws IOException{
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        System.out.println("Enter lines of text.\n Enter 'stop' to quit.");

        //read character
        do{
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));
    }
}
