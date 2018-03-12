// Recursion

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayNine {

    static int factorial(int n) {
        // Complete this function
        if(n == 1){
            return 1;
        }
        else{
            int output = factorial(n-1)* n;
            return output;
        }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}