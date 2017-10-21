package com.smallclover.d;

import java.util.Scanner;

/**
 * お月見だんご
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D050 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n > 5 && m > 5){
            System.out.println(10);
        }else if(n > 5 && m <= 5){
            System.out.println(5 + m);
        }else if (n <= 5 && m > 5){
            System.out.println(n + 5);
        }else {
            System.out.println(m + n);
        }
    }
}
