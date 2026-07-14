/*
LeetCode 14 - Longest Common Prefix

Problem:
Find the longest common prefix among an array of strings.

Approach:
- Assume the first string is the common prefix.
- Compare it with each remaining string.
- Shorten the prefix until it matches the beginning of every string.
- Return the final prefix.

Time Complexity: O(n × m)
Space Complexity: O(1)

where n is the number of strings and m is the length of the prefix.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs[0].length();i++){
            char ch= strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
