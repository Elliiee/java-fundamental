package elements.arrays;
import java.util.*;
class EvenOddArray {
    public static void evenOdd(List<Integer> A){
        int even = 0;
        int right = A.size() - 1; 
        while (even < right){
            if (A.get(even) % 2 == 0){
                even++;
            } else {
                Collections.swap(A, even, right--); //move the odd number to the right side 
                //now the previous "right" index will be the current new even
                //it will compare again
            }
        }
    }
}
