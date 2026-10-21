class Solution {
    public int lengthOfLongestSubstring(String s) {
      int st =0;
      int e=0;
      int maxlen = Math.min(s.length(),1);
      HashSet<Character> v = new HashSet<>();
      while(e<s.length()){
        char a = s.charAt(e);
        while(v.contains(a)){
            v.remove(s.charAt(st));
            st++;
        }
        v.add(a);
        int ws = e-st+1;
        maxlen = Math.max(ws,maxlen);
        e++;
      }  
      return maxlen;
    }
}