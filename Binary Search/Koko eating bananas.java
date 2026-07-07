/*
LeetCode 875 - Koko Eating Bananas

Problem:
Find the minimum eating speed so Koko can finish all bananas
within the given number of hours.

Approach:
- Apply Binary Search on the possible eating speeds.
- For each speed, calculate the total hours needed.
- If Koko can finish on time, try a smaller speed.
- Otherwise, increase the speed.

Time Complexity: O(n log m)
Space Complexity: O(1)

where n is the number of piles and m is the maximum pile size.
*/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        int ans= right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if (canFinish(piles,h,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
                
        }
        return ans;     
    }

    public boolean canFinish(int [] piles,int h,int speed){
        long hours=0;
        for(int pile:piles){
            hours +=
            (long)(pile + speed - 1) / speed;
        }
        return hours<=h;
    }
