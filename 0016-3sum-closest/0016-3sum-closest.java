class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int result = nums[0] + nums[1] + nums[nums.length -1];
        Arrays.sort(nums);


        //3개만 더하게
        for( int i= 0; i< nums.length -2 ; i++){
            int aPointer = i +1;
            int bPointer = nums.length -1;

        //정렬을 했기떄문에 결과값이 차이가 더크면 큰수부터 하나 줄이고

        // 반대의 경우는 출발 인덱스를 늘린다
            while(aPointer < bPointer) {
                int currentSum = nums[i] + nums[aPointer] + nums[bPointer];
                if(currentSum > target) 
                    bPointer -=1;
                else 
                    aPointer += 1;


                if(Math.abs(currentSum-target) < Math.abs(result-target))
                    result = currentSum;
            }
        }
    
        return result;
    }

}