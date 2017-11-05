package com.smallclover.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ハイアンドロー・カードゲーム
 * @author smallclover
 * @create 2017-11-04
 * @since
 */
public class C017 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f_a = sc.nextInt();
        int f_b = sc.nextInt();
        int n = sc.nextInt();
        List<Integer[]> cards = new ArrayList<Integer[]>();
        for (int i = 0; i < n; i++) {
            Integer[] card = new Integer[2];
            card[0] = sc.nextInt();
            card[1] = sc.nextInt();
            cards.add(card);
        }

        for (int i = 0; i < cards.size(); i++) {
            if (cards.get(i)[0] > f_a) {
                System.out.println("Low");
            }else if (cards.get(i)[0] < f_a){
                System.out.println("High");
            }else {
                if (cards.get(i)[1] > f_b) {
                    System.out.println("High");
                }else {
                    System.out.println("Low");
                }
            }
        }
    }
}
