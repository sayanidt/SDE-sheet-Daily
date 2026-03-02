class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        int b=0;
        int ori=x;
        while(x!=0){
        int a= x%10;
         b= b*10+ a;
        x=x/10;
        
    }
    if(ori==b){
        return true;
    }else{
        return false;
    }
    }
}