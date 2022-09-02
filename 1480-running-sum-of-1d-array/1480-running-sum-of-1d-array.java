class Solution {
    public int[] runningSum(int[] nums) {
        
        
        List<Integer> intArray =new ArrayList();
        int size = nums.length;
        int sum = 0;
        int count =0;
        int [] array = new int[size]; 
        for(int num : nums){
            intArray.add(num);
        }
        for(int a : intArray){
            System.out.println(a);
            
            sum += a;
            array[count]=sum;
            count++;
        }
        
        return array;
    }
}