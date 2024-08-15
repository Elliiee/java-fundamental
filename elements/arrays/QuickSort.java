package elements.arrays;
import java.util.*;
class QuickSort {
    public enum Color {RED, WHITE, BLUE};

    public static void dutchFlagPartition(int pivotIndex, List<Color> A){
        Color pivot = A.get(pivotIndex);

        //first, group elements smaller than pivot
        for (int i = 0; i < A.size(); i++){
            for (int j = i; j < A.size(); j++){
                if (A.get(j).ordinal() < pivot.ordinal()){
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }

        //second, group elements larger than pivot 
        for (int i = A.size() - 1; i >= 0; i--){
            for (int j = i; j >= 0; j--){
                if (A.get(j).ordinal() > pivot.ordinal()){
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] A = {0, 1, 2, 0, 2, 1, 1};
        //ArrayList<Integer> AA = new ArrayList<>(Arrays.asList(A));
        //dutchFlagPartition(2, AA);
        for (int i : A){
            System.out.print(i + " ");
        }
    }
}
