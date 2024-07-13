package chapter20;
import java.util.*;
public class MailList {
    public static void main(String[] args){
        LinkedList<Address> ml = new LinkedList<>();
        ml.add(new Address("West", "Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("West", "Ave", "Urbana", "IL", "61801"));

        for (Address element : ml){
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
