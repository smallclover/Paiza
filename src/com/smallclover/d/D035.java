package com.smallclover.d;

import java.util.Scanner;

/**
 * 日付のデータ
 * @author smallclover
 * @create 2017-10-27
 * @since
 */
public class D035 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String y = sc.next();
        String m = sc.next();
        String d = sc.next();
        System.out.println(y+"/"+m+"/"+d);
    }
}
