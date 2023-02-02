package MergeSort;

public class MergeSort {

    public static void merge(int arr[],int left,int middle,int right){

        int low = middle -left + 1 ;  // size of left sub-array
        int high = right-middle ; // size of the right sub-array

        int[] L = new int[low];
        int[] R = new int[high];

        int i = 0 , j=0;
        for(i= 0; i<low ; i++) { // soldaki alt-array e elemanlar kopyalandı
            L[i] = arr[left+i];
        }
        for(j=0;j<high;j++){
            R[j] = arr[middle+1+j]; // sağdaki alt-array'e elemanlar kopyalanıyor
        }

        int k= left ;
        i=0;
        j=0;

        while(i<low && j<high) // sol ve sağ alt arrayler merge işlemi yapıldı
        {
            if(L[i] <=R[j])
            {
                arr[k]=L[i];
                i++;
            }
            else
            {
                arr[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<low)
        {
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<high)
        {
            arr[k]=R[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int arr[],int left,int right) {
        int middle ;
        if(left<right){
            middle=(left+right)/2;

            mergeSort(arr,left,middle); // sol alt-array
            mergeSort(arr,middle+1,right); // sağ alt-array
            merge(arr,left,middle,right); // sağ ve sol alt-arraylere merge işlemi yapılıyor

        }
    }
}
