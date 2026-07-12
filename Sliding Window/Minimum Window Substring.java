/*
LeetCode 76 - Minimum Window Substring

Problem:
Find the smallest substring that contains all the characters
of the target string.

Approach:
- Use a sliding window with two pointers.
- Expand the window until all required characters are included.
- Shrink the window while it remains valid.
- Track the minimum valid window found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        HashMap<Character,Integer> need =new HashMap<>();
        HashMap<Character,Integer> window =new HashMap<>();

        for(char c:t.toCharArray()){
            need.put(c, need.getOrDefault(c,0)+1);
        }

        int have=0;
        int needCount=need.size();
        int left=0;
        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            char c= s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);

            if(need.containsKey(c) && window.get(c).equals(need.get(c))){
                have++;
            }
            while(have==needCount){
                if((right-left+1) < minLen){
                    minLen=right-left+1;
                    start=left;
                }
                char remove=s.charAt(left);
                window.put(remove,window.get(remove)-1);
                if(need.containsKey(remove) && window.get(remove)<need.get(remove)){
                    have--;
                }
                left++;

            }
        }
        return minLen == Integer.MAX_VALUE ? "": s.substring(start,start+minLen);
    }
}
