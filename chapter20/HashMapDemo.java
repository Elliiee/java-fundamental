package chapter20;
import java.util.*;
class HashMapDemo {
    public static void main(String[] args){
        HashMap<String, Double> hm = new HashMap<>();
        hm.put("John", 3434.34);
        hm.put("Tom", 123.22);

        //Display the set 
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John");
        hm.put("John", balance + 1000);
        System.out.println("John's new balance: " + hm.get("John"));

    }
}
