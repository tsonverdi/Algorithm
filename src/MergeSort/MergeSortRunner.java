package MergeSort;

import java.util.Arrays;

public class MergeSortRunner {

    public static void main(String[] args) {
        int arr[] = {5,3,4,2,6,5,897};
        System.out.println("MergeSort Öncesi Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("*************************");
        System.out.println("MergeSort Sonrası Array : ");
        MergeSort.mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
 /*AÇIKLAMA : Diziyi ikiye bölüp oluşan alt kümeleri tekrar
         birleştirmeli sıralama algoritmasına alıyor ve böylece
         dizi sürekli ikiye bölünmüş oluyor. Elemanları ikişerli
         olarak karşılaştırıp sıralı biçimde birleştiriyor, daha
         sonra bu iki elemanlı alt kümeleri sıralı biçimde
         birleştirerek dört elemanlı alt kümeler elde ediyor.
         Böyle devam ettiğimizde, örneğin dizimiz 16 elemanlı ise
         elimizde 8 elemanlı, elemanları sıralı iki alt küme kalıyor.
         Bu alt kümeleri de aynı şekilde sıralı biçimde
         birleştirdiğimiz zaman dizimiz sıralanmış oluyor.

         TIME COMPLEXITY : en kötü durumda O(nlogn) sürede
         zaman götürüyor. Teorik olarak yukarıdaki 3 algoritmadan da kısa
         zamanda işini görüyor denilebilir. Bellek kullanımında ise bu
         metodun önceki yöntemlere göre dezavantajı var. Birleştirmeli
         sıralama O(n)'lik bir ekstra bellek kullanıyor ki bu da boyutu
         büyük elemanlara sahip çok elemanlı dizileri sıralarken kendini
         fazlasıyla belli edecektir.*/