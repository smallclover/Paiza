package com.smallclover.d;

import java.util.Scanner;

/**
 * 禁止ワード
 * @author smallclover
 * @create 2017-10-17
 * @since
 */
public class D076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String s = sc.nextLine();
        if (s.contains(w)) {
            System.out.println("NG");
        }else {
            System.out.println(s);
        }
    }
}
