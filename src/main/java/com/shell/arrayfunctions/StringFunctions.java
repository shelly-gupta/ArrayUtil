package com.shell.arrayfunctions;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class StringFunctions
{

    public void reverseString(String str1){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int k =0;k<T;k++) {
            String str = scanner.next();
            char[] reversed = new char[str.length()];
            int j = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed[j++] = str.charAt(i);
            }
            System.out.println(reversed);

        }
    }

    public String recursiveReverse(String str){
        if(str == null || str.length()<=1){
            System.out.println(str);
            return str;
        }
        System.out.println(str.charAt(str.length()-1));
        return recursiveReverse(str.substring(0,str.length()-1));

    }
}
