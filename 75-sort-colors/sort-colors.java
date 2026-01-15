class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                i++;
            }
            else if(nums[k]==1){
                j++;
            }
        }
        for(int a=0;a<i;a++){
            nums[a]=0;
        }
        for(int a=i;a<i+j;a++){
            nums[a]=1;
        }
        for(int a=i+j;a<nums.length;a++){
            nums[a]=2;
        }
        
    }
}