package com.smallclover.c;

import java.util.Scanner;

/**
 * 先生の宿題
 * @author smallclover
 * @create 2017-11-01
 * @since
 */
public class C034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = str.substring(0, 1);
        String op = str.substring(2, 3);
        String b = str.substring(4, 5);
        String result = str.substring(8, 9);
        if (a.equals("x")) {
            if (op.equals("-")) {
                System.out.println(cast(b) + cast(result));
            }else {
                System.out.println(cast(result) - cast(b));
            }
        }else if (b.equals("x")){
            if (op.equals("-")) {
                System.out.println(cast(a) - cast(result));
            }else {
                System.out.println(cast(result) - cast(a));
            }
        }else {
            if (op.equals("-")) {
                System.out.println(cast(a) - cast(b));
            }else {
                System.out.println(cast(a) + cast(b));
            }
        }
    }

    public static int cast(String str){
        return Integer.valueOf(str);
    }
}
