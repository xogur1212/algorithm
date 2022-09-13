class Solution {
    public  boolean isIsomorphic(String s, String t) {

        String [] sSplit =s.split("");

        String [] tSplit =t.split("");

        int size = sSplit.length;
        Map<String,String> isIsomorphicMap =new HashMap<>();
        Map<String,String> reverseMap =new HashMap<>();

        for(int count= 0; count <= size-1; count ++)  {
            isIsomorphicMap.put(sSplit[count],tSplit[count]);
            reverseMap.put(tSplit[count],sSplit[count]);


        }
        for(int count =0;count <= size-1; count ++){

           

                    if(!isIsomorphicMap.get(sSplit[count]).equals(tSplit[count])){

                        return false;
                    }
                

        }



        for(int count =0;count <= size-1; count ++){

          

                if(!reverseMap.get(tSplit[count]).equals(sSplit[count])){

                    return false;
                }
            


        }



        return true;

    }
}