package ncode.n150.SlidingWindow;
import java.util.*;
class SWSolution{
    //Best Time to Buy And Sell Stock 
    public int maxProfit(int[] prices){
        int left = 0; 
        int right = 1; 
        int maxProfit = 0; 

        while (right < prices.length){
            if (prices[left] < prices[right]){
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right; // move left to right index 
            }
            right++; //right increases every time 
        }
        return maxProfit; 
    }

    //Longest Substring Without Repeating Characters 
    //use hashmap to remember the index of the characters
    //if there is duplicated characters, move to the new window and start again. 
    public int lengthOfLongestSubstring(String s){
        int longest = 0; 
        Map<Character, Integer> map = new HashMap<>(); 
        for (int left = 0, right = 0; right < s.length(); right++){
            if (map.containsKey(s.charAt(right))){
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            longest = Math.max(longest, right - left + 1);
            map.put(s.charAt(right), right); 
        }
        return longest; 
    }


    //Longest Repeating Character Replacement 
    public int characterReplacement(String s, int k){
        int[] freq = new int[26];
        int mostFreq = 0; 
        int left = 0; 
        int longest = 0; 

        for (int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;

            mostFreq = Math.max(mostFreq, freq[s.charAt(right) - 'A']);

            if (right - left + 1 - mostFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++; 
            }

            longest = Math.max(longest, right - left + 1);
        }
        return longest; 
    }

    //Permutation in String 
    //return true if one of s1's permutations is the substring of s2
    public boolean checkInclusion(String s1, String s2){
        int s1length = s1.length();
        int s2length = s2.length();

        if (s1length > s2length) return false; 

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>(); 

        for (char c : s1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s2length; i++){
            map2.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0) + 1);

            if (i >= s1length){
                char leftChar = s2.charAt(i - s1length);
                if (map2.get(leftChar) == 1){
                    map2.remove(leftChar);
                } else {
                    map2.put(leftChar, map2.get(leftChar) - 1);
                }
            }

            if (map1.equals(map2)) return true; //permutation found 
        }
        return false; //no permutation found 
    }

    //using array is almost 2 times faster than hashmap 
    public boolean checkInclusion2(String s1, String s2){
        int s1length = s1.length(), s2length = s2.length();
        if (s1length > s2length) return false; 

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for (char c : s1.toCharArray()){
            s1freq[c - 'a']++;
        }

        for (int i = 0; i < s2length; i++){
            s2freq[s2.charAt(i) - 'a']++;
            
            if (i >= s1length){
                char leftChar = s2.charAt(i - s1length);
                s2freq[leftChar - 'a']--;
            }

            if (Arrays.equals(s1freq, s2freq)) return true; 
        }
        return false; 
    }

    //Minimum Window Substring 
    public String minWindow(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int matched = 0;
        int left = 0; 
        int minLen = s.length() - 1; 
        int subStr = 0; 
        
        for (int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)){
                map.put(rightChar, map.get(rightChar) - 1);

                if (map.get(rightChar) == 0) matched++;
            }

            while (matched == map.size()){
                if (minLen > right - left + 1){
                    minLen = right - left + 1;
                    subStr = left; 
                }
                char deleted = s.charAt(left++);
                if (map.containsKey(deleted)){
                    if (map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        return minLen > s.length() ? "" : s.substring(subStr, subStr + minLen);
        //this algorithm is too complicated for me to even remeber the steps. 
        //too much for me now !
    }

    //Sliding Window Maximum 
    //monotonic stack 
    public int[] maxSlidingWindow(int[] nums, int k){
        int[] ans = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>(); 

        for (int i = 0; i < nums.length; i++){
            while (!deque.isEmpty() && nums[i] > nums[deque.peekLast()]){
                deque.pollLast(); //if current nums[i] is bigger than the top of the stack, pop out
            }
            deque.addLast(i); //pop out all the smaller than num[i] on the stack, add it to the stack
            //so the stack is a decreasing order, the bottom is the largest 
            //note, the stack remembers the index of the elements, so it's the index only 
            //this ways we can get the counts later 

            if (deque.peekFirst() == i - k){
                deque.pollFirst(); //out of the window, the bottom of the stack is no longer valid 
                //even though the bottom is the biggest number 
            }

            if (i >= k - 1){ //i + 1 >= k, window of length k 
                ans[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return ans; 
    }
}
