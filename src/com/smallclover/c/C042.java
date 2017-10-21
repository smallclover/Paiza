package com.smallclover.c;

import java.util.Scanner;

/**
 * リーグ表の作成
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class C042 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer [] match = new Integer[n*(n - 1) + 1];
        String [][] result = new String[n + 1][n + 1];
        for (int i = 1; i <= n*(n-1); i++) {
            match[i] = sc.nextInt();
        }

        for (int i = 1; i <= n*(n - 1)/2; i++) {
            result[match[2 * i - 1]][match[2 * i]] = "W";
            result[match[2 * i]][match[2 * i - 1]] = "L";
        }
        for (int i = 1; i <= n; i ++){
            result[i][i] = "-";
        }

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (j < n){
                    System.out.print(result[i][j] + " ");
                }else {
                    System.out.print(result[i][j]);
                }
            }
            System.out.println();
        }
    }
}
