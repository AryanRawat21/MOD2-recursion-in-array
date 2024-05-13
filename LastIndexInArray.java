
import java.util.*;

public class LastIndexInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = indexLast(arr, 0, x);
        System.out.println(fi);
    }

    public static int indexLast(int[] arr, int idx, int x) {
        if (idx == arr.length)
            return -1;

        int liisa = indexLast(arr, idx + 1, x); // liisa-last index in smaller array
        if (liisa == -1) {
            if (arr[idx] == x) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;   //check while coming back
        }
    }

}