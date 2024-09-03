//Faça um programa que receba dez números inteiros e mostre a quantidade de números
//primos dentre os número que foram digitados.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePrimos = 0;

        // Receber e processar os dez números inteiros
        for (int i = 1; i < 11; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            // Verificar se o número é primo e incrementar o contador
            if (isPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        // Exibir a quantidade de números primos
        System.out.println("Quantidade de números primos digitados: " + quantidadePrimos);

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