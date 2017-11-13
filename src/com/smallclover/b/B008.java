package com.smallclover.b;

import java.util.Scanner;

/**
 * 地下アイドルの夢
 * @author smallclover
 * @create 2017-11-13
 * @since
 */
public class B008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[][] e = new Integer[m + 1][n + 1];
        if (m == 0 || n == 0 || (m == 0 && n == 0)){
            System.out.println(0);
            return;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                e[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for (int i = 1; i <= m; i++) {
            int mid_result = 0;
            for (int j = 1; j <= n; j++) {
                mid_result += e[i][j];
            }
            if (mid_result >= 0){
                result += mid_result;
            }
        }
        System.out.println(result);
    }
}
