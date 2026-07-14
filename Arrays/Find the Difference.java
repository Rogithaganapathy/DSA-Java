/*
LeetCode 389 - Find the Difference

Problem:
Find the extra character added to one string.

Approach:
- Count the frequency of characters in both strings.
- Compare the frequencies.
- The character with an unmatched frequency is the answer.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public char findTheDifference(String s, String t) {
       char result=0;
       for(int i=0;i<s.length();i++){
           result^=s.charAt(i);
       }
       for(int i=0;i<t.length();i++){
           result^=t.charAt(i);
       }
       return result;
       
    }
}
