class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;int max_len=0;

        for(int j=0;j<nums.length;j++){
           if(nums[j]==1){
            count++;
            max_len=Math.max(count,max_len);
           }
           else{
            count=0;
           }
           
           
           
        }
        return max_len;
    }
    
}
