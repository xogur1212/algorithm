class NumArray {

    private int[] numArrays ;
    public NumArray(int[] nums) {
        numArrays = nums;
    }
    
    public int sumRange(int left, int right) {
        int result = 0;
        for(int i =left; i<=right ; i++) {
            result += numArrays[i];
        }

        return result;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */