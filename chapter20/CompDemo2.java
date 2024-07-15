package chapter20;
import java.util.*;
class CompDemo2 {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<>((astr, bstr) -> bstr.compareTo(astr));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //Display the elements
        for (String element: ts){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
