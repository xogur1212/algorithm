class Solution {
    public int maxProfit(int[] prices) {
        
       int min = prices[0];
        int maxReturn = 0;
   
        for(int price:prices){
    
            if(price<min){
                min=price;
                }
            
            if(maxReturn<price-min){
                maxReturn=price-min;
                System.out.println(maxReturn);
            }
            
        }

            
       
            return maxReturn;
        
            
            
    }   
        
    }
    
