package com.smallclover.d;

import java.util.Scanner;

/**
 * スタミナの計算
 * @author smallclover
 * @create 2017-10-20
 * @since
 */
public class D066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m > n){
            System.out.println("No");
        }else {
            System.out.println(n - m);
        }
    }
}
