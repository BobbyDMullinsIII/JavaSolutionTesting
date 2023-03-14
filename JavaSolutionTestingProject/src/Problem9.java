/**
 * JavaSolutionTestingProject
 * Problem9.java
 * Problem9 class for testing solutions to the Palindrome Number problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */
public class Problem9
{
    /**
     * Solution for Palindrome Number problem
     *
     * @param  x    input integer to check if palindrome
     * @return whether 'x' is a palindrome number
     */
    public static boolean isPalindrome(int x)
    {
        int n = x;
        int tempNum;
        int finalNum = 0;

        //Will loop until 'n' equals zero after going through each "digit" in 'x'
        while (n > 0)
        {
            tempNum = n % 10; //Modulo n by 10 for temp num each loop
            finalNum = (finalNum * 10) + tempNum;
            n /= 10; //Go down to next "digit" in 'x' number for next loop
        }

        //If the final looped number is equal to the initial 'x' integer, 'x' is a palindrome
        if(finalNum == x)
        {
            return true;
        }
        //Else 'x' is not a palindrome
        else
        {
            return false;
        }

    }//end isPalindrome()
}
