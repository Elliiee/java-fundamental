package ncode.n150.ArrayAndHasing;
import java.util.*;
class ContainsDuplicate {
    public boolean containsDup(int[] nums){
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (uniques.contains(nums[i])){
                return true; 
            }
            uniques.contains(nums[i]);
        }
        return false; 
    }
}
