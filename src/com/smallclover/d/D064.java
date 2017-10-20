package com.smallclover.d;

import java.util.Scanner;

/**
 * 嘘つきの日
 * @author smallclover
 * @create 2017-10-20
 * @since
 */
public class D064 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = str.replace("False", "True");
        System.out.println(str2);
    }
}
