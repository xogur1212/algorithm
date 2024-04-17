class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
     
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            }
        });

        int count = 1; // 첫 번째 interval은 선택됨
        int end = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < end) // 현재 interval이 이전에 선택된 interval과 겹침
                continue;
            end = intervals[i][1];
            count++;
        }

        return intervals.length - count;
    }
}