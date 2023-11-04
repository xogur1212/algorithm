class Solution {

 static class Pair {

        public int row;
        public int col;

        public Pair(int col, int row) {
            this.row = row;
            this.col = col;
        }

    }

 

    public static int numIslands(char[][] grid) {

        //변수 선언
        int maxY = grid.length;
        int maxX = grid[0].length;

        System.out.println("maxY = " + maxY + "maxX = " + maxX);

        //방문 했는지에 대한 변수 선언
        int answer = 0;
        boolean[][] visited = new boolean[maxY][maxX];

        for (int i = 0; i < maxY; i++) {
            for (int j = 0; j < maxX; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {

                    answer++;
                    Pair node = new Pair(i,j);
                    bfs(node, grid,visited);

                }

            }
        }
        return answer;
    }


  public static void bfs(Pair node, char[][] grid, boolean[][] visited) {

        Queue<Pair> pairQueue = new LinkedList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int maxY = grid.length;
        int maxX = grid[0].length;
        visited[node.col][node.row]= true;
        pairQueue.add(node);


        while(!pairQueue.isEmpty()){
            Pair removedNode =pairQueue.remove();

            for(int[]direction : directions){
                int row = removedNode.row + direction[0];
                int col = removedNode.col + direction[1];
                if(row>=0 && col >=0 && row <maxX && col < maxY  && grid[col][row] =='1' && !visited[col][row]){
                    visited[col][row] = true;
                    pairQueue.add(new Pair(col,row));
                }
            }
        }



    }
}