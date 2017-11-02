package com.smallclover.c;

import java.util.Scanner;

/**
 * Leet文字列
 * @author smallclover
 * @create 2017-11-02
 * @since
 */
public class C016 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'A') {
                chr[i] = '4';
            }else if (chr[i] == 'E') {
                chr[i] = '3';
            }else if (chr[i] == 'G') {
                chr[i] = '6';
            }else if (chr[i] == 'I') {
                chr[i] = '1';
            }else if (chr[i] == 'O') {
                chr[i] = '0';
            }else if (chr[i] == 'S') {
                chr[i] = '5';
            }else if (chr[i] == 'Z') {
                chr[i] = '2';
            }else {
                continue;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chr.length; i++) {
            sb.append(chr[i]);
        }
        System.out.println(sb);
    }
}
