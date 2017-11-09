package com.smallclover.c;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * アドレス調査
 * @author smallclover
 * @create 2017-11-08
 * @since
 */
public class C005 {
    static Pattern p = Pattern.compile("((?:(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(?:25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d))))");

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        String [] strs = new String [n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }

        for (int i = 0; i < strs.length; i++) {
            Matcher m = p.matcher(strs[i]);
            if (m.matches()){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    }
}
