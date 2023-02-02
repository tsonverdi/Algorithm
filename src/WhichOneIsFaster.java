import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import QuickSort.QuickSort;
import SelectionSort.SelectionSort;
import ShellSort.ShellSort;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {
    public static void main(String[] args) {
        int[] siraliDizi = createOrderedArray(1000000);
        int[] randomDizi = createArray(10000);
        int[] randomDizi2 = Arrays.copyOf(randomDizi,randomDizi.length);//usttekini cloneladik.
        int[] randomDizi3 = Arrays.copyOf(randomDizi,randomDizi.length);//usttekini cloneladik.
        int[] randomDizi4 = Arrays.copyOf(randomDizi,randomDizi.length);//usttekini cloneladik.
        int[] randomDizi5 = Arrays.copyOf(randomDizi,randomDizi.length);//usttekini cloneladik.
        int[] randomDizi6 = Arrays.copyOf(randomDizi,randomDizi.length);//usttekini cloneladik.
        int[] randomDizi7 = Arrays.copyOf(randomDizi,randomDizi.length);//usttekini cloneladik.

        long start;
        long end;
        double estimatedTime;

        //InsertionSort
        start = System.currentTimeMillis();
        InsertionSort.insertionSort(siraliDizi);
        end=System.currentTimeMillis();
        estimatedTime=(double) (end-start)/1000;
        System.out.println("Insertion Sort time : " + estimatedTime);//Fark atiyor. Elimdeki randomsa insertion koyar gecer
                                                                    //Ozellikle veri seti arttikca aradaki farki artiyor. Daha hizli slectiona gore

//        //SelectionSort
//        start = System.currentTimeMillis();
//        SelectionSort.selectionSort(siraliDizi);
//        end=System.currentTimeMillis();
//        estimatedTime=(double) (end-start)/1000;
//        System.out.println("Selection Sort time : " + estimatedTime);

        //BubbleSort
        start = System.currentTimeMillis();//Ozellikle sirali bir listeyi siralamak icin en iyi sonuclardan birisi.
        BubbleSort.bubbleSort(siraliDizi);
        end=System.currentTimeMillis();
        estimatedTime=(double) (end-start)/1000;
        System.out.println("Bubble Sort time : " + estimatedTime);//Eleman arttikca bubble sort digerlerine gore daha yavasliyor

        //MergeSort
        start = System.currentTimeMillis();
        MergeSort.mergeSort(siraliDizi,0,siraliDizi.length-1);
        end=System.currentTimeMillis();
        estimatedTime=(double) (end-start)/1000;
        System.out.println("Merge Sort time : " + estimatedTime);//Muthis hizli korkunc hizli

        //QuickSort
//        start = System.currentTimeMillis();
//        QuickSort.quickSort(siraliDizi,0,siraliDizi.length-1);
//        end=System.currentTimeMillis();
//        estimatedTime=(double) (end-start)/1000;
//        System.out.println("Quick Sort time : " + estimatedTime);//Mergeden daha hizli cikti.//Sirali dizide stackoverflow atti

        //ShellSort
        start = System.currentTimeMillis();
        ShellSort.shellSort(siraliDizi);
        end=System.currentTimeMillis();
        estimatedTime=(double) (end-start)/1000;
        System.out.println("Shell Sort time : " + estimatedTime);

        //Arrays.sort()
        start = System.currentTimeMillis();
        Arrays.sort(siraliDizi);
        end=System.currentTimeMillis();
        estimatedTime=(double) (end-start)/1000;
        System.out.println("Arrays.Sort time : " + estimatedTime);
    }

    public static int[] createArray(int elemanSayisi){
        int[]arr = new int[elemanSayisi];
        Random random = new Random();
        for (int i = 0; i<arr.length;i++){
            arr[i]= random.nextInt(10000);
        }
        return arr;
    }
    public static int[] createOrderedArray(int elemanSayisi){
        int[]arr = new int[elemanSayisi];
        for (int i = 0;i<arr.length;i++){
            arr[i]=i;
        }
        return arr;
    }
}
