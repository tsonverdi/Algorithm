package QuickSort;

import java.util.Arrays;

public class QuickSortRunner {

    public static void main(String[] args) {
        int[] arr ={3,5,4,22,1345,34,11,5};
        System.out.println("QuickSort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("QuickSort işlemi sonrası : ");
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
    }
}
