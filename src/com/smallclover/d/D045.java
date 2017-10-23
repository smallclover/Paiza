package com.smallclover.d;

import java.util.Scanner;

/**
 * 通知票
 * @author smallclover
 * @create 2017-10-23
 * @since
 */
public class D045 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("D");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("B");
                break;
            case 5:
                System.out.println("A");
                break;
        }
    }
}
