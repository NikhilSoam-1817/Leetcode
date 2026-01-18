class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count=s.length();
        if(s.length()>t.length()){
            return false;
        }
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                count--;

            }
            else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
}