class Solution {
    public String defangIPaddr(String address) {
     String j ="";
     for(int i=0;i<address.length();i++){
        if(address.charAt(i)=='.'){
            j=j+"[.]";
        }
        else{
            j=j+address.charAt(i);
        }
     }   
     return j;
    }
}