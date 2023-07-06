class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer ,Integer> numMap =new HashMap<>();
        List<Integer> numList = new ArrayList<>();
        //num map, num list 작성
         int numSeq = 0;
         int subNumSeq = 0;
        for(int num : nums){
                
           
            numMap.put(numSeq,num);
            // if(num<=target) {
                numList.add(num);
            // }
            numSeq++;
        }
        
        for(int num : numList){
            // int sumResult = 0;
            List<Integer> newNumList = numList.subList(subNumSeq+1,numList.size());
            for(int subNum : newNumList) {
                if(num + subNum == target) {
                  int value1 = getKeyByValue(num,numMap);
                  numMap.remove(value1);
                  int value2 = getKeyByValue(subNum,numMap);
                  return new int[]{value1,  value2};
                }
            }
            subNumSeq++;
        }
        
        return null;
    }
    
    private int getKeyByValue (int findValue, Map<Integer,Integer> numMap){
          for(Integer key : numMap.keySet()) {
                        if(numMap.get(key) ==  findValue) 
                        return key;
                }
        
        return 0;
    }
}