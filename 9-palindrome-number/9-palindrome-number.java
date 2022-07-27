class Solution {
    public boolean isPalindrome(int x) {
/*        String s=x+"";
        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
  */
        if(x<0 || (x%10==0 && x!=0))
            return false;
        int y=0;
        while(x>y){
            y=y*10+x%10;
            x/=10;
            
        }
        return x==y || x==y/10;
  }
}