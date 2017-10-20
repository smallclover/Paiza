package com.smallclover.d;

import java.util.Scanner;

/**
 * ひな祭り
 * @author smallclover
 * @create 2017-10-20
 * @since
 */
public class D062 {
    public static void main(String[] args){
        char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i < a; i++){
            System.out.print(chars[i]);
        }
        System.out.println();
        for (int i = a; i < a + b; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        for (int i = a + b; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}
