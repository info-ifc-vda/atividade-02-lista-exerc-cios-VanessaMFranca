//Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
//calcule e mostre 2 vetores resultantes:
//• no primeiro vetor resultante, cada elemento será composto pela soma de cada
//número par do primeiro vetor somado a todos os números do segundo vetor;
//• o segundo vetor resultante será composto pela quantidade de divisores que cada
//número ímpar do primeiro vetor tem no segundo vetor.

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores de entrada
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[5];

        // Ler os elementos do primeiro vetor (tamanho 10)
        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 1 - Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Ler os elementos do segundo vetor (tamanho 5)
        System.out.println("Digite 5 números inteiros para o segundo vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Vetor 2 - Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Vetores resultantes
        int[] vetorResultante1 = new int[10];
        int[] vetorResultante2 = new int[10];

        // Calcular os vetores resultantes
        for (int i = 0; i < 10; i++) {
            // Primeiro vetor resultante (soma dos números pares com todos os números do segundo vetor)
            if (vetor1[i] % 2 == 0) { // Verifica se o número é par
                int soma = 0;
                for (int j = 0; j < 5; j++) {
                    soma += vetor1[i] + vetor2[j];
                }
                vetorResultante1[i] = soma;
            } else {
                vetorResultante1[i] = 0; // Se for ímpar, armazena 0 no vetor resultante 1
            }

            // Segundo vetor resultante (quantidade de divisores no segundo vetor)
            if (vetor1[i] % 2 != 0) { // Verifica se o número é ímpar
                int quantidadeDivisores = 0;
                for (int j = 0; j < 5; j++) {
                    if (vetor2[j] != 0 && vetor1[i] % vetor2[j] == 0) {
                        quantidadeDivisores++;
                    }
                }
                vetorResultante2[i] = quantidadeDivisores;
            } else {
                vetorResultante2[i] = 0; // Se for par, armazena 0 no vetor resultante 2
            }
        }

        // Imprimir os vetores resultantes
        System.out.println("\nPrimeiro vetor resultante (soma de pares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultante1[i] + " ");
        }

        System.out.println("\n\nSegundo vetor resultante (quantidade de divisores de ímpares):");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultante2[i] + " ");
        }

        scanner.close();
    }
}