/*
LeetCode 58 - Length of Last Word

Problem:
Find the length of the last word in a given string.

Approach:
- Traverse the string from the end.
- Skip trailing spaces.
- Count the characters until a space or the beginning of the string
  is reached.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int i= s.length()-1;
        int count=0;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        
        return count;
    }
}
