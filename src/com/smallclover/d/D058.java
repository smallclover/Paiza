package com.smallclover.d;

import java.util.Scanner;

/**
 * 初詣で
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D058 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < l; i++) {
            System.out.print("A");
        }
        for (int i = 0; i < m; i++) {
            System.out.print("B");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("A");
        }
        System.out.println();
    }
}
