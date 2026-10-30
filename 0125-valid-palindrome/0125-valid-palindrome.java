class Solution {
    public boolean isPalindrome(String s) {
        String j= "";
        String V= "";
        char c,b;


        for(int i=s.length()-1;i>=0;i--){
            c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                j = j+Character.toLowerCase(c);
            }
        }
        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                V = V+Character.toLowerCase(c);
            }
        }


        if(j.equals(V)){
            return true;
        }
        else{
            return false;
        }
    }
}