/*
LeetCode 136 - Single Number

Problem:
Find the element that appears only once in the array where every
other element appears twice.

Approach:
- Use the XOR operation.
- XOR all elements in the array.
- Equal numbers cancel each other out.
- The remaining value is the single number.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            if(map.containsKey(num)){
                map.put(num , map.get(num) +1);
           }else{
            map.put(num,1);
           }       
       }
       for(Integer key : map.keySet()){
        if(map.get(key) == 1){
            return key;
        }
       }
       return -1;
        
    }
}
