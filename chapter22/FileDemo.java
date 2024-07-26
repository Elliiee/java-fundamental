package chapter22;
import java.io.File;
class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        File fl = new File("/Users/dkk/git-projects/java-fundamental/copyright");
        p("File name: " + fl.getName());
        p("Path: " + fl.getPath());
        p("Absolute Path: " + fl.getAbsolutePath());
        p("Parent: " + fl.getParent());
        p(fl.exists() ? "exists" : "does not exist");
        p(fl.canWrite() ? "is writable" : "is not writeable");
        p(fl.canRead() ? "is readable" : "is not readable");
        p("is " + (fl.isDirectory() ? " " : "not a directory"));
        p(fl.isFile() ? "is normal file" : "might be a named pipe");
        p(fl.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + fl.lastModified());
        p("File size: " + fl.length() + " Bytes");
    }
}
