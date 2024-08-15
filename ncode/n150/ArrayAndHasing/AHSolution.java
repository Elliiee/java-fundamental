package ncode.n150.ArrayAndHasing;
import java.util.*;
class AHSolution {
    //Contains Duplicate 
    public boolean containsDuplicate(int[] nums){
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (uniques.contains(nums[i])){
                return true; 
            }
            uniques.add(nums[i]);
        }
        return false; 
    }

    //Valid Anagram
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) return false; 

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++){
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store){
            if (n != 0) return false; 
        }
        return true; 
    }

    //Two Sum
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i); //current value and it's index 
        }
        return new int[]{};
    }

    //Group Anagrams
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> hm = new HashMap<>();

        for (String s : strs){
            int[] count = new int[26];

            for (char c : s.toCharArray()){
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(s);
        }
        return new ArrayList<>(hm.values());
        //直接把hashmap的values()放到new ArrayList 里面
    }

    public List<List<String>> groupAnagrams2(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); //直接把char arrays 放到new String() 里面
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    //Top K Frequent Elements 
    //solution 1 heap 
    public int[] topKFrequent(int[] nums, int k){
        int[] arr = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> (a.getValue() - b.getValue()) //lambda compare
        );
        for (Map.Entry<Integer, Integer> it : map.entrySet()){
            pq.add(it);
            if (pq.size() > k){
                pq.poll();
            }
        }

        int i = k;
        while (!pq.isEmpty()){
            arr[--i] = pq.poll().getKey();
        }
        return arr;
    }

    //Top K Frequent Elements 
    //solution 2
     

    //Encode and Decode Strings 
    public String encode(List<String> strs){
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs){
            encodedString.append(str.length()).append("#").append(str);
            //append()可以连续使用
        }
        return encodedString.toString();
    }

    public List<String> decode(String str){
        List<String> list = new ArrayList<>();
        int i = 0; 
        while (i < str.length()){
            int j = i; 
            while (str.charAt(j) != '#'){
                j++;
            }
            //length 可能好几位数
            int length = Integer.valueOf(str.substring(i, j));
            i = j + 1 + length; 
            list.add(str.substring(j + 1, i));
        }
        return list; 
    }

    //Product of Array Except Self 
    public int[] productExceptSelf(int[] nums){
        int[] arr = new int[nums.length];
        int right = 1; 
        int left = 1; 
        for (int i = 0; i < nums.length; i++){
            arr[i] = left; 
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--){
            arr[i] *= right; //product 
            right *= nums[i];
        }
        return arr; 
    }

    public int[] productExceptSelf2(int[] nums){
        int[] arr = new int[nums.length];
        arr[0] = 1;

        for (int i = 0; i < nums.length; i++){
            arr[i + 1] = arr[i] * nums[i]; //left product
        }
        for (int i = nums.length - 2; i >= 0; i--){
            arr[i] *= nums[i + 1]; //left product multiply right product 
            nums[i] *= nums[i + 1]; 
            //current nums[i] become the product of [i to length - 1] inclusive
        }
        return arr; 
    }

    //Valid Sudoku
    public boolean isValidSudoku(char[][] board){
        Set<Character> rowSet = null;
        Set<Character> colSet = null;

        for (int i = 0; i < 9; i++){
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int j = 0; j < 9; j++){
                char r = board[i][j]; 
                char c = board[j][i];
                if (r != '.'){
                    if (rowSet.contains(r)){
                        return false; 
                    } else {
                        rowSet.add(r);
                    }
                }
                if (c != '.'){
                    if (colSet.contains(c)){
                        return false; 
                    } else {
                        colSet.add(c);
                    }
                }
            }
        }

        for (int i = 0; i < 9; i += 3){
            for (int j = 0; j < 9; j += 3){
                if (!checkBlock(i, j, board)){
                    return false; 
                }
            }
        }
        return true; //row, col, block, all valid at this moment 
    }

    public boolean checkBlock(int idxI, int idxJ, char[][] board){
        Set<Character> blockSet = new HashSet<>();
        for (int i = idxI; i < idxI + 3; i++){
            for (int j = idxJ; j < idxJ + 3; j++){
                if (board[i][j] == '.'){
                    continue; //no data, continue to the next loop
                } 
                if (blockSet.contains(board[i][j])){
                    return false; //data duplicate, invalid 
                }
                blockSet.add(board[i][j]); //new data, add to set 
            }
        }
        return true; //block is valid return true 
    }

    //Longest Consecutive Sequence 
    public int longestConsecutive(int[] nums){
        if (nums.length == 0){
            return 0; 
        }

        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums){
            hs.add(num);
        }

        int longest = 1; 
        for (int num : nums){
            if (!hs.contains(num - 1)){
                int count = 1; 
                while (hs.contains(num + 1)){
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
            if (longest > nums.length / 2) break;
        }
        return longest; 
    }


}
