class Solution {
    public int minOperations(String s) {
      char[] c = s.toCharArray();
      boolean sorted = true;

      for(int i=1;i<s.length();i++){
        if(c[i-1]>c[i]){
            sorted = false;
        }
      }
      if (sorted) return 0;
      if (s.length()==2) return -1;

      char max='a',min='z';
      for(char b : c){
        if(max<b) max=b;
        if(min>b) min=b;
      } 
      if(c[0]==min ||  max==c[s.length()-1]) return 1;
      int maxc=0,minc=0;
      for(char b : c){
        if(b==min) minc++;
        if(max==b) maxc++;
      }
      if(c[0]==max && maxc==1 && c[s.length()-1]==min && minc==1) return 3;
      return 2;

    }
}