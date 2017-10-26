package com.smallclover.d;

import java.util.Scanner;

/**
 * 文字列の一致
 * @author smallclover
 * @create 2017-10-26
 * @since
 */
public class D021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        if (str.equals(str2)){
            System.out.println(str.length() == str2.length()? "Yes":"No");
        }else {
            System.out.println("No");
        }
    }
}
