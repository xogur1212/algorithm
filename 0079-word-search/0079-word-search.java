class Solution {

    private static final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public boolean exist(char[][] board, String word) {
        
        final int M = board.length;
        final int N = board[0].length;
        

        for(int i = 0 ; i < M ; i++)
            for(int j = 0 ; j < N ; j++) 
                if(dfs(board , i , j , word, 0)) 
                    return true;


        return false;
    }

   
   private boolean dfs(char[][] board, int x , int y , String word ,int z){

    if(z >= word.length()) return true;
    if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || board[x][y] == '\0' || board[x][y] != word.charAt(z)) {
            return false;
        }


    char origin = board[x][y];
    board[x][y] = '\0';

    for(int[] dir : DIRS) {
        int i = x + dir[0];
        int j = y + dir[1];
        if(dfs(board, i, j, word, z + 1 )) return true;
    }

    board[x][y] = origin;

    return false;
       
   }
 
    
}