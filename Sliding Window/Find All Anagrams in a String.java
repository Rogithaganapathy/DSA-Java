/*
LeetCode 438 - Find All Anagrams in a String

Problem:
Find all starting indices of anagrams of a pattern in a string.

Approach:
- Use a fixed-size sliding window.
- Maintain character frequencies for the pattern and current window.
- Compare the frequencies after each window slide.
- Record the starting index whenever they match.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int[] pFreq=new int[26];
        int[] windowFreq =new int[26];

        for(char ch: p.toCharArray()){
            pFreq[ch-'a']++;
        }

        int k=p.length();
        for(int i=0;i<k;i++){
            windowFreq[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(pFreq,windowFreq)){
            result.add(0);
        }

        for(int right=k;right<s.length();right++){
            windowFreq[s.charAt(right-k)-'a']--;
            windowFreq[s.charAt(right)-'a']++;
            int start=right-k+1;
            if(Arrays.equals(pFreq,windowFreq)){
                result.add(start);
            }

        }
        return result;
    }

}
