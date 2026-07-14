/*
LeetCode 13 - Roman to Integer

Problem:
Convert a Roman numeral into its corresponding integer value.

Approach:
- Traverse the string from left to right.
- If the current symbol is smaller than the next symbol,
  subtract its value.
- Otherwise, add its value.
- Return the final sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;

        for(int i=0;i<s.length();i++){
            int current = map.get(s.charAt(i));

            if(i<s.length()-1 && current< map.get(s.charAt(i+1))){
                result-=current;

            }
            else{
                result+=current;
            }
        }
        return result;
        
    }
}
