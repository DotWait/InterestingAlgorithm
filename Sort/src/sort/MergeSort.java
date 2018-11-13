package sort;

import java.util.Arrays;

public class MergeSort {
    /**
     * MergeSort
     * 归并排序
     * （1）不是原地排序算法，在合并函数出需要额外的存储空间，临时空间开辟后可以马上释放，
     *      因此空间复杂度是O（n）
     * （2）稳定的排序算法
     * （3）最好的时间复杂度O（n*log（n））
     *     最坏的时间复杂度O（n*log（n））
     *     平均的时间复杂度O（n*log（n））
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int[] mergeSort(int[] arr,int low,int high){
        int mid = (low + high) / 2;
        if (low < high){
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
        return arr;
    }

    public static void merge(int[] arr,int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[high-low+1];
        while (i<=mid && j<=high){
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        while (i<=mid)
            temp[k++] = arr[i++];
        while (j<=high)
            temp[k++] = arr[j++];
        for (int t=0;t<temp.length;t++)
            arr[t+low] = temp[t];
    }
}
