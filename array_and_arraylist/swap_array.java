package array_and_arraylist;
import java.util.*;

public class swap_array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];

        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        arr = swap(arr, arr[2], arr[4]);
        System.out.println(Arrays.toString(arr));
    }
    static int[] swap(int ar[], int ind1, int ind2){
        int temp = ar[ind1];
        ar[ind1] = ar[ind2];
        ar[ind2] = temp;

        return ar;
    }
}
