/*
LeetCode 125 - Valid Palindrome

Problem:
Determine whether a string is a palindrome after ignoring
non-alphanumeric characters and case differences.

Approach:
- Use two pointers.
- Move the pointers inward while skipping non-alphanumeric characters.
- Compare the characters ignoring case.
- If all corresponding characters match, the string is a palindrome.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right= s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            else{
                char l= Character.toLowerCase(s.charAt(left));
                char r= Character.toLowerCase(s.charAt(right));
                if(l!=r){
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;
        
    }
}
