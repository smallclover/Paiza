package com.smallclover.d;

import java.util.Scanner;

/**
 *  数の比較
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        }else if (a < b){
            System.out.println(b);
        }else {
            System.out.println("eq");
        }
    }
}
