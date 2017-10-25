package com.smallclover.d;

import java.util.Scanner;

/**
 * 掛け算のリスト
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            if (i == 9) {
                System.out.print(n + (i - 1)*n);
            }else {
                System.out.print(n + (i - 1)*n + " ");
            }
        }
        System.out.println();
    }
}
