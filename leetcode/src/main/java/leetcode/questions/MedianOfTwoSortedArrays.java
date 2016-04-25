package leetcode.questions;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0;
    }
    
    public double findMedianNumber(int[] num, int startIndex, int endIndex) {
        double medianIndex = startIndex + ((double) endIndex - (double) startIndex) / 2;
        int ceilingMedianIndex = (int) Math.ceil(medianIndex);
        int floorMedianIndex = (int) Math.floor(medianIndex);
        return ((double) num[ceilingMedianIndex] + num[floorMedianIndex]) / 2;
    }
}
