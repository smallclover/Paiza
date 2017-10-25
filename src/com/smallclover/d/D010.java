package com.smallclover.d;

import java.util.Scanner;

/**
 * Eメールアドレス
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1 + "@" + str2);
    }
}
