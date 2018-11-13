package sort;

public class QuickSort {
    /**
     * QuickSort
     * 快速排序算法
     * （1）原地排序算法，分区算法不使用额外存储空间即可
     * （2）不稳定的排序算法
     * （3）最好时间复杂度O（n*log（n））
     *      最坏时间复杂度O（n^2）
     *      平均时间复杂度O（n*log（n）），快排在极端情况才会退化到O（n^2），
     *      大部分都是O（n*log（n））
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int[] quickSort(int[] arr,int low,int high){
        if (low < high){
            int pivot =partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        return arr;
    }

    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low;
        for (int j=low;j<high;j++){
            if(arr[j] < pivot){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }
}
