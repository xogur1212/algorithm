class Solution {
    public static int jump(int[] nums) {

        int arrayLength = nums.length;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        int jumps = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int count = 0; count < size; count++) {
                int current = queue.remove();
                if (current == arrayLength - 1) return jumps;
                if(nums[current] == -1) continue;
                for (int i = current + 1; i <= Math.min(arrayLength - 1, current + nums[current]); i++) {
                    if (nums[i] != -1 ) {
                        queue.add(i);

                    }
                }
                nums[current] = -1;
            }
            jumps++;
        }
        return -1;
    }

}