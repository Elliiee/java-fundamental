package chapter31;

import java.util.regex.*;

public class RegExpr3 {
    //find() method can be used to repeated find the matches in the left subsequence 
    public static void main(String[] args){
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 test");
        while (mat.find()){
            System.out.println("test found at index " + mat.start());
        }
    }
}
