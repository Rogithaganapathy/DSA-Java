/*
LeetCode 387 - First Unique Character in a String

Problem:
Find the index of the first non-repeating character in a string.

Approach:
- Count the frequency of each character.
- Traverse the string again.
- Return the index of the first character with a frequency of one.
- Return -1 if no unique character exists.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) ==1){
                return i;
            }
        }
        return -1;
        
    }
}
