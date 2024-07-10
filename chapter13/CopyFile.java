package chapter13;
import java.io.*;
class CopyFile {
    public static void main(String[] args){
        int i; 
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2){
            System.out.println("Usage: CopyFile from to");
            return;
        }

        //copy a file
        try{
            //attempt to open the file 
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                i = fin.read();
                if (i != -1){
                    fout.write(i);
                } 
            } while (i != -1);
        } catch (IOException e){
            System.out.println("I/O Error: " + e);
        } finally {
            try{
                if (fin != null){
                    fin.close();
                }
            } catch (IOException e){
                System.out.println("Error closing Input file.");
            }

            try{
                if (fout != null){
                    fout.close();
                }
            } catch (IOException e){
                System.out.println("Error closing output file.");
            }
        }
    }
}
