package day1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {

        int result = 0;
        int value = 0;
        String[] romanStrArray = s.split("");


        //init
        Map<Character, Integer> romanIntegerMap = new HashMap<>();
        romanIntegerMap.put('I', 1);
        romanIntegerMap.put('V', 5);
        romanIntegerMap.put('X', 10);
        romanIntegerMap.put('L', 50);
        romanIntegerMap.put('C', 100);
        romanIntegerMap.put('D', 500);
        romanIntegerMap.put('M', 1000);


        //
        for (int i = 0; i < romanStrArray.length; i++) {

            char romanCh = s.charAt(i);


            if (i > 0 && romanIntegerMap.get(romanCh) > romanIntegerMap.get(s.charAt(i - 1))) {
                value = romanIntegerMap.get(romanCh) - romanIntegerMap.get(s.charAt(i - 1)) * 2;


            } else {
                value = romanIntegerMap.get(romanCh);


            }
            result += value;

        }

        return result;
    }

    public static void main(String[] args) {
       RomanToInteger romanToInteger=new RomanToInteger();
       String inputRomanString = null;
       int value =0;

       inputRomanString ="MCMXCIV";
       value = romanToInteger.romanToInt(inputRomanString);

       System.out.println("Roman String :"+ inputRomanString +" to Integer Value  : " + value);

        inputRomanString ="III";
        value = romanToInteger.romanToInt(inputRomanString);

        System.out.println("Roman String :"+ inputRomanString +" to Integer Value  : " + value);

        inputRomanString ="LVIII";
        value = romanToInteger.romanToInt(inputRomanString);

        System.out.println("Roman String :"+ inputRomanString +" to Integer Value  : " + value);




    }
}
