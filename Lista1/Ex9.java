//Faça um programa que leia um número inteiro e diga se ele é primo

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificar se o número é primo
        if (numero <= 1) {
            System.out.println(numero + " não é um número primo.");
        } else if (isPrimo(numero)) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }

    // Função para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}