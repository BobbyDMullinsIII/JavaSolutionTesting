/**
 * JavaSolutionTestingProject
 * Problem16.java
 * Problem16 class for testing solutions to the Three Sum Closest problem
 *
 * @author      Bobby Mullins
 * @since       Saturday, April 8, 2023 (2023-04-08)
 */
import java.util.Arrays;
public class Problem16
{
    //Problem 16
    //Method for running ThreeSumClosest solution
    public static void runProblem16()
    {
        //Main variables
        int[] nums = new int[] { -1, 2, 1, -4 };
        int target = 2;
        int closeSum;

        //Execute Solution
        closeSum = Problem16.threeSumClosest(nums, target);

        //Solution printed out to console
        System.out.print(closeSum);

    }//end RunProblem16()

    /**
     * Solution for Three Sum problem
     *
     * @param  nums     array of ints to search for triplets that is closest to 'target'
     * @param  target   value to calculate triplet closest to
     * @return sum of the triplet that is closest to 'target' from the 'nums' array
     */
    public static int threeSumClosest(int[] nums, int target)
    {
        int closestInt = Integer.MAX_VALUE; //Value from a triplet within 'nums' that is closest to 'target'
        int pointer1;                  //First pointer for the closest triplet
        int pointer2;                  //Second pointer for the closest triplet
        int tempSum;                   //Temporary calculated sum for current while loop iteration triplet

        //Sort and go through entire array (length minus two due to triplet calculation)
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++)
        {
            //Pointers given values for iteration
            //(Will close as while loop goes on)
            pointer1 = i + 1;
            pointer2 = nums.length - 1;

            //Calculates closest sum for each while loop iteration and saves it if it is closer than current closestSum value
            while (pointer1 < pointer2)
            {
                //Calculates triplet sum and compares it to the target sum
                tempSum = nums[i] + nums[pointer1] + nums[pointer2];
                if (Math.abs(target - tempSum) < Math.abs(target - closestInt))
                {
                    closestInt = tempSum;
                }

                //Determines whether to move first or second pointer
                //(Will bring pointers closer together either way)
                if (tempSum <= target)
                {
                    pointer1++;
                }
                else
                {
                    pointer2--;
                }
            }
        }

        //Returns value of triplet that had closest sum to the 'target' value
        return closestInt;

    }//end ThreeSumClosest()
}
