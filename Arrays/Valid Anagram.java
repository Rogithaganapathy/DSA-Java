/*
LeetCode 242 - Valid Anagram

Problem:
Determine whether two strings are anagrams of each other.

Approach:
- Count the frequency of each character in both strings.
- Compare the character frequencies.
- If all frequencies match, the strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(1)class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for( int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            
        }
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(! map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch)-1);
            if(map.get(ch)<0){
                return false;
            }

        }
        return true;
    }
}
*/

