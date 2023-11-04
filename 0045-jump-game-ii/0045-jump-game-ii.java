class Solution {
    public static int jump(int[] nums) {

        int arrayLength = nums.length;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        int jumps = 0;
        boolean[] visited = new boolean[arrayLength];

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int count = 0; count < size; count++) {
                int current = queue.remove();
                if (current == arrayLength - 1) return jumps;
                for (int i = current + 1; i <= Math.min(arrayLength - 1, current + nums[current]); i++) {
                    if (!visited[i]) {
                        queue.add(i);
                        visited[i] =true;
                    }
                }
                visited[current] = true;
            }
            jumps++;
        }
        return -1;
    }


}