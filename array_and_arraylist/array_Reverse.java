package array_and_arraylist;
import java.util.*;

public class array_Reverse {
    public static void main(String[] args) {
        int[] arr = {12, 44, 45, 67, 78};
        arr = reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] ar){
        int start = 0, end = ar.length-1;
        while(start<end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end--;
        }
        return ar;
    }

}
