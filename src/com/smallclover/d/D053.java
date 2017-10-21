package com.smallclover.d;

import java.util.Scanner;

/**
 * トリック・オア・トリート
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D053 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.equals("candy") || str.equals("chocolate")) {
            System.out.println("Thanks!");
        }else {
            System.out.println("No!");
        }
    }
}
