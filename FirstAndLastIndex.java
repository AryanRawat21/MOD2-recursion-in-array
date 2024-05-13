import java.io.*;
import java.util.*;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        System.out.println(firstIdx(arr, 0, d));
        System.out.println(indexLast(arr, 0, d));
    }

    public static int firstIdx(int[] arr, int idx, int data) {
        if (idx == arr.length)
            return -1;
        if (arr[idx] == data)
            return idx;
        return firstIdx(arr, idx + 1, data);
    }

    public static int indexLast(int[] arr, int idx, int data) {
        if (idx == arr.length)
            return -1;

        int liisa = indexLast(arr, idx + 1, data); // liisa-last index in smaller array
        if (liisa == -1) {
            if (arr[idx] == data) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }
}