package com.smallclover.d;

import java.util.Scanner;

/**
 * 数字の出力
 * @author smallclover
 * @create 2017-10-26
 * @since
 */
public class D025 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 1) {
            System.out.println("00" + str);
        }else if (str.length() == 2){
            System.out.println("0" + str);
        }else {
            System.out.println(str);
        }
    }
}
