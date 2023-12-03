class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();

        for(int[] time: times) {
            int start = time[0];
            int end = time[1];
            int weight = time[2];

            map.putIfAbsent(start, new HashMap<>());
            map.get(start).put(end, weight);

        }

        int[] distance = new int[n+1];
        Arrays.fill(distance , Integer.MAX_VALUE);
        distance[k] = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{k,0});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNode = current[0];
            int currentWeight = current[1];

            for(int next : map.getOrDefault(currentNode, new HashMap<>()).keySet()) {
                int nextWeight = map.get(currentNode).get(next);

                if(currentWeight + nextWeight < distance[next]) {
                    distance[next] = currentWeight + nextWeight;
                    queue.add(new int[]{next, currentWeight + nextWeight});
            
                }
            }
        }

        int result = 0;
        for( int i =1 ; i<=n ; i++) {
            if(distance[i] > result ) {
                result = Math.max(result,distance[i]);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}