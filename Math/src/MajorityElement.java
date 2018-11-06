import java.util.*;

public class MajorityElement {
    /**
     * 使用Map的方式求众数
     *
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],0);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)->(o2.getValue()-o1.getValue()));
        return list.get(0).getKey();
    }

    /**
     * 使用排序的方法
     *
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     * @param nums
     * @return
     */
    public static int majorityElementBySort(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * 使用抵消的方法
     *
     * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在众数。
     * @param nums
     * @return
     */
    public static int majorityElementByNegative(int[] nums){
        int count =1;
        int max = nums[0];

        for(int i =1 ; i<nums.length ; i++){
            int num=nums[i];

            if(num==max){
                count++;
            } else {
                count--;
                if(count==0){
                    count=1;
                    max=nums[i];
                }
            }
        }

        return max;
    }
}
