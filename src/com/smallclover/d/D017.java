package com.smallclover.d;

import java.util.Scanner;

/**
 * 最大と最小
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] n = new Integer[5];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int max = 0;
        int min = 99;
        for (int i = 0; i < n.length; i++) {
            if (max <= n[i]) {
                max = n[i];
            }

            if (min >= n[i]) {
                min = n[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
