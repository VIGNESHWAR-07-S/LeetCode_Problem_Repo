class Solution {
    public int lengthOfLastWord(String s) {
       int c =0;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)==' '){
            if(c>0){
                break;
            }
        }
        else{
            c++;
        }
        
       } 
       return c;
    }
}