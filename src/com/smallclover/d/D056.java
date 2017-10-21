package com.smallclover.d;

import java.util.Scanner;

/**
 * かまくらづくり
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D056 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n*n*n - m*m*m);
    }
}
