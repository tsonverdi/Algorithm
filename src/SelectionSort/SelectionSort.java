package SelectionSort;

public class SelectionSort {

    public static void selectionSort(int arr[]){

        int min;

//        int count =0;

        for (int i = 0;i<arr.length;i++){
            min=i;
            for (int j = i+1;j< arr.length;j++){
                if (arr[min]>arr[j]){

                    min =j;
//                    count++;
                }
            }
            //swap islemi
            int temp =arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
//        System.out.println(count);

    }
}
