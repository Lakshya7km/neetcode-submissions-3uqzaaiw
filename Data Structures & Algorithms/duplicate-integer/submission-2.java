class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        HashSet <Integer> set = new HashSet<>();
        for(int el:nums){
            if(!set.add(el)){
                ans = true;
                break;
            }else{
             ans= false;
            }
        }
    return ans;
    }
}