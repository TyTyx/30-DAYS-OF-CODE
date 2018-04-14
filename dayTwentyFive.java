// Running Time and Complexity

import java.io.*;
import java.util.*;

public class dayTwentyFive {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y;
        for(int i = 0; i <= x; i++){
            y = scan.nextInt();
            System.out.println(isPrime(y));
        }
        
    }
    public static String isPrime(int n){
        if(n == 1){
            return "Not prime";
        }
        if(n == 2){
            return "Prime";
        }
        for (int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }
    
}