/*
LeetCode 567 - Permutation in String

Problem:
Determine whether one string's permutation exists as a substring
of another string.

Approach:
- Use a fixed-size sliding window.
- Compare the character frequencies of the window with the first string.
- Slide the window across the second string until a match is found.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] s1Freq=new int[26];
        int[] windowFreq=new int[26];

        for(char c : s1.toCharArray()){
            s1Freq[c-'a']++;
        }

        for(int i=0;i<s1.length();i++){
            windowFreq[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(s1Freq,windowFreq)){
            return true;
        }
        for(int right=s1.length();right<s2.length();right++){
            windowFreq[s2.charAt (right - s1.length() )-'a']--;
            windowFreq[s2.charAt(right)-'a']++;

            if(Arrays.equals(s1Freq,windowFreq)){
                return true;
            }
        }
        return false;
    }
}
