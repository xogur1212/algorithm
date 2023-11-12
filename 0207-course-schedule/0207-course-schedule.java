class Solution {

        boolean[] visited, cycle;
        ArrayList<Integer> adj[];
        boolean result = true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      
         visited = new boolean[numCourses];
        cycle = new boolean[numCourses];
        adj = new ArrayList[numCourses];
        for(int i = 0 ; i< numCourses ; i++){
            adj[i] = new ArrayList<>();
        }

        for(int i =0 ; i< prerequisites.length ; i++) {
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            adj[b].add(a);

        }

        for(int i= 0 ; i < numCourses; i++){
            dfs(i);

            if(!result)
                break;
        }

        return result;
    }

    public  void dfs(int numCourse){

        if(visited[numCourse]){
            if(cycle[numCourse])
                result = false;
            return;
        }

        visited[numCourse] = true;
        cycle[numCourse] = true;

        for(int i =0 ; i <adj[numCourse].size() ; i++ ) {
            dfs(adj[numCourse].get(i));
        }

        cycle[numCourse] = false;
    }
}