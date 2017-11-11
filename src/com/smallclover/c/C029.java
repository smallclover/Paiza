package com.smallclover.c;

import java.util.Scanner;

/**
 * 旅行の計画
 * @author smallclover
 * @create 2017-11-11
 * @since
 */
public class C029 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[s];
        Integer[] b = new Integer[s];
        Double[] c = new Double[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i <= (s - m); i++) {
            double avg = 0;
            for (int j = i; j <= (i + m - 1); j++) {
                avg += b[j];
            }
            c[i] = avg/m;
        }

        double mid = c[0];
        int result = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null){
                if (mid > c[i]) {
                    mid = c[i];
                    result = i;
                } else if (mid <= c[i]){

                }
            }else {
                continue;
            }
        }
        int start = a[result];
        int end = a[result] + m - 1;
        System.out.println(start + " " + end);
    }
}
