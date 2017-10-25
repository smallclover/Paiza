package com.smallclover.d;

import java.util.Scanner;

/**
 * 割り算
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a/b + " ");
        System.out.println(a%b);
    }
}
