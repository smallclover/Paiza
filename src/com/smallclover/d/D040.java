package com.smallclover.d;

import java.util.Scanner;

/**
 * 連休の天気
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D040 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            Integer[] n = new Integer[7];
            for (int i = 0; i < n.length; i++) {
                n[i] = sc.nextInt();
            }

            int calc = 0;

            for (int i = 0; i < n.length; i++) {
                if (n[i] <= 30) {
                    calc++;
                }
            }

            System.out.println(calc);
        }
}
