package chapter31;
//Use find() method to find a subsequence 
import java.util.regex.*;

public class RegExpr2 {
    public static void main(String[] args){
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java SE");

        System.out.println("Looking for Java in Java SE.");

        //find() method used to find the subsequence matching
        if (mat.find()) System.out.println("Subsequence found");
        else System.out.println("No Match");
    }
}
