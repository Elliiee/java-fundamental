package chapter20;
import java.util.*;
class SpliteratorDemo {
    public static void main(String[] args){
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        //use tryAdvance() to display contents of vals 
        System.out.print("Contents of vals: \n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //
    }
}
