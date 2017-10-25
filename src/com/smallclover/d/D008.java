package com.smallclover.d;

import java.util.Scanner;

/**
 * 奇数か偶数か
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
