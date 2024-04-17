class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<String> stack = new Stack<>();
        int answer = 0;
        
        for(String token : tokens){
           if(token.equals("+") || token.equals("-") 
              || token.equals("*") || token.equals("/")) {
               
             
            
               String before = stack.pop();
               String after = stack.pop();
               
               int beforeInt = Integer.parseInt(before);
               int afterInt = Integer.parseInt(after); 
               
            if(token.equals("+"))
                    stack.push(Integer.toString(afterInt + beforeInt));
               
               if(token.equals("-"))
                    stack.push(Integer.toString(afterInt - beforeInt));
               
               if(token.equals("*"))
                    stack.push(Integer.toString(afterInt * beforeInt));
               
               if(token.equals("/"))
                    stack.push(Integer.toString(afterInt / beforeInt));
               

               
               
               
           }
               
    
           else {
               stack.push(token);
               
           }
               
          
           
        }
          return Integer.parseInt(stack.peek());
    }
}