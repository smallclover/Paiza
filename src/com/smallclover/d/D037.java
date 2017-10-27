package com.smallclover.d;

import java.util.Scanner;

/**
 * 花粉症でつらい
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class D037 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b%a == 0) {
            System.out.println(b/a);
        }else {
            System.out.println(b/a + 1);
        }
    }
}
