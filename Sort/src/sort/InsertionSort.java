package sort;

public class InsertionSort {
    /**
     * InsertionSort
     * 插入排序
     * （1）原地排序算法，不需要额外的存储空间，空间复杂度O（1）
     * （2）对于值相同的元素，可以将后面出现的元素插入到前面出现元素的后面，
     *      可以保持原有的先后顺序不变，所以是稳定的排序算法
     * （3）最好的时间复杂度O（n），本身有序
     *     最坏的时间复杂度O（n^2），本身倒序
     *     平均的时间复杂度O（n）
     * @param arr
     * @return
     */
    public static int[] insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int j = i;
            int temp = arr[j];
            while (j>0 && temp < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
