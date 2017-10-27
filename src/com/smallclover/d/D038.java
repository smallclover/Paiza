package com.smallclover.d;

import java.util.Scanner;

/**
 * 試合の回数
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class D038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a*(a - 1)/2);
    }
}
