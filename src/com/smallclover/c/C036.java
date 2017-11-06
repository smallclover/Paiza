package com.smallclover.c;

import java.util.Scanner;

/**
 * [もし女コラボ問題]犬ぞりトーナメント
 * @author smallclover
 * @create 2017-11-06
 * @since
 */
public class C036 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] people = new Integer[]{0, 0, 0, 0, 0};
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 1; i < people.length; i++) {
            people[i] = sc.nextInt();
        }
        int p_1 = sc.nextInt();
        int p_2 = sc.nextInt();

        int firstRoundwiner_1 = 0;
        int firstRoundwiner_2 = 0;

        if (people[a] < people[b]) {
            people[b] = 0;
            firstRoundwiner_1 = a;
        }else {
            people[a] = 0;
            firstRoundwiner_1 = b;
        }

        if (people[c] < people[d]) {
            people[d] = 0;
            firstRoundwiner_2 = c;
        }else {
            people[c] = 0;
            firstRoundwiner_2 = d;
        }

        if (firstRoundwiner_1 > firstRoundwiner_2) {
            people[firstRoundwiner_2] = p_1;
            people[firstRoundwiner_1] = p_2;
        }else {
            people[firstRoundwiner_1] = p_1;
            people[firstRoundwiner_2] = p_2;
        }

        if (people[firstRoundwiner_1] < people[firstRoundwiner_2]) {
            System.out.println(firstRoundwiner_1);
            System.out.println(firstRoundwiner_2);
        }else {
            System.out.println(firstRoundwiner_2);
            System.out.println(firstRoundwiner_1);
        }
    }
}
