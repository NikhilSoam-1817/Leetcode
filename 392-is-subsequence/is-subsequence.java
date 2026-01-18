class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=s.length();
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                count--;
            }
            j++;
            
        }
        if(count==0){
            return true;
        }
        return false;
    }
}