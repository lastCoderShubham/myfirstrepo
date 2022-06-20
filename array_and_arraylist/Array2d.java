package array_and_arraylist;
import java.util.*;

public class Array2d {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // deceration of 2d array
        int[][] arr = new int[3][3];

        int[][] ar = {{1,2,3}, {4,5,6}, {7,8,9}};

        // input in 2d array
        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                arr[row][col] = in.nextInt();
            }
        }
        for (int[] a:arr) {
            System.out.println(a);
        }
    }
}
