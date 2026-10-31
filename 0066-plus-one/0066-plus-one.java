class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]<9){
            digits[digits.length-1]=digits[digits.length-1]+1;
           return digits; 
        }
        else {
            int c = 0 ;
            for(int i=0;i<digits.length;i++){
                if(digits[i]==9){
                    c++;
                }
            }
            if(c==digits.length){
                int kk = digits.length+1;
                int[] nex = new int[kk];
                nex[kk-1]=0;
                for(int i=0;i<kk;i++){
                    if(i==0){
                        nex[0]=1;
                    }
                    else{
                       nex[i]=0; 
                    }    
                }
                return nex;
            }
            else{
                digits[digits.length-1]=0;
                for(int i=digits.length-2;i>=0;i--){
                    if(digits[i]<9){
                        digits[i]=digits[i]+1;
                        return digits;
                    }

                else{
                    digits[i]=0;
                }
                }    
                }
                return digits;
        }
    }
}
        
