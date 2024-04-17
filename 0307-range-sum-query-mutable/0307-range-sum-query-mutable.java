class NumArray {
    
    int[] arr;
    int sum = 0;
    public NumArray(int[] nums) {
        this.arr = nums;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }  
    }
    
    public void update(int index, int val) {
        sum = sum - arr[index] + val;
        arr[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int temp = sum;
        for(int i=0;i<left;i++){
            temp -= arr[i];
        }
        for(int i=arr.length-1;i>right;i--){
            temp -= arr[i];
        }
        return temp;
        
    }
}