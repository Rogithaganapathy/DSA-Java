/*
LeetCode 345 - Reverse Vowels of a String

Problem:
Reverse only the vowels in a given string.

Approach:
- Use two pointers starting from both ends of the string.
- Move the pointers until vowels are found.
- Swap the vowels and continue until the pointers meet.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char [] arr= s.toCharArray();

        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(!set.contains(arr[left])){
                left++;
            }
            else if(!set.contains(arr[right])){
                right--;
            }
            else{
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;

                left++;
                right--;
            }
           

        }  
        return new String(arr);
    }
}
