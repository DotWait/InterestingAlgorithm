import sort.InsertionSort;
import sort.MergeSort;
import sort.QuickSort;
import utils.Init;

public class Main {

    public static void main(String[] args) {
        //Test: InsertionSort
/*        int[] arr = Init.initNum(500);
        long start = System.currentTimeMillis();
        int[] sort = InsertionSort.insertionSort(arr);
        long end = System.currentTimeMillis();
        for (int i : sort)
            System.out.println(i);
        System.out.println("time = "+(end - start));*/

        //Test: MergeSort
/*        int[] arr = Init.initNum(500);
        long start = System.currentTimeMillis();
        int[] sort = MergeSort.mergeSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        for (int i : sort)
            System.out.println(i);
        System.out.println("time = "+(end - start));*/

        //Test: QuickSort
        int[] arr = Init.initNum(50);
        long start = System.currentTimeMillis();
        int[] sort = QuickSort.quickSort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        for (int i : sort)
            System.out.println(i);
        System.out.println("time = "+(end - start));
    }
}
