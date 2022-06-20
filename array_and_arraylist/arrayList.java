package array_and_arraylist;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // arraylist creating

//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i =0; i<5; i++){
//            list.add(in.nextInt());
//        }
//
//        System.out.println(list);
//
//
        // 2d arraylist

        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        for(int i =0; i<2; i++){
            list1.add(new ArrayList<>());
        }

        for(int i =0; i<2; i++){
            for(int j =0; j<3; j++){
            list1.get(i).add(in.nextInt());
            }
        }
        System.out.println(list1);
    }
}
