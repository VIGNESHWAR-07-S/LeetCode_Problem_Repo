class Solution {
    public boolean squareIsWhite(String coordinates) {
       char v = coordinates.charAt(0);
       int a = v - 'a' + 1;
       int obj = Integer.valueOf(coordinates.charAt(1));
       int c = a+obj;
       if(c%2==0){
        return false;
       }
       return true;

    }
}