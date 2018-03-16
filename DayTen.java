// Binary Numbers

import java.io.*;
import java.util.*;

public class DayTen {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        char [] twoBase = Integer.toBinaryString(x).toCharArray();
        int counter = 0;
        int max=0;

        for(char nums: twoBase){
            if(nums =='1'){
                counter++;   
            } else{

                counter=0;
            }
            if(max<counter)
                max = counter;
        }

        System.out.println(max);
    }
}