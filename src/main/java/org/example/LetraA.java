package org.example;

import java.util.Scanner;

public class LetraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String s = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        }else {
            System.out.println("A letra 'a' não aparece na frase.");
        }
    }
}
