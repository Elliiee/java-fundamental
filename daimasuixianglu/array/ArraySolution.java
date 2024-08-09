package daimasuixianglu.array;

class ArraySolution {
    //704
    //左闭右闭区间
    public int search(int[] nums, int target){
        //避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]){
            return -1; 
        }
        int left = 0; 
        int right = nums.length - 1; 
        while (left <= right){
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target){
                return mid; 
            } else if (nums[mid] < target){
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }
        return -1; 
    }

    //左闭右开区间
    public int searchII(int[] nums, int target){
        int left = 0; 
        int right = nums.length; 
        while (left < right){
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target){
                return mid; 
            } else if (nums[mid] < target){
                left = mid + 1; //already ruled out mid, so left = mid + 1 
            } else {
                right = mid; // not include right, no need + 1
            }
        }
        return -1; 
    }

    //27. remove element
    public int removeElement(int[] nums, int val){
        int slowIndex = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[slowIndex++] = nums[i];
            }
        }
        return slowIndex; 
    }

    //977. squares of a sorted array 
    public int[] sortedSquares(int[] nums){
        int left = 0; 
        int right = nums.length - 1; 
        int[] result = new int[nums.length];
        int index = result.length - 1; 
        while (left <= right){
            if (nums[left] * nums[left] < nums[right] * nums[right]){
                result[index--] = nums[left] * nums[left];
                left++;
            } else {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }
        return result; 
    }

    //209. Minimum Size Subarray Sum 
    //sliding window
    public int minSubArrayLen(int s, int[] nums){
        int left = 0; 
        int sum = 0; 
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            while (sum >= s){
                result = Math.min(result, i - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result; 
    }

    //59. spiral matrix II 
    
}
