package com.smallclover.c;

import java.util.Scanner;

/**
 * ページネーション
 * @author smallclover
 * @create 2017-11-17
 * @since
 */
public class C045 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int p = sc.nextInt();
        if (n == 0){
            System.out.println("none");
        }else {
            if (n > s) {
                if (n%s == 0){
                    int num = n/s;
                    if (num >= p) {
                        for (int i = (p-1)*s+1; i <= p*s ; i++) {
                            if (i == p*s) {
                                System.out.println(i);
                            }else {
                                System.out.print(i+" ");
                            }
                        }
                    }else {
                        System.out.println("none");
                    }
                }else {
                    int num = n/s+1;
                    if (num > p) {
                        for (int i = (p-1)*s+1; i <= p*s ; i++) {
                            if (i == p*s) {
                                System.out.println(i);
                            }else {
                                System.out.print(i+" ");
                            }
                        }
                    }else if (num < p){
                        System.out.println("none");
                    }else {
                        for (int i = (p-1)*s+1; i <= n ; i++) {
                            if (i == n) {
                                System.out.println(i);
                            }else {
                                System.out.print(i+" ");
                            }
                        }
                    }
                }
            }else if (n <= s){
                if (p > 1) {
                    System.out.println("none");
                }else {
                    for (int i = 1; i <= n; i++) {
                        if (i == n) {
                            System.out.println(i);
                        }else {
                            System.out.print(i+" ");
                        }
                    }
                }
            }
        }
    }
}
