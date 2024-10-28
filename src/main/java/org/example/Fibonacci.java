package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        while (a < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        if (a == numero) {
            System.out.println("O número " + numero + " faz parte da sequência Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não faz parte da sequência Fibonacci.");
        }
    }
}
