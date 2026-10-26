class Solution {
    public String interpret(String command) {
        String v = "";
      for(int i=0;i<command.length();i++){
        if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
            v = v + "o";
        }
        else if (command.charAt(i)!='(' && command.charAt(i)!=')'){
            v = v + command.charAt(i);
        }
        
      } 
      return v; 
    }
}