/**
 * JavaSolutionTestingProject
 * Main.java
 * Main driver for program
 *
 * @author      Bobby Mullins
 * @since       Sunday, March 12, 2023 (2023-03-12)
 */

import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        runProblem14();
    }

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

    //Problem 4
    //Method for running MedianTwoSortedArrays solution
    public static void runProblem4()
    {
        //Main variables
        int[] nums1 = new int[] { 1, 3 };
        int[] nums2 = new int[] { 2 };
        double median;

        //Execute solution
        median = Problem4.findMedianSortedArrays(nums1, nums2);

        //Solution printed out to console
        System.out.println(median);

    }//end runProblem4()

    //Problem 6
    //Method for running ZigzagConversion solution
    public static void runProblem6()
    {
        //Main variables
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String converted;

        //Execute solution
        converted = Problem6.convert(s, numRows);

        //Solution printed out to console
        System.out.println(converted);

    }//end runProblem6

    //Problem 7
    //Method for running MedianTwoSortedArrays solution
    public static void runProblem7()
    {
        //Main variables
        int x = 123;
        int reversedNumber;

        //Execute solution
        //reversedNumber = Problem7.reverseSimple(x); //Simpler solution
        reversedNumber = Problem7.reverseFasterSmaller(x);//Slightly faster and more space efficient solution

        //Solution printed out to console
        System.out.println(reversedNumber);

    }//end runProblem7()

    //Problem 8
    //Method for running my atoi solution
    public static void runProblem8()
    {
        //Main variables
        String s = "42";
        int newInt;

        //Execute solution
        newInt = Problem8.myAtoi(s);

        //Solution printed out to console
        System.out.println(newInt);

    }//end runProblem8()

    //Problem 9
    //Method for running PalindromeNumber solution
    public static void runProblem9()
    {
        //Main variables
        int x = 121;
        boolean isPalindrome;

        //Execute solution
        isPalindrome = Problem9.isPalindrome(x);

        //Solution printed out to console
        System.out.println(isPalindrome);

    }//end runProblem9()

    //Problem 11
    //Method for running ContainerWithMostWater solution
    public static void runProblem11()
    {
        //Main variables
        int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int maxArea;

        //Execute Solution
        //maxArea = Problem11.maxAreaBruteForce(height); //Brute force method
        maxArea = Problem11.maxAreaEfficient(height); //More efficient method

        //Solution printed out to console
        System.out.println(maxArea);

    }//end runProblem11()

    //Problem 12
    //Method for running IntegertoRoman solution
    public static void runProblem12()
    {
        //Main variables
        int num = 3;
        String romanNumeral;

        //Execute Solution
        romanNumeral = Problem12.IntToRoman(num);

        //Solution printed out to console
        System.out.println(romanNumeral);

    }//end runProblem12()

    //Problem 13
    //Method for running RomantoInteger solution
    public static void runProblem13()
    {
        //Main variables
        String s = "MCMXCIV";
        int convertInt;

        //Execute Solution
        convertInt = Problem13.RomanToInt(s);

        //Solution printed out to console
        System.out.println(convertInt);

    }//end runProblem13()

    //Problem 14
    //Method for running ContainerWithMostWater solution
    public static void runProblem14()
    {
        //Main variables
        String[] strs = new String[] { "flower", "flow", "flight" };
        String commonPrefix;

        //Execute Solution
        commonPrefix = Problem14.LongestCommonPrefix(strs);

        //Solution printed out to console
        System.out.println(commonPrefix);

    }//end runProblem14()
}

