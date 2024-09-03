//Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
//um vetor dos números não comuns aos vetores

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Ler os elementos do primeiro vetor
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 1 - Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Ler os elementos do segundo vetor
        System.out.println("Digite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor 2 - Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Encontrar os elementos não comuns
        List<Integer> naoComuns = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            boolean comum = false;

            // Verificar se o elemento do vetor1 está no vetor2
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    comum = true;
                    break;
                }
            }

            // Se não está no vetor2, adicionar à lista de não comuns
            if (!comum) {
                naoComuns.add(vetor1[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean comum = false;

            // Verificar se o elemento do vetor2 está no vetor1
            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    comum = true;
                    break;
                }
            }

            // Se não está no vetor1, adicionar à lista de não comuns
            if (!comum) {
                naoComuns.add(vetor2[i]);
            }
        }

        // Imprimir os números não comuns
        System.out.println("Números não comuns aos dois vetores:");
        for (int numero : naoComuns) {
            System.out.print(numero + " ");
        }
        System.out.println();

        scanner.close();
    }
}
