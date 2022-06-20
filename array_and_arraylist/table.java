package array_and_arraylist;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("enter the number that you want get table");
        int num = in.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "X" + i + "=" +num*i);
        }
    }
}
