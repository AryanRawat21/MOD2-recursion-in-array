
import java.util.*;

public class FirstIndexInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = firstIndex(arr, 0, x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length)
            return -1;

            //for finding in first iteration while going up
        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = firstIndex(arr, idx + 1, x);
            return fiisa; // fiisa stands for firstIndex in smaller array.
        }
    }


    
}