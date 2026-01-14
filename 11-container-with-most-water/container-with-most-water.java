class Solution {
    public int maxArea(int[] height) {
       int i=0;
       int j=height.length-1;
       int max_water=0;
       while(i<j){
           int heights=Math.min(height[i],height[j]);
           int width=j-i;
           int total_water=heights*width;
           
           max_water=Math.max(max_water,total_water);
           if(height[j]>=height[i]){
            i++;
           }
           else{
            j--;
           }
       }
       return max_water;
    }
}