package com.smallclover.d;

import java.util.Scanner;

/**
 * 【キャンペーン問題】家族で分ける
 * @author smallclover
 * @create 2017-11-27
 * @since
 */
public class D081 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(w*m%n);
    }
}
