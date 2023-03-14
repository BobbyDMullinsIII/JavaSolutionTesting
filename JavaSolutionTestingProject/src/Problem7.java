/**
 * JavaSolutionTestingProject
 * Problem7.java
 * Problem7 class for testing solutions to the Reverse Integer problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem7
{
    /**
     * Simple solution for Reverse Integer problem
     *
     * @param  x    integer to reverse
     * @return reverse of integer 'x'(unless goes over 32-bit integer limit, then returns 0)
     */
    public static int reverseSimple(int x)
    {
        //Variables (Converted 'x' integer to List of characters)
        List<Character> charList = Integer.toString(x).chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        //Removes negative sign (first char) for the time being if number is negative
        if (x < 0)
        {
            charList.remove(0);
        }

        Collections.reverse(charList); //Reverse number

        //Adds negative sign back in if number is negative
        if (x < 0)
        {
            charList.add(0, '-');
        }

        //Check if number is valid and did not overflow or underflow
        try
        {
            //Convert character list to StringBuilder
            StringBuilder tempBuilder = new StringBuilder(charList.size());
            for(Character c: charList)
            {
                tempBuilder.append(c);
            }

            //Convert StringBuilder to string then int for return (if no exception)
            return Integer.parseInt(tempBuilder.toString());
        }
        catch (NumberFormatException e)
        {
            return 0; //Returns 0 if underflow or overflow occurred
        }

    }//end reverseSimple()

    /**
     * Faster and more space efficient solution for Reverse Integer problem
     *
     * @param  x    integer to reverse
     * @return reverse of integer 'x'(unless goes over 32-bit integer limit, then returns 0)
     */
    public static int reverseFasterSmaller(int x)
    {
        //Variables
        String strNum = Integer.toString(x);

        //If x is a positive number
        if (x >= 0)
        {
            StringBuilder builder = new StringBuilder(strNum); //Convert string to StringBuilder
            builder.reverse();                                 //Reverse number characters
            strNum = new String(builder.toString());                    //Convert back to string
        }
        //If x is a negative number
        else
        {
            strNum = strNum.substring(1);               //Removes negative sign (first char) for the time being
            StringBuilder builder = new StringBuilder(strNum);   //Convert string to StringBuilder
            builder.reverse();                                   //Reverse number characters
            strNum = new StringBuilder(builder.toString()).insert(0, "-").toString(); //Adds negative sign back into string number
        }

        //Return calculated reversed 32-bit integer, return 0 if overflow or underflow occurs
        try
        {
            return Integer.parseInt(strNum);
        }
        catch (NumberFormatException e)
        {
            return 0;
        }

    }//end reverseFasterSmaller()
}
