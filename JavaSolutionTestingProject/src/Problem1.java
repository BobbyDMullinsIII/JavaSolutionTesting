/**
 * JavaSolutionTestingProject
 * Problem1.java
 * Problem1 class for testing solutions to the TwoSum problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class Problem1
{
    //Problem 1
    //Method for running TwoSum solution
    public static void runProblem1()
    {
        //Main variables
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] returnArray;

        //Execute solution
        //returnArray = Problem1.twoSumBruteForce(nums, target); //Brute force method
        returnArray = Problem1.twoSumEfficient(nums, target); //More efficient method

        //Solution printed out to console
        System.out.println(Arrays.toString(returnArray));

    }//end runProblem1()

    /**
     * Brute force solution for TwoSum problem
     *
     * @param  nums   input array to search
     * @param  target input target sum
     * @return array of indices within 'nums' array containing integer sum equal to target
     */
    public static int[] twoSumBruteForce(int[] nums, int target)
    {
        int i, j; //loop variables

        //double for loop to iterate through each value and compare to every other value
        //(will result in comparisons with the same indices duplicating a few times)
        for (i = 0; i < nums.length; i++)
        {
            for (j = 0; j < nums.length; j++)
            {
                if (i != j) //do not compare if same index
                {
                    //Check if equal to target
                    if (nums[i] + nums[j] == target)
                    {
                        //returns indices if two separate indices to equal target are found
                        return new int[] { i, j };
                    }
                }
            }
        }

        //Will only return this if two separate indices equaling target are not found
        return new int[] { 0, 0 };

    }//end twoSumBruteForce()

    /**
     * More efficient solution for TwoSum problem (might not be the best)
     *
     * @param  nums   input array to search
     * @param  target input target sum
     * @return array of indices within 'nums' array containing integer sum equal to target
     */
    public static int[] twoSumEfficient(int[] nums, int target)
    {
        int i; //loop variable
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        //loop through array only one time using hashmap
        for (i = 0; i < nums.length; i++)
        {
            int indiceOneVal = nums[i];
            int indiceTwoVal = target - indiceOneVal;

            //Check if equal to target
            if (map.containsKey(indiceTwoVal))
            {
                //returns indices if two separate indices to equal target are found
                int index = map.get(indiceTwoVal);
                return new int[] { index, i };
            }

            map.put(indiceOneVal, i);
        }

        //Will only return this if two separate indices equaling target are not found
        return new int[] { 0, 0 };

    }//end twoSumEfficient()
}
