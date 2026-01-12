class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int a=digits.length-1;a>=0;a--){
            if(digits[a]==9){
                digits[a]=0;

            }
            else{
                digits[a]++;
                return digits;
            }
        }

        int digit[]=new int[digits.length+1];
        digit[0]=1;
        return digit;



       
    }
}