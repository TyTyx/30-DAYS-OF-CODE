// Arrays

import java.io.*;
import java.util.*;


public class DaySeven {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int counter = arr.length-1; counter >= 0; counter--){
            System.out.print(arr[counter]+ " ");
        }
    }
}