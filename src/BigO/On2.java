package BigO;

public class On2 {
    public static void main(String[] args) {

        int count = 0;

        int[] arr = {2,1,5};

        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                System.out.println(i + "inci elemanla digerlerinin toplami " + (arr[i]+ arr[j]));
                count++;
            }
        }
        System.out.println("count: " + count);
    }
}
