package chapter22;
import java.io.*;
class DirListOnly {
    public static void main(String[] args){
        String dirname = "/java";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String[] s = fl.list(only);
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
