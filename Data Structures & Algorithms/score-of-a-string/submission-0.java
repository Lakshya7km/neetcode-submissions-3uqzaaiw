class Solution {
    public int scoreOfString(String s) {
        char[] ch = s.toCharArray();
        int sum = 0;
        int ans = 0;
        for(int i=0; i<ch.length-1; i++){
              if(ch[i] > ch[i+1] ){
                sum=((int)ch[i]-(int)ch[i+1])+sum;
              }else{
                sum=((int)ch[i+1]-(int)ch[i])+sum;
              }
        }
        ans = sum;
       return ans;
    }
}