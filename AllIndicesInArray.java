import java.io.*;


public class AllIndicesInArray {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = getAllIndices(arr, x, 0, 0);

        if (iarr.length == 0) {
            System.out.println();
            return;
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
    }

    public static int[] getAllIndices(int arr[], int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        //comparision while going up, print while coming down
        if (arr[idx] == x) {
            int[] iarr = getAllIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = getAllIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}