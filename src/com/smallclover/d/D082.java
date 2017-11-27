package com.smallclover.d;

import java.util.Scanner;

/**
 * 2つの単語
 * @author smallclover
 * @create 2017-11-27
 * @since
 */
public class D082 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] achr = a.toCharArray();
        char[] bchr = b.toCharArray();
        if (bchr[bchr.length - 1] != 'n' && achr[achr.length - 1] == bchr[0]) {
            System.out.println("OK");
        }else {
            System.out.println("NG");
        }
    }
}
