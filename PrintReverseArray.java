
import java.util.*;

public class PrintReverseArray {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
    }

    public static void printReverse(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        printReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        printReverse(arr, 0);
    }
}

// import java.io.*;
// import java.util.*;

// public class PrintReverseArray{

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
        
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         displayArrReverse(arr, 0);
//     }

//     public static void displayArrReverse(int[] arr, int idx) {
//         if(idx == arr.length){
//             return;
//         }
        
//         displayArrReverse(arr, idx + 1);
//         System.out.println(arr[idx]);
//     }

// }