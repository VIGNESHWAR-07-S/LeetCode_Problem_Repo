class Solution {
    public char findTheDifference(String s, String t) {
        int l=0;
        for (char v:t.toCharArray()) {
            l=l+v;
        }
        for (char v:s.toCharArray()) {
            l=l-v;
        }
        return (char) l;
    }
}