import java.util.LinkedHashMap;

/**
 * JavaSolutionTestingProject
 * Problem13.java
 * Problem13 class for testing solutions to the Roman to Integer problem
 *
 * @author      Bobby Mullins
 * @since       Monday, March 20, 2023 (2023-03-20)
 */
public class Problem13
{
    /**
     * Solution for Roman to Integer problem
     *
     * @param  s   string of roman numbers to convert to integer
     * @return 's' roman numerals converted to an integer
     */
    public static int RomanToInt(String s)
    {
        int finalInt = 0; //Final converted integer to return

        //Dictionary of symbols and values for roman numeral to integer conversion
        LinkedHashMap<String, Integer> symVals = new LinkedHashMap<String, Integer>()
        {{
            put("I", 1);
            put("IV", 4);
            put("V", 5);
            put("IX", 9);
            put("X", 10);
            put("XL", 40);
            put("L", 50);
            put("XC", 90);
            put("C", 100);
            put("CD", 400);
            put("D", 500);
            put("CM", 900);
            put("M", 1000);
        }};

        //Have to replace these because "edge" cases will not convert correctly without a lot of calculation
        //This makes it simpler
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        //Go through each value within the string and convert into integer representation
        for (int i = 0; i < s.length(); i++)
        {
            //Add each converted integer to final total number
            finalInt += symVals.get(Character.toString(s.charAt(i)));
        }

        //Return final converted number
        return finalInt;

    }//end RomanToInt()
}
