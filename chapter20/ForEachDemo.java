package chapter20;
import java.util.*;
class ForEachDemo {
    public static void main(String[] args){
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //use for loop to display the values 
        System.out.print("Contents of vals: ");
        for (int v : vals)
            System.out.print(v + " ");
        System.out.println();
        
        //sum
        int sum = 0;
        for (int v : vals)
            sum += v;
        System.out.println("Sum of values: " + sum);
    }
}
