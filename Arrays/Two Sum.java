/*
LeetCode 1 - Two Sum

Problem:
Find the indices of the two numbers that add up to the target.

Approach:
- Use a HashMap to store previously visited numbers and their indices.
- For each element, check if its complement exists in the map.
- If found, return both indices.
- Otherwise, store the current element in the map.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            int complement= target- nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);

        }
        return new int[]{};
    }
}
