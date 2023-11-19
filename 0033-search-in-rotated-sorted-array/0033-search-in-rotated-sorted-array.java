class Solution {
     public static int search(int nums[] , int target){

        if(nums[0] == target)
            return 0;
        int pivot = findPivotByBinarySearch(nums,target);
//        int[] slicedArray = Arrays.copyOfRange(nums, pivot, nums.length);

        int index = binarySearch(nums, target , 0 , pivot -1 );
//        System.out.println("index " + index);
        if(index != -1 ){
            return index;
        }
        
        return binarySearch(nums,target,pivot,nums.length-1);
        

    }

    public static int binarySearch(int nums[] , int target ,int left , int right){


        int mid = 0;
        while(left <= right){

            mid = (left + right) /2 ;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= target){
                right = mid -1;
            }
            else
                left = mid + 1;

        }
        return -1;
    }


    public static int findPivotByBinarySearch(int nums[] , int target) {
        int left = 0;
        int right = nums.length -1 ;
        int mid = 0;

        while(left < right){

            mid =  (left + right) / 2;
//            System.out.print("mid = " + mid);
//            System.out.print("left = " + left);
//            System.out.println("right = " + right);

            if(nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid ;
        }
        return left ;
    }
}