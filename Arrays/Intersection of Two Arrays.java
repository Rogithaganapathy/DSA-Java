/*
LeetCode 349 - Intersection of Two Arrays

Problem:
Find the unique intersection of two arrays.

Approach:
- Store the elements of one array in a HashSet.
- Traverse the second array.
- If an element exists in the set, add it to the result set.
- Return the unique intersection.

Time Complexity: O(n + m)
Space Complexity: O(n)
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result= new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] answer =  new int[result.size()];
        int index=0;
        for(Integer num:result){
            answer[index]= num;
            index++;
        }
        return answer;
    }
}
