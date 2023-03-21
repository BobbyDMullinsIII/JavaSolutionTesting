import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 * JavaSolutionTestingProject
 * Problem12.java
 * Problem12 class for testing solutions to the Integer to Roman problem
 *
 * @author      Bobby Mullins
 * @since       Monday, March 20, 2023 (2023-03-20)
 */
public class Problem12
{
    /**
     * Solution for Integer to Roman problem
     *
     * @param  num   integer to convert to roman numberals in string format
     * @return 'num' integer in roman numeral format
     */
    public static String IntToRoman(int num)
    {
        int i = 12;               //Highest index of both symbols and values arrays
        String romanNumeral = ""; //Final roman numeral as string to return

        //Dictionary of symbols and values for roman numeral to integer conversion
        LinkedHashMap<Integer, String> valSyms = new LinkedHashMap<Integer, String>()
        {{
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }};

        //Goes through each order of magnitude (correct word?) within the roman numerals
        //until input number is finally equal to 0
        while (num > 0)
        {
            int tempNum = num / (new ArrayList<Integer>(valSyms.keySet())).get(i);
            num %= (new ArrayList<Integer>(valSyms.keySet())).get(i);

            //While temporary number is higher than 0
            //Go through each conversion within the 'valSyms' dictionary and add them to final 'romanNumeral'
            while (tempNum != 0)
            {
                tempNum--;
                romanNumeral += (new ArrayList<String>(valSyms.values())).get(i);
            }

            i--;
        }

        //Return final converted roman numeral
        return romanNumeral;

    }//end IntToRoman()
}
