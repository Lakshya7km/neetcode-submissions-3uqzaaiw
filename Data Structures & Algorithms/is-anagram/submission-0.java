class Solution {
    public boolean isAnagram(String s, String t) {
   boolean ans = true; 
  int[] word = new int[26];
  int l= 0;
  for(int i= 0;i< s.length();i++){
     int a =  (int)s.charAt(i);
     
    word[(a-97)]++;
  }
   for(int j= 0; j< t.length(); j++){
      int b= (int)t.charAt(j);
      word[(b-97)]--;
   }
   
   for(int el:word){
    if(el!=0){
      return false;

   }
   }

   return ans;


    }
  }