class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w = "";
        String r = "";
        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word1[i].length();j++){
                w = w + word1[i].charAt(j);
            }
        }

        for(int i=0;i<word2.length;i++){
            for(int j=0;j<word2[i].length();j++){
                r = r + word2[i].charAt(j);
            }
        }
        return r.equals(w);
    }
}