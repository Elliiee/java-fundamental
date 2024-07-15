package chapter20;
import java.util.*;
class ArraysDemo {
    public static void main(String[] args){
        //Allocate an initialize array
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = -3 * i;
        }

        //display, sort, display again
        System.out.print("Original cotents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);

        //fill and display the array
        Arrays.fill(array, 2, 6, -1);
        System.out.print("After sorting again: ");
        display(array);

        //display, sort, display again
        System.out.print("Original cotents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);

        //binary search for -9
        System.out.print("The value -9 is at location ");
        int index = Arrays.binarySearch(array, -9);

        System.out.println(index);


    }

    static void display(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
