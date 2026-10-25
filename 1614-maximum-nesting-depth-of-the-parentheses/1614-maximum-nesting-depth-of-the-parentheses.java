class Solution {
    public int maxDepth(String s) {
    int max = 0,x=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            max++;
            x = Math.max(max,x);
        }
        else if(s.charAt(i)==')'){
            max--;
        }
        
    }
    return x;    
    }
}