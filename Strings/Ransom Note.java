/*
LeetCode 383 - Ransom Note

Problem:
Determine whether a ransom note can be constructed using the
characters from a magazine.

Approach:
- Count the frequency of each character in the magazine.
- Traverse the ransom note.
- Decrease the corresponding character count.
- If any count becomes negative, return false.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch,map.get(ch)-1);

            if(map.get(ch)<0){
                return false;
            }
        }
        
        return true;
    }
}
