package com.smallclover.d;

import java.util.Scanner;

/**
 * 雨と晴れの記録
 * @author smallclover
 * @create 2017-10-19
 * @since
 */
public class D068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  day = sc.nextLine();
        String str = sc.nextLine();
        int s = 0;
        int r = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'S') {
                s++;
            }else {
                r++;
            }
        }
        System.out.println(s + " " + r);
    }
}
