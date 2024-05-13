import java.util.*;


public class PrintArray{
    public static Scanner scn = new Scanner(System.in); 
    public static void printArray(int[] arr,int idx){
        if(idx == arr.length)
        return;
        
        System.out.println(arr[idx]);
        printArray(arr, idx+1);
        
    }
     public static void input(int[] arr){
         int n = arr.length;
         for(int i = 0; i<n;i++){
             arr[i] = scn.nextInt();
         }
     }

     

public static void main(String[] args){
    int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        printArray(arr,0);
        
}

}
// import java.io.*;
// import java.util.*;

// public class PrintArray {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
        
//         int[] arr = new int[n];
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         displayArr(arr, 0);
        
//     }

//     public static void displayArr(int[] arr, int idx){
//         if(idx == arr.length){
//             return;
//         }
        
//         System.out.println(arr[idx]);
//         displayArr(arr, idx + 1);
//     }

// }