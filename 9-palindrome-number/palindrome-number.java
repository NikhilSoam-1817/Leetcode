class Solution {
    public boolean isPalindrome(int x) {
        int copy=x;
        if(x<0){
            return false;
        }
        else{
            int a=0;
            while(x!=0){
                int r=x%10;
                 a=a*10+r;
                x=x/10;

            }
            if(a==copy){
                return true;
            }
            else{
                return false;
            }
        }    
    }
}