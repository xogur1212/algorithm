class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] mergedNums = new int[m+n];       
        int index = 0;
        for(int i = 0 ; i < m ; i++){
            mergedNums[i] = nums1[i];
            // System.out.println(i + "answer : " + mergedNums[i]);
        }
      
        
        for(int i = 0 ; i < n ; i++){
            mergedNums[m+i] = nums2[i];
            // System.out.println((m+i)+ "answer : " + mergedNums[m+i]);
        }

           
        Arrays.sort(mergedNums);
        for(int num : mergedNums){
            nums1[index] = num;
            index++; 
        }
   
       
        
    }
}