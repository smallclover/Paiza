package com.smallclover.d;

import java.util.Scanner;

/**
 * 文字列の結合
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D004 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String[] str = new String[20];
            for (int i = 0; i < n; i++) {
                    str[i] = sc.next();
            }

            System.out.print("Hello ");
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    System.out.print(str[i] + ".");
                }else {
                    System.out.print(str[i] + ",");
                }
            }
        }
}
