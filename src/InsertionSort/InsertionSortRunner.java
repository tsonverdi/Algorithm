package InsertionSort;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class InsertionSortRunner {

    public static void main(String[] args) {
        int[] arr = {7,4,5,9,8,2,1};
        System.out.println(Arrays.toString(arr));
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }





}
