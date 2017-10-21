package com.smallclover.d;


import java.util.Scanner;

/**
 * 衣替え
 * @author smallclover
 * @create 2017-10-21
 * @since
 */
public class D051 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.replace(" ","");
        char [] chr = str.toCharArray();
        int n = 0;
        for (int i = 0; i < chr.length; i++) {
            if (chr[i] == 'W') {
                n++;
            }
        }

        if (n >= 5){
            System.out.println("OK");
        }else {
            System.out.println("NG");
        }
    }
}
