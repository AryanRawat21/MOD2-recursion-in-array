import java.util.*;


public class MaxInArray{
    public static Scanner scn = new Scanner(System.in); 
    public static int maxArray(int[] arr,int idx){
        if(idx == arr.length - 1){
            return arr[idx];    
        }
        
        int misa = maxArray(arr,idx+1);
        if(misa>arr[idx]){
            return misa;

        }else{
            return arr[idx];
        }
        
        
        
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
        int max = maxArray(arr, 0);
        System.out.println(max);
        
}

}

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         // write your code here
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < arr.length; i++){
//             arr[i] = scn.nextInt();
//         }
        
//         int max = maxOfArray(arr, 0);
//         System.out.println(max);
//     }

//     public static int maxOfArray(int[] arr, int idx){
//         if(idx == arr.length - 1){
//             return arr[idx];
//         }
        
//         int misa = maxOfArray(arr, idx + 1);
//         if(misa > arr[idx]){
//             return misa;
//         } else {
//             return arr[idx];
//         }
//     }

// }