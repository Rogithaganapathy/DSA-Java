/*
LeetCode 853 - Car Fleet

Problem:
Find the number of car fleets that will arrive at the destination.

Approach:
- Sort cars based on their positions.
- Traverse from the car closest to the destination.
- Calculate the time each car takes to reach the target.
- Use a stack to merge cars that form the same fleet.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        double[][] cars=new double[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]= (double)(target-position[i])/speed[i];
        }
        Arrays.sort(cars,(a,b)-> Double.compare( (double)a[0],(double)b[0]) );
        int fleets=0;
        double currentFleet=0;
        for(int i=n-1;i>=0;i--){
            if(cars[i][1]> currentFleet){
                fleets++;
                currentFleet=cars[i][1];
            }
           
        }
        return fleets;
    
    
    }
}
