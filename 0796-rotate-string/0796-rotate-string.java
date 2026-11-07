class Solution {
    public boolean rotateString(String s, String goal) {
      if(s.length()!=goal.length()) return false;
      String v = s+s;
      return v.contains(goal);
    }
}