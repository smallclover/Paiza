package com.smallclover.d;

import java.util.Scanner;

/**
 * 行列
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D042 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] n = new Integer[4];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        System.out.println(n[0]*n[3] - n[1]*n[2]);
    }
}
