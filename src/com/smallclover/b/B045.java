package com.smallclover.b;

import java.util.Scanner;

/**
 * 計算ドリル
 * @author smallclover
 * @create 2017-11-13
 * @since
 */
public class B045 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mid_m = 0;
        int mid_n = 0;
        for (int i = 0; i <= 99 && mid_m < m; i++) {
            for (int j = 0; j <= 99 && mid_m < m; j++) {
                if ( i + j <= 99){
                    System.out.println(i + " " + "+" + " " + j + " =");
                    mid_m++;
                }
            }
        }

        for (int i = 99; i >= 0 && mid_n < n; i--) {
            for (int j = 0; j <= 99 && mid_n < n; j++) {
                if (i >= j){
                    System.out.println(i + " " + "-" + " " + j + " =");
                    mid_n++;
                }
            }
        }
    }
}
