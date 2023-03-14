/**
 * JavaSolutionTestingProject
 * Problem11.java
 * Problem11 class for testing solutions to the Container With Most Water problem
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */
public class Problem11
{
    /**
     * Brute force solution for Container With Most Water problem
     *
     * @param  height   integer array to determine what two points can hold the most water or area
     * @return largest area between two indexes that can "hold the most water" (or area)
     */
    public static int maxAreaBruteForce(int[] height)
    {
        int xVal;        //Value for area calculation (x is length between indices)
        int yVal;        //Value for area calculation (y is height of smaller index in current calculation)
        int area;        //Area of current calculation
        int maxArea = 0; //Maximum calculated area

        //Compares each index to each other with two for loops (Can result in some duplicate calculations)
        for (int i = 0; i < height.length; i++)
        {
            for (int j = 0; j < height.length; j++)
            {
                //Will not calculate area with and index against itself
                if ( i != j )
                {
                    xVal = Math.abs(i - j);
                    yVal = Math.min(height[i], height[j]);
                    area = xVal * yVal;

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        //Returns final calculated max area
        return maxArea;

    }//end maxAreaBruteForce()

    /**
     * More efficient solution for Container With Most Water problem
     *
     * @param  height   integer array to determine what two points can hold the most water or area
     * @return largest area between two indexes that can "hold the most water" (or area)
     */
    public static int maxAreaEfficient(int[] height)
    {
        int i = 0;                 //Starts at the beginning of 'height' array
        int j = height.length - 1; //Starts at the end of 'height' array
        int area;                  //Area of current calculation
        int maxArea = 0;           //Maximum calculated area

        //Will not result in duplicate calculations, unlite brute force method
        while (i < j)
        {
            //Compares 'area' of current calculation with the 'maxArea' calculated so far
            area = Math.min(height[i], height[j]) * (j - i);
            maxArea = Math.max(maxArea, area);

            //Brings i and j closer if their current indexes are of differing heights
            if (height[i] < height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }

        //Returns final calculated max area
        return maxArea;

    }//end maxAreaEfficient()
}
