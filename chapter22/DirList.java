package chapter22;
import java.io.File;
class DirList {
    public static void main(String[] args){
        String dirname = "dkk@danyis-MacBook-Pro java-fundamental";
        File fl = new File(dirname);

        if (fl.isDirectory()){
            System.out.println("Directory of " + dirname);
            String[] s = fl.list();

            for (int i = 0; i < s.length; i++){
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
