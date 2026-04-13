class Solution {
    public int scoreOfString(String s) {
        
        int sum = 0;
        for(int i=0; i<s.length()-1; i++){
              if(s.charAt(i) > s.charAt(i+1) ){
                sum=((int)s.charAt(i)-(int)s.charAt(i+1))+sum;
              }else{
                sum=((int)s.charAt(i+1)-(int)s.charAt(i))+sum;
              }
        }
       
       return sum;
    }
}