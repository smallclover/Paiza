package com.smallclover.d;

import java.util.Scanner;

/**
 * 等差数列
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.print(a + (i - 1) * d);
            }else {
                System.out.print(a + (i - 1) * d + " ");
            }
        }
    }
}
