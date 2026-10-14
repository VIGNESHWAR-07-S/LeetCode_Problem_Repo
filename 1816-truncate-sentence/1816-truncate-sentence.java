class Solution {
    public String truncateSentence(String s, int k) {
     String[] words = s.split(" ");
     String[] l = new String[k];

     for (int i = 0; i < k; i++) {
          l[i] = words[i];
        }

    return String.join(" ", l);   
    }
}