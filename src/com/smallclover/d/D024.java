package com.smallclover.d;

import java.util.Scanner;

/**
 * 三角形の内角の和
 * @author smallclover
 * @create 2017-10-26
 * @since
 */
public class D024 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(180 - a - b);
    }
}
