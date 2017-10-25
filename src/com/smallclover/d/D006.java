package com.smallclover.d;

import java.util.Scanner;

/**
 * 単位の計算
 * @author smallclover
 * @create 2017-10-25
 * @since
 */
public class D006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        if (str.equals("km")) {
            System.out.println(n*1000000);
        }else if(str.equals("cm")){
            System.out.println(n*10);
        }else if (str.equals("m")){
            System.out.println(n*1000);
        }
    }
}
