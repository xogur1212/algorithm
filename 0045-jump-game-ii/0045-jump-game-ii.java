class Solution {
    
         public int jump(int[] nums) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        int jumps = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int count = 0; count < size; count++) {
                int curr = queue.remove();
                if (curr == nums.length - 1) return jumps;
                if (nums[curr] == -1) continue;
                for (int i = curr + 1; i <= Math.min(nums.length - 1, curr + nums[curr]); i++) {
                    if (nums[i] != -1) queue.add(i);
                }
                nums[curr] = -1;
            }
            jumps++;
        }
        return -1;
    }
}