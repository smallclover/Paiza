package com.smallclover.d;

import java.util.Scanner;

/**
 * N文字目まで出力
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        char[] chr = str.toCharArray();
        for (int i = 0; i < n; i++) {
            System.out.print(chr[i]);
        }
    }
}
