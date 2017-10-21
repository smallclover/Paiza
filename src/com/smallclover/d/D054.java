package com.smallclover.d;

import java.util.Scanner;

/**
 * 11/11
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D054 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chr = str.toCharArray();
        if (chr.length >= 11){
            System.out.println("OK");
        }else {
            System.out.println(11 - chr.length);
        }
    }
}
