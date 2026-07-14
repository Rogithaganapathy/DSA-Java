/*
LeetCode 268 - Missing Number

Problem:
Find the missing number in an array containing n distinct numbers
from the range [0, n].

Approach:
- Use the XOR operation.
- XOR all array elements and all numbers from 0 to n.
- Matching numbers cancel each other out.
- The remaining value is the missing number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected = n*(n+1)/2;
        int actual=0;
        for(int num:nums){
            actual+=num;
        }
        return expected-actual;
    }
}
