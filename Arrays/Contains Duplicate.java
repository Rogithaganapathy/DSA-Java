/*
LeetCode 217 - Contains Duplicate

Problem:
Determine whether an array contains any duplicate elements.

Approach:
- Use a HashSet to store the elements.
- Traverse the array.
- If an element already exists in the set, return true.
- Otherwise, add the element to the set.
- Return false if no duplicates are found.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);

        }
        return false;
        
    }
}
