package QuickSort;

public class QuickSort {
    public static int partition(int arr [],int alt,int ust){
        //dizinin son elemanini pivot seciyoruz

        int pivot = arr[ust];
        int i = (alt-1);
        //ilk iterastondaki yer degistirme islemine getiriyorum
        for (int j=alt;j<ust;j++){
            if (arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[i]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[ust];
        arr[ust]=temp;

        return i+1;
    }

    public static void quickSort(int arr[],int alt,int ust){
        if (alt<ust){
            int pi = partition(arr,alt,ust);
            quickSort(arr,alt,pi-1);//pivatonu sol tarafi icin recursive calisir.
            quickSort(arr,pi+1,ust);//pivotun sag tarafi icin calisir.

        }
    }


}
