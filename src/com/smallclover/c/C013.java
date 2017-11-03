package com.smallclover.c;

import java.util.Scanner;

/**
 * 嫌いな数字
 * @author smallclover
 * @create 2017-11-02
 * @since
 */
public class C013 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        int n = sc.nextInt();
        String[] room = new String[n];
        for (int i = 0; i < room.length; i++) {
            room[i] = sc.next();
        }
        boolean flag = false;
        for (int i = 0; i < room.length; i++) {
            if (room[i].contains(key)) {
                continue;
            }else {
                flag = true;
                System.out.println(room[i]);
            }
        }
        if (!flag){
            System.out.println("none");
        }
    }
}
