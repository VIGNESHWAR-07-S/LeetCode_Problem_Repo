class Solution {
    public String sortSentence(String s) {
      String[] w = s.split(" ");
      int ccc = w.length;
      String[] n = new String[ccc];
      for(int i=0; i<w.length; i++){
          char c = w[i].charAt(w[i].length() - 1);
          int j = c - '0';
          n[j-1] = w[i];
      }

      String g = String.join(" ",n);
      String[] r = new String[n.length];
      for(int i=0;i<n.length;i++){
        r[i] = "";
        for(int j=0;j<n[i].length()-1;j++){
            r[i]=r[i]+n[i].charAt(j);
        }
      }
      g = String.join(" ",r);
      return g;

    }
}