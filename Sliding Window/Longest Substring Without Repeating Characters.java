/*
LeetCode 3 - Longest Substring Without Repeating Characters

Problem:
Find the length of the longest substring without repeating characters.

Approach:
- Use a sliding window with two pointers.
- Expand the window by moving the right pointer.
- If a duplicate character is found, shrink the window from the left
  until all characters are unique.
- Track the maximum window size.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        int n=s.length();
        HashSet<Character>set=new HashSet<>();
        for(int right=0;right<n;right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
