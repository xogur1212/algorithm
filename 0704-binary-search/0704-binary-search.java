class Solution {
    
    public static int answer = -1;
    public int search(int[] nums, int target) {
         
        
      search(nums,target,0,nums.length-1);

      return answer;
    }

   public void search(int[] nums, int target, int left, int right) {
        if (left > right) {
            answer = -1; // 타겟을
            return; // 타겟을 찾지 못한 경우
        }

        int midIndex = left + (right - left) / 2;
        int mid = nums[midIndex];

        if (target < mid) {
            search(nums, target, left, midIndex - 1); // 왼쪽 반을 탐색
        } else if (target > mid) {
            search(nums, target, midIndex + 1, right); // 오른쪽 반을 탐색
        } else {
            answer = midIndex; // 타겟을 찾은 경우 인덱스를 저장하고 종료
            return;
        }

             // 타겟을 찾지 못한 경우
        // answer = -1;
    }
}