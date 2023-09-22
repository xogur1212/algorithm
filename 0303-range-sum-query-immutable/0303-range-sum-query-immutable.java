class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        
        int [] sumNums = new int[right+1];
        int totalSum = 0;
    
     for(int i = left ; i <= right ; i++){

         totalSum += nums[i];
      
         sumNums[i] += totalSum; 
        

     }

     return left != 0 ? 
        sumNums[right] - sumNums[left -1] : 
        sumNums[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */