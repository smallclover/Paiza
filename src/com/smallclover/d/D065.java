package com.smallclover.d;

import java.util.Scanner;

/**
 * エラーコードの分類
 * @author smallclover
 * @create 2017-10-20
 * @since
 */
public class D065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String info = sc.nextLine();
        char[] chars = info.toCharArray();
        if (chars[0] == '2'){
            System.out.println("ok");
        }else if(chars[0] == '4'){
            System.out.println("error");
        }else {
            System.out.println("unknown");
        }
    }
}
