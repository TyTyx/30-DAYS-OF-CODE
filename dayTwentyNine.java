// Bitwise AND

import java.io.*;
import java.util.*;

public class dayTwentyNine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i = 0; i < x; i++){
            int n = scan.nextInt();
            int k = scan.nextInt();
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);               
            }
        }
    }
}