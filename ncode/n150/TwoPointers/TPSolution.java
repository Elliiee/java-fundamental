package ncode.n150.TwoPointers;
import java.util.*;
class TPSolution {
    //Valid Palindrome
    public boolean isPalindrome(String s){
        int left = 0; 
        int right = s.length() - 1; 
        while (left < right){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue; //skip the rest steps, go to next while loop
            }
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue; //skip the rest steps, go to next while loop
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    //Two Sum II Input Array Is Sorted 
    public int[] twoSum(int[] nums, int target){
        int left = 0; 
        int right = nums.length - 1; 
        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                break; //break out of the while loop completely 
            }else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[]{left + 1, right + 1}; //1-indexed 
    }

    //3Sum 
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int target = 0 - nums[i];
                int left = i + 1; 
                int right = nums.length - 1; 
                while (left < right){
                    if (nums[left] + nums[right] == target){
                        List<Integer> list = new ArrayList<>(); 
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);

                        while (left < right && nums[left] == nums[left + 1]){
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] > target){
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return res; 
    }

    //Container With Most Water 
    public int maxArea(int[] height){
        int left = 0; 
        int right = height.length - 1; 
        int res = 0; 
        while (left < right){
            int length = right - left; 
            int area = length * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if (height[left] < height[right]){ //keep the higher, move the shorter 
                left++;
            } else {
                right--;
            }
        }
        return res; 
    }

    //Trapping Rain Water 
    /*
     * Given n non-negative integers representing an elevation map 
     * where the width of each bar is 1, compute how much water it can trap after raining.
     */
    //for me, this is easier to understand and to use by myself. 
    //but apparently, the next approach is better, less memory needed. 
    public int trap(int[] heights){
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int max = heights[0]; 
        int res = 0; 

        for (int i = 0; i < heights.length; i++){
            left[i] = Math.max(heights[i], max); //left[i] is the max value between [0, i]
            max = left[i]; //max is the left[i] which is the max value between [0, i]
        }

        max = heights[heights.length - 1];
        for (int i = heights.length - 1; i >= 0; i--){
            right[i] = Math.max(right[i], max); //right[i] is the max value between [i, length - 1]
            max = right[i]; //max is the right[i] which is the max value between [i, length - 1]
            //but max will change when index changes, it only helps the right[i] get the max value
        }

        for (int i = 0; i < heights.length; i++){
            //the water will be trapped between the maxLeft and maxRight
            //but the water can only go as high as the shorter height, so use Math.min() 
            res += Math.min(left[i], right[i]) - heights[i];
        }
        return res; 
    }

    public int trap2(int[] heights){
        if (heights.length == 0) return 0; 

        int left = 0;
        int right = heights.length - 1; 
        int leftMax = heights[left];
        int rightMax = heights[right];
        int res = 0; 

        while (left < right){
            if (leftMax < rightMax){
                left++;
                leftMax = Math.max(leftMax, heights[left]);
                res += leftMax - heights[left]; 
            } else {
                right--;
                rightMax = Math.max(rightMax, heights[right]);
                res += rightMax - heights[right];
            }
        }
        return res; 
    }
}
