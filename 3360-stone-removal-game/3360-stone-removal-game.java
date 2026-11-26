class Solution {
    public boolean canAliceWin(int n) {
      int remove = 10;
      boolean a = false;
      while(n>=remove && remove>0){
        n=n-remove;
        remove--;
        a=!a;
      }
      return a;
    }
}