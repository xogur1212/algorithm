class Solution {
    public int[] runningSum(int[] nums) {
        
        int [] sumArray = new int[nums.length];
        int sumResult =0;
        
        for(int i =0 ; i<nums.length; i++){
           
           sumResult += nums[i];
           sumArray[i]= sumResult;
        }

        return sumArray;
    }
}