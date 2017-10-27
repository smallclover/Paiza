package com.smallclover.d;

import java.util.Scanner;

/**
 * 頭文字
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class D033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.substring(0, 1) + "." + b.substring(0, 1));
    }
}
