class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        Map<Integer,List<int[]>> map = new HashMap<>();

        for(int[] flight : flights) {
            map.putIfAbsent(flight[0], new ArrayList<>());
            map.get(flight[0]).add(new int[]{flight[1], flight[2]});

        }

        Map<Integer, Integer> visited = new HashMap<>();

        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> (a[1]-b[1]));
        queue.add(new int[]{src,0,k});

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int currentNode= current[0];
            int currentPrice= current[1];
            int remainingStop = current[2];

            if(currentNode == dst) {
                return currentPrice;
            }
            visited.put(currentNode, remainingStop);

            if(remainingStop >=0 ) {
                for(int[] temp : map.getOrDefault(currentNode, new ArrayList<>())){

                    if(!visited.containsKey(temp[0]) || remainingStop > visited.get(temp[0])){
                        queue.add(new int[]{temp[0],temp[1] + currentPrice, remainingStop-1});
                    }
                }
            }
        }
        return -1;
    }
}