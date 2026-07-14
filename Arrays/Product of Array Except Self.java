/*
LeetCode 238 - Product of Array Except Self

Problem:
Return an array where each element is the product of all
elements except itself.

Approach:
- Compute prefix products from left to right.
- Compute suffix products from right to left.
- Multiply the prefix and suffix products for each index.
- Return the resulting array.

Time Complexity: O(n)
Space Complexity: O(1)

excluding the output array.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] left=  new int[n];
        int[] right= new int[n];
        int[] answer = new int[n];
        left[0] = 1;
        for( int i=1;i<n;i++){
            left[i]= left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]= right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            answer[i]= left[i]*right[i];
        }
        return answer;
    }
}
