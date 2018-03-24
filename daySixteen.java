// Exceptions - String to Integer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class daySixteen {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        int number = 0;
        
        try{
            number = Integer.parseInt(S);
            System.out.println(S);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        //System.out.println(S);
        /*finally{
            System.out.println(S);
        }*/
    }
}