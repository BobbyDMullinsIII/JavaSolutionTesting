import java.util.Arrays;

/**
 * JavaSolutionTestingProject
 * Problem14.java
 * Problem14 class for testing solutions to the Longest Common Prefix problem
 *
 * @author      Bobby Mullins
 * @since       Monday, March 20, 2023 (2023-03-20)
 */
public class Problem14
{
    /**
     * Solution for Longest Common Prefix problem
     *
     * @param  strs     array of strings to find longest common prefix for
     * @return string of longest common prefix between all values in 'strs' array
     */
    public static String LongestCommonPrefix(String[] strs)
    {
        int i = 0; //Counting variable for while loop

        //Sort array and find the smallest length from beginning and end strings
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[strs.length - 1].length());

        //Count until 'i' is at location of end of common prefix between all strings
        while (i < end && strs[0].charAt(i) == strs[strs.length - 1].charAt(i))
        { i++; }

        //Return calculated common prefix
        return strs[0].substring(0, i);

    }//end LongestCommonPrefix()
}
