/**
 * JavaSolutionTestingProject
 * Problem3.java
 * Problem3 class for testing solutions to the Longest Substring Without Repeating Characters problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */
public class Problem3
{
    //Problem 3
    //Method for running LongestSubstringWithoutRepeat solution
    public static void runProblem3()
    {
        //Main variables
        String s = "abcabcbb";
        int substringLength;

        //Execute solution
        substringLength = Problem3.lengthOfLongestSubstring(s);

        //Solution printed out to console
        System.out.println(substringLength);

    }//end runProblem3()

    /**
     * Solution for Longest Substring Without Repeating Characters problem
     *
     * @param  s    input string to find substring
     * @return length of the longest substring without repeating characters in 's' string
     */
    public static int lengthOfLongestSubstring(String s)
    {
        String checkStr = "";  //String to check against for duplicate characters
        int substringLength = -1; //Length of largest substring without repeating characters

        //Invalid Input Checks
        //If string 's' is null or empty or has a length of 0, return 0
        if (s == null || s.trim().isEmpty() || s.length() == 0)
        { return 0; }

        //If string 's' has a length of 1, return 1
        if(s.length() == 1)
        { return 1; }

        //Go through each character in string 's'
        for (int i = 0; i < s.length() ; i++)
        {
            //If a repeating character is found, reset checkStr
            if (checkStr.contains(Character.toString(s.charAt(i))) == true)
            {
                try
                {
                    checkStr = Character.toString(checkStr.charAt(checkStr.indexOf(s.charAt(i) + 1)));
                }
                catch (Exception e)
                {
                    checkStr = Character.toString(checkStr.charAt(checkStr.indexOf(s.charAt(i))));
                }
            }

            //Add currently checked character in string to the checkStr
            checkStr += s.charAt(i);

            //If the current checkStr is larger than the stored substrLength, set substrLength to checkStr length
            if (checkStr.length() > substringLength)
            {
                substringLength = checkStr.length();
            }
        }

        //Return final max substring without repeating characters length
        //(Minus 1 because added one on line 37 crashes program)
        return substringLength;

    }//end lengthOfLongestSubstring()
}
