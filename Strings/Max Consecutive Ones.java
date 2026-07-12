/*
LeetCode 485 - Max Consecutive Ones

Problem:
Find the maximum number of consecutive 1's in a binary array.

Approach:
- Traverse the array once.
- Count consecutive 1's.
- Reset the count when a 0 is encountered.
- Track the maximum count.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                count++;
                max= Math.max(max,count);
            }
            else{
                count=0;
            }
      }
      return max;
        
    }
}
