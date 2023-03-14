/**
 * JavaSolutionTestingProject
 * Problem4.java
 * Problem4 class for testing solutions to the Median Of Two Sorted Arrays problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */

import java.util.Arrays;
public class Problem4
{
    /**
     * Solution for Median of Two Sorted Arrays problem
     *
     * @param  nums1    first input array
     * @param  nums2    second input array
     * @return median of the merged nums1|nums2 array
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        //Variables
        double median;
        int[] mergedArray;
        int arrayLength;
        boolean oddLength = false;

        //Merge arrays, sort merged array, and store length in variable
        mergedArray =  Arrays.copyOf(nums1, nums1.length + nums2.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);
        arrayLength = mergedArray.length;

        //Makes oddLength variable true if array is calculated to be odd in length
        if(arrayLength % 2 != 0)
        {
            oddLength = true;
        }

        //Different calculations for odd or even length
        if (oddLength == true)
        {
            //Calculation for odd length
            median = mergedArray[(arrayLength + 1) / 2 - 1];
        }
        else
        {
            //Calculation for even length
            int tempNum = mergedArray[arrayLength / 2 - 1] + mergedArray[arrayLength / 2];
            median = tempNum / 2.0d;
        }

        //Return calculated median of merged array
        return median;

    }//end findMedianSortedArrays()
}
