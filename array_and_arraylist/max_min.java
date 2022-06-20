package array_and_arraylist;

public class max_min {
    public static void main(String[] args) {

        int[] arr ={12, 34 ,45 ,56, 34, 5};

        int max = maxVal(arr);
        int min = minVal(arr);
        System.out.println(max + " " + min);
    }
    static int maxVal(int[] ar){
        int max = ar[0];
        for(int i = 0; i<ar.length-1; i++){
            if(ar[i] < ar[i+1]){
                max = ar[i+1];
            }
        }
        return max;
    }
    static int minVal(int[] ar) {
        int min = ar[0];
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] > ar[i + 1]) {
                min = ar[i + 1];
            }
        }
        return min;
    }
}
