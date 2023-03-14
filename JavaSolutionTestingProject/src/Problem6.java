/**
 * JavaSolutionTestingProject
 * Problem6.java
 * Problem6 class for testing solutions to the Zigzag Conversion problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */
public class Problem6
{
    /**
     * Solution for Zigzag Conversion problem
     *
     * @param  s        string to convert
     * @param  numRows  number of rows that zigzag pattern uses
     * @return string after zigzag conversion using 's' string with 'numRows' number of rows
     */
    public static String convert(String s, int numRows)
    {
        //If string is null or empty, only has one character, or the rows is equal to 1, return itself
        if (s == null || s.trim().isEmpty() || s.length() == 0 || s.length() == 1 || numRows == 1)
        { return s; }

        char[] charArray;    //Array of characters for return value (strings dont allow modification of specific character indexes)
        int indexStr = 0;    //Index of string 's' pointer
        int indexRow = 0;    //Index of row pointer
        boolean nextRow = true; //Whether or not the indexStr should go the next row down

        //Set character array to string length and loop through each string character for each iteration
        charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            charArray[i] = s.charAt(indexStr);

            //Stay on current row if nextRow is false
            if (nextRow == false)
            {
                indexStr += (indexRow * 2);
            }
            //Add number of rows 'numRows' to calculation if nextRow is true
            else
            {
                indexStr += (numRows - indexRow - 1) * 2;
            }

            //Invert 'nextRow' if 'indexRow' pointer is not zero
            if (indexRow != 0)
            {
                nextRow = !nextRow;
            }

            //If 'indexStr' is larger than the actual length of 's'
            //Go to top row by setting 'nextRow' to true and setting the pointers accordingly
            if (indexStr >= s.length())
            {
                indexRow++; //Increase row pointer to next row if the 'indexStr' pointer has gone outside of the string
                nextRow = true;
                indexStr = indexRow;

                //If the 'indexRow' pointer is equal to 1 below the number of rows in the zigzag conversion, reset it
                if (indexRow == (numRows - 1))
                {
                    indexRow = 0;
                }
            }
        }

        //Convert final charArray to string and return
        return new String(charArray);

    }//end convert()
}
