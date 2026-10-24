class Solution {
    public int numberOfSteps(int num) {
      int e = 0;
      while(num!=0){
        if(num%2!=0){
            num--;
        }
        else{
            num=num/2;
        }
        e++;
      }
      return e;
    }
}