package com.smallclover.c;

import java.util.Scanner;

/**
 * お菓子の分配
 * @author smallclover
 * @create 2017-10-30
 * @since
 */
public class C038 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Integer[] machine = new Integer[m];
        for (int i = 0; i < m; i++) {
            machine[i] = sc.nextInt();
        }

        int a = n % machine[0];
        int index = 0;

        for (int i = 0; i < machine.length - 1; i++) {
            if (a < (n % machine[i + 1])) {

            }else if (a == (n % machine[i + 1])) {
                if (machine[index] > machine[i + 1]) {
                    a = n % machine[index];
                }else if (machine[index].equals(machine[i + 1])) {

                }else {
                    a = n % machine[i + 1];
                    index = i + 1;
                }
            }else {
                a = n % machine[i + 1];
                index = i + 1;
            }
        }

        System.out.println(index + 1);
    }
}
