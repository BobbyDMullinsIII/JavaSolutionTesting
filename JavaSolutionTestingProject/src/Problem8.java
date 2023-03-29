/**
 * JavaSolutionTestingProject
 * Problem8.java
 * Problem8 class for testing solutions to the String To Integer (atoi) problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */
public class Problem8
{
    /**
     * Solution for String To Integer (Atoi) problem
     *
     * @param  s    input string to convert to integer
     * @return integer from input string clamped to 32-bit
     */
    public static int myAtoi(String s)
    {
        int pointer = 0;        //Where the pointer in the string currently is
        StringBuilder numString = new StringBuilder();  //String to build from 's' input

        //Removes all leading and trailing whitespace (even though constraints just use leading spaces as whitespace)
        s = s.trim();

        //Invalid Input Checks
        //If string is null or empty after removing all leading and/or trailing whitespace, return 0
        if(s == null || s.trim().isEmpty() || s.length() == 0)
        { return 0; }

        //If both the first and second characters in the string are not a digit, return 0
        if (!Character.isDigit(s.charAt(0)))
        {
            if(s.length() == 1)
            { return 0; }

            if(!Character.isDigit(s.charAt(1)))
            { return 0; }

            //If the first character is not a negative sign or positive sign, return 0
            if(s.charAt(0) != '-' && s.charAt(0) != '+')
            {
                return 0;
            }
        }

        //Increments pointer forward if a plus or negative exists
        if (s.charAt(pointer) == '-' || s.charAt(pointer) == '+')
        {
            //Make 'numString' start with negative sign is in front of number if within 's'
            if (s.charAt(pointer) == '-')
            {
                numString.append('-');
            }

            pointer++; //Increment pointer to next position for digits
        }

        //While the pointer is on a digit, add to the 'numString'
        while(Character.isDigit(s.charAt(pointer)))
        {
            numString.append(s.charAt(pointer));
            pointer++;

            if(pointer == s.length())
            {
                break;
            }
        }

        //Check if number is valid and fits within sign 32-bit range
        try
        {
            return Integer.parseInt(numString.toString());
        }
        //Clamp number if outside signed 32-bit range
        catch (NumberFormatException e)
        {
            //If negative, return min value, else return max value
            if (numString.charAt(0) == '-')
            {
                return Integer.MIN_VALUE;
            }
            else
            {
                return Integer.MAX_VALUE;
            }
        }

    }//end myAtoi()
}
