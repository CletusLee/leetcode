package leetcode.questions

import spock.lang.*

class TestMedianOfTwoSortedArrays extends Specification {

    MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays()

    @Unroll
    def "the median of #nums between index #startIndex and #endIndex is #median"(int[] nums, int startIndex, int endIndex, double median) {
        expect:
        m.findMedianNumber(nums, startIndex, endIndex) == median

        where:
        nums                                                        | startIndex | endIndex || median
        [1, 10, 18, 19, 20, 28, 34, 35, 42, 46, 64, 68, 69, 87, 91] | 1          | 3        || 18
    }
}
