class Solution {
    

    public int[][] reconstructQueue(int[][] people) {
        //queue에 우선 집어넣기 
        Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1] - b[1] : b[0] -a[0]);

        List<int[]> list = new ArrayList<>();

        for(int[] person : people){
            list.add(person[1],person);
        }

        return list.toArray(new int[people.length][2]);
        // Queue<Person> queue = new LinkedList<>();
        //  int [][] answer = new int[people.length][2];
        // for(int [] person : people){
            
        //     queue.add(new Person(person[1],person[0]));
        //     if(person[0],)
        // }
        
        
        // while(!queue.isEmtpy()){
        //     Person person = queue.poll();
            
            
            
        // }
       
   
    }
}