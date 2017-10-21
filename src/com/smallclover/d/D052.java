package com.smallclover.d;

import java.util.Scanner;

/**
 * ピラミッドの作り方
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)/2);
    }
}
