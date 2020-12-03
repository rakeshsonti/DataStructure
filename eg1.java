import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str[] = bf.readLine().split("\\s+");
        int size = Integer.parseInt(str[0]);
        str = bf.readLine().split("\\s+");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        } // for
        System.out.println(Arrays.toString(arr));
    }// main
}