package chapter30;
import java.util.*;
import java.util.stream.*;

class StreamDemo {
    public static void main(String[] args){
        //create a list of Integer values 
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("original list; " + myList);

        //obtain a Stream to the array list 
        Stream<Integer> myStream = myList.stream();

        //obtain the min value and max value 
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()){
            System.out.println("min valu: " + minVal.get());
        }

        //must obtain a new stream because previous call to min()
        //is a terminal operation that consumed the stream
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()){
            System.out.println("max value: " + maxVal.get());
        }

        //sort the stream by use of sorted()
        Stream<Integer> sortedStream = myList.stream().sorted();

        //display the sorted stream by use of forEach()
        System.out.print("Sorted stream: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //display only the odd values by use of filter()
        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.print("Odd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();

        //display only the odd values that are greater than 5.
        //notice that two filter operations are pipelined.
        oddVals = myList.stream().filter(n -> (n % 2) == 1).filter(n -> n > 5);
        System.out.print("odd values greater than 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
