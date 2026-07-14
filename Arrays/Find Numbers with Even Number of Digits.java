/*
LeetCode 1295 - Find Numbers with Even Number of Digits

Problem:
Count how many numbers in the array contain an even number of digits.

Approach:
- Traverse each number in the array.
- Count the number of digits in each number.
- If the digit count is even, increment the answer.
- Return the total count.

Time Complexity: O(n × d)
Space Complexity: O(1)

where n is the number of elements and d is the number of digits in a number.
*/

class Solution {
    public int findNumbers(int[] nums) {
        int evenDigit=0;
        for(int i=0; i<nums.length; i++){
            int digits=0;
            int num=nums[i];
            while(num>0){
                digits++;
                num=num/10;
            }
            if(digits%2==0){
                evenDigit++;
            }
        }
        return evenDigit;
        
    }
}
