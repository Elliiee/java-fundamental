package chapter22;
import java.io.*;
class FileOutputStreamDemo {
    public static void main(String[] args){
        String source = "Now is the time for all good men\n"
        + " to come to the aid of their country\n"
        + " and pay their dur taxes.";
        byte[] buf = source.getBytes();
        
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
            FileOutputStream f1 = new FileOutputStream("file2.txt");
            FileOutputStream f2 = new FileOutputStream("file3.txt"))
            {
            //write to first file 
            for (int i = 0; i < buf.length; i += 2){ 
                f0.write(buf[i]);
            }

            //write to second file 
            f1.write(buf);

            //write to third file 
            f2.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch(IOException e){
            System.out.println("An I/O Error Occurred");
        } 
    }
}
