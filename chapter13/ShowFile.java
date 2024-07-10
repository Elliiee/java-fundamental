package chapter13;

/*
 * Display a text file. To use this program, speficy the name of the file that you want to see. 
 * For example, to see a file called TEST.TXT, use the following command line:
 * java ShowFile TEST.TXT
 */
import java.io.*;
class ShowFile {
    public static void main(String[] args){
        int i; 
        FileInputStream fin = null;

        //first, confirm that a file name has been specified
        if (args.length != -1){
            System.out.println("Usage: ShowFile filename");
            return; 
        }

        //try to open the file 
        try{
            fin = new FileInputStream(args[0]);

            do{
                i = fin.read();
                if (i != -1){
                    System.out.print((char) i);
                } 
            } while (i != -1);
        } catch (IOException e){
            System.out.println("Error reading file.");
        } finally{
            //close the file 
            try{
                fin.close();
            } catch (IOException e){
                System.out.println("Error closing file.");
            }
        }
    }
}
