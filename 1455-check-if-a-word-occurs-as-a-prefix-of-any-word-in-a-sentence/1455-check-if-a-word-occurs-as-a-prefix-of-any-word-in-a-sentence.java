class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
      String[] w = sentence.split(" ");
      int r =0;
       for(int i=0;i<w.length;i++){
        if(w[i].length()>=searchWord.length()){
           for(int j=0; j<searchWord.length();j++){
            if(searchWord.charAt(j)==w[i].charAt(j)){
                r++;
            }
            else{
                r=0;
            }
            if(r==searchWord.length()) return i+1;
           }
       }
       }
       return -1; 
    }
}