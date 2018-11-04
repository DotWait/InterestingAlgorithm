import java.util.PriorityQueue;

/**
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream. For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.
 *
 * Example:
 *
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 *
 */
public class KthLargest {
    private int k;
    private PriorityQueue<Integer> priorityQueue;

    /**
     * 数据流中最大的k个元素
     * 方法一：将k个元素排序，使用快排，时间复杂度为N*k*log(k)
     * 方法二：使用优先队列，时间复杂度为N*log(k)
     * 实现的机制是MinHeap，堆的最顶层是最小值，整个堆的个数为k
     * @param k
     * @param nums
     */
    public KthLargest(int k, int[] nums){
        this.k = k;
        priorityQueue = new PriorityQueue<Integer>(k);
        for(int num : nums)
            add(num);
    }

    /**
     * 数据流中来一个数据，通过add方法添加，每次比较堆的最顶层的最小值即可
     * @param val
     * @return
     */
    public int add(int val){
        if(priorityQueue.size() < k)
            priorityQueue.offer(val);
        else if(priorityQueue.peek() < val){
            priorityQueue.poll();
            priorityQueue.offer(val);
        }
        return priorityQueue.peek();
    }
}
