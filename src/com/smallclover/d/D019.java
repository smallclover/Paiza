package com.smallclover.d;

import java.util.Scanner;

/**
 * 文字列からN番目
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        char [] chr = str.toCharArray();
        System.out.println(chr[n - 1]);
    }
}
