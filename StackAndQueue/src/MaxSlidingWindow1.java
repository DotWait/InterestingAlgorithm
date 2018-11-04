import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.
 *
 * Example:
 *
 * Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 *
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *
 */
public class MaxSlidingWindow1 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length < k || k == 0) return new int[]{};
        int[] result = new int[nums.length - k + 1];
        int begin;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            begin = i - k + 1;
            if (deque.isEmpty())
                deque.add(i);
            else if (begin > deque.peekFirst())
                deque.pollFirst();

            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.pollLast();
            deque.add(i);
            if (begin >= 0)
                result[begin] = nums[deque.peekFirst()];
        }
        return result;
    }
}
