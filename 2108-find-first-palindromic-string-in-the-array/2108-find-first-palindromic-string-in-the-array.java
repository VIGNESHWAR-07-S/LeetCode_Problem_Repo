class Solution {
    public String firstPalindrome(String[] words) {
      for(int i=0;i<words.length;i++){
        String e = "";

        for(int j=words[i].length()-1;j>=0;j--){
            e = e + words[i].charAt(j);
        }

        if(e.equals(words[i])){
             return words[i];
        }  
    }
    return "";
}
}