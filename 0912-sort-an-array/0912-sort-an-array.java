class Solution {

    public static int[] sortedArray;

    public int[] sortArray(int[] nums) {
        sortedArray = new int[nums.length];

        mergedSort(nums,0,nums.length-1);
        sortedArray = null;

        return nums;
    }

    public static void mergedSort(int[] array , int left , int right){


        if(left == right) return;
        int mid = (left + right) / 2;

        mergedSort(array, left , mid);
        mergedSort(array ,mid + 1 , right);

        merge(array,left,mid,right);

    }

public static void merge(int[] array , int left, int mid, int right){


        int index = left;
        int leftPoint = left;
        int rightPoint = mid + 1;

        while(leftPoint <= mid && rightPoint <= right){
            if(array[leftPoint] <= array[rightPoint]){
                sortedArray[index] = array[leftPoint];
                index++;
                leftPoint++;
            }

           else{
                sortedArray[index] = array[rightPoint];
                index++;
                rightPoint++;
            }
        }


        if(leftPoint > mid) {

            while(rightPoint <= right){
                sortedArray[index] = array[rightPoint];
                index++;
                rightPoint++;
            }
        }

        else {

            while(leftPoint <= mid){
                sortedArray[index] = array[leftPoint];
                index++;
                leftPoint++;
            }
        }

        for(int i = left ; i <= right ; i++){
            array[i] = sortedArray[i];
        }

    }
}