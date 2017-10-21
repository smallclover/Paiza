package com.smallclover.d;

import java.util.Scanner;

/**
 * トランプ占い
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D059 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] chr = str.toCharArray();
        if (chr[0] == 'J' && chr[2] == 'J') {
            System.out.println(chr[0] + " " + "Q");
        }else {
            System.out.println(chr[0] + " " + chr[2]);
        }
    }
}
