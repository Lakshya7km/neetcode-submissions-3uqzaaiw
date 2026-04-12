class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashSet <Integer> set = new HashSet<>();
        int n = nums.length;
        int j =0;
        for(int i =0; i<n;i++){
            if(!set.add(nums[i])){
                continue;
            }else{
                nums[j]=nums[i];
                j++;
            }
        }
       
      
       return set.size();

      
    }
}