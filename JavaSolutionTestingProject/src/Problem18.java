import java.util.*;
import java.util.stream.Collectors;

/**
 * JavaSolutionTestingProject
 * Problem18.java
 * Problem18 class for testing solutions to the Four Sum problem
 *
 * @author      Bobby Mullins
 * @since       Saturday, April 8, 2023 (2023-04-08)
 */

public class Problem18
{
    //Problem 18
    //Method for running ThreeSum solution
    public static void RunProblem18()
    {
        //Main variables
        int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
        int target = 8;
        List<List<Integer>> quadruplets;

        //Execute Solution
        //quadruplets = Problem18.fourSumSlow(nums, target);
        quadruplets = Problem18.fourSumFast(nums, target);

        //Solution printed out to console
        for (List<Integer> sublist : quadruplets)
        {
            System.out.println(Arrays.toString(sublist.toArray()));
            System.out.println();
        }

    }//end RunProblem18()

    /**
     * Slow Solution for Four Sum problem
     *
     * @param  nums     array of ints to search for quadruplets that is closest to 'target'
     * @param  target   value to calculate quadruplets closest to
     * @return sum of the quadruplets that is closest to 'target' from the 'nums' array
     */
    public static List<List<Integer>> fourSumSlow(int[] nums, int target)
    {
        Set<List<Integer>> workList = new HashSet<>();   //Working list of quadruplet lists
        int length = nums.length;

        //Quadruple nested for loop for searching 'nums' array for quadruplets that equal 'target'
        for (int i = 0; i < length - 3; i++)
        {
            for (int j = i + 1; j < length - 2; j++)
            {
                for (int k = j + 1; k < length - 1; k++)
                {
                    for (int l = k + 1; l < length; l++)
                    {
                        //If the quadruplet equals 'target', sort it, and add it to the final 'returnList'
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target)
                        {
                            List<Integer> tempList = Arrays.asList( nums[i], nums[j], nums[k], nums[l] );
                            Collections.sort(tempList);
                            workList.add(tempList);
                        }
                    }
                }
            }
        }

        List<List<Integer>> returnList = workList.stream().map(ArrayList::new).collect(Collectors.toList()); //List of lists to return

        //Return list of quadruplets from 'nums' that equal 'target'
        return returnList;

    }//end fourSumSlow()

    /**
     * Fast Solution for Four Sum problem
     *
     * @param  nums     array of ints to search for quadruplets that is closest to 'target'
     * @param  target   value to calculate quadruplets closest to
     * @return sum of the quadruplets that is closest to 'target' from the 'nums' array
     */
    public static List<List<Integer>> fourSumFast(int[] nums, int target)
    {
        List<List<Integer>> returnList = new ArrayList<>();

        return returnList;

    }//end fourSumFast()
}
