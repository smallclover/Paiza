package com.smallclover.d;

import java.util.Scanner;

/**
 * Aの個数
 * @author smallclover
 * @create 2017-10-26
 * @since
 */
public class D023 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
