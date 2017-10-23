package com.smallclover.d;

import java.util.Scanner;

/**
 * メダリストの表示
 * @author smallclover
 * @create 2017-10-23
 * @since
 */
public class D047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println("Gold " + str[0]);
        System.out.println("Silver " + str[1]);
        System.out.println("Bronze " + str[2]);
    }
}
