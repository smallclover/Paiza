package com.smallclover.d;

import java.util.Scanner;

/**
 * はじめまして
 * @author smallclover
 * @create 2017-10-23
 * @since
 */
public class D044 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String sex = sc.next();
        if (sex.equals("F")){
            System.out.println("Hi, " + "Ms. " + name);
        }else {
            System.out.println("Hi, " + "Mr. " + name);
        }
    }
}
