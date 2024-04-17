class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        // int cookieNumbers = s.length;
    
        Arrays.sort(g);
        Arrays.sort(s);

        int maximumNumber = 0;
        
        int gIndex = 0;
        int sIndex = 0;

    while(sIndex < s.length && gIndex <  g.length ){
        if(s[sIndex] >= g[gIndex]){
            sIndex++;
            gIndex++;
            maximumNumber++;

        }
        else 
            sIndex++;
    }
        
        return maximumNumber;
    }
}