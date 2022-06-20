package array_and_arraylist;
import java.util.*;

public class arrayIntro {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    // 1 d array decleration
    int[] arr = new int[5];

    // second type decleration and initialization
    int[] arr1 = {1, 2, 3, 4, 5};

    for(int i =0; i<5; i++){
        arr[i] = in.nextInt();
    }
    System.out.println(Arrays.toString(arr));
        for (int num: arr1) {
            System.out.print(num);
        }
}

}
