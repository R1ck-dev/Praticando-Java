package LeetCode;

import java.util.Arrays;

class SolutionMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        // System.out.println(Arrays.toString(mergedArray));

        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0) {
            int indexMedian = mergedArray.length/2;
            double median = ((double) mergedArray[indexMedian-1] + (double) mergedArray[indexMedian])/2;
            return median;
        } else {
            int indexMedian = mergedArray.length/2;
            double median = mergedArray[indexMedian];
            return median;
        }
    }
}

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        SolutionMedianOfTwoSortedArrays solu = new SolutionMedianOfTwoSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double output = solu.findMedianSortedArrays(nums1, nums2);
        System.out.println(output);
    }
}