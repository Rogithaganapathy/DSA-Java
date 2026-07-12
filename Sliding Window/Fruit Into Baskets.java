/*
LeetCode 904 - Fruit Into Baskets

Problem:
Find the maximum number of fruits that can be collected using
at most two types of fruits.

Approach:
- Use a sliding window.
- Expand the window while it contains at most two fruit types.
- If more than two types are present, shrink the window.
- Track the maximum window size.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int right;
        int maxlength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(right=0;right<fruits.length;right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){

                map.put(fruits[left],map.get(fruits[left])-1);

                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
