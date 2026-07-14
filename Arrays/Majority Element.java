/*
LeetCode 169 - Majority Element

Problem:
Find the element that appears more than ⌊n / 2⌋ times in the array.

Approach:
- Use the Boyer-Moore Voting Algorithm.
- Maintain a candidate and a count.
- If the count becomes zero, choose the current element as the new candidate.
- Increase the count if the current element matches the candidate,
  otherwise decrease the count.
- The final candidate is the majority element.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return -1;
        
    }
}
