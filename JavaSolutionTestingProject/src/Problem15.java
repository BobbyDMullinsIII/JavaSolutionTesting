/**
 * JavaSolutionTestingProject
 * Problem15.java
 * Problem15 class for testing solutions to the Three Sum problem
 *
 * @author      Bobby Mullins
 * @since       Saturday, April 8, 2023 (2023-04-08)
 */
import java.util.*;
import java.util.stream.Collectors;

public class Problem15
{
    //Problem 15
    //Method for running ThreeSum solution
    public static void runProblem15()
    {
        //Main variables
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> triplets;

        //Execute Solution
        //triplets = Problem15.threeSumSlow(nums);
        triplets = Problem15.threeSumFast(nums);

        //Solution printed out to console
        for (List<Integer> sublist : triplets)
        {
            System.out.println(Arrays.toString(sublist.toArray()));
            System.out.println();
        }

    }//end RunProblem15()

    /**
     * Slow Solution for Three Sum problem
     *
     * @param  nums     array of ints to search for triplets that equal zero
     * @return List of Lists that contain all triplet combinations from 'nums' array that equal zero
     */
    public static List<List<Integer>> threeSumSlow(int[] nums)
    {
        int x;                               //Third value in a triplet to check
        HashSet<Integer> tempSet;            //Temporary HashSet for triplet comparison
        List<List<Integer>> returnList = new ArrayList<>(); //List of lists to return

        //Go through entire array (length minus two due to triplet calculation)
        for (int i = 0; i < nums.length - 2; i++)
        {
            //Create new HashSet for this iteration
            tempSet = new HashSet<Integer>();

            //Iterate one ahead of i in current for loop iteration
            for (int j = i + 1; j < nums.length; j++)
            {
                //Calculate triplet
                x = 0 - (nums[i] + nums[j]);

                //If the HashSet contains the 'x' value equivalent, add to the triplet return list
                if (tempSet.contains(x))
                {
                    List<Integer> tempList = Arrays.asList( x, nums[i], nums[j] );
                    Collections.sort(tempList);

                    //Statements for checking if triplet is duplicate of already existing triplet within returnList
                    if (returnList.size() == 0)
                    {
                        returnList.add(tempList);
                    }
                    else
                    {
                        //Checks if current triplet is a duplicate of one already within 'returnList'
                        boolean duplicate = false;
                        for (List<Integer> l : returnList)
                        {
                            if (tempList.equals(l))
                            {
                                duplicate = true;
                            }
                        }

                        //Adds current triplet if it is not a duplicate
                        if(duplicate == false)
                        {
                            returnList.add(tempList);
                        }
                    }
                }
                //Else, add it to the HashSet for this run
                else
                {
                    tempSet.add(nums[j]);
                }
            }
        }

        //Returns list of lists of triplets that equal '0'
        return returnList;

    }//end ThreeSumSlow()

    /**
     * Fast(er) Solution for Three Sum problem
     *
     * @param  nums     array of ints to search for triplets that equal zero
     * @return List of Lists that contain all triplet combinations from 'nums' array that equal zero
     */
    public static List<List<Integer>> threeSumFast(int[] nums)
    {
        Set<List<Integer>> workList = new HashSet<>();   //Working list of triplet lists

        //Go through entire array (length minus two due to triplet calculation)
        for (int i = 0; i < nums.length - 2; i++)
        {
            //Create new HashSet for this iteration
            HashSet<Integer> tempSet = new HashSet<Integer>(); //Temporary HashSet for triplet comparison

            //Iterate one ahead of i in current for loop iteration
            for (int j = i + 1; j < nums.length; j++)
            {
                //Calculate triplet
                int x = 0 - (nums[i] + nums[j]); //Third value in a triplet to check

                //If the HashSet contains the 'x' value equivalent, add to the triplet return list
                if (tempSet.contains(x))
                {
                    List<Integer> tempList = Arrays.asList( x, nums[i], nums[j] );
                    Collections.sort(tempList);
                    workList.add(tempList);
                }
                //Else, add it to the HashSet for this run
                else
                {
                    tempSet.add(nums[j]);
                }
            }
        }

        List<List<Integer>> returnList = workList.stream().map(ArrayList::new).collect(Collectors.toList()); //List of lists to return

        //Returns list of lists of triplets that equal '0'
        return returnList;

    }//end ThreeSumFast()
}
