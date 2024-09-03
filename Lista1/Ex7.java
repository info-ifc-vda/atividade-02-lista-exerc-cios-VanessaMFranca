//Faça um programa que leia dois números e apresente o fatorial de todos os números
//que estejam dentro do intervalo definido pelos números que foram lidos

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Definir o intervalo corretamente, independentemente da ordem dos números
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        // Calcular e exibir o fatorial de cada número no intervalo
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Fatorial de " + i + " = " + calcularFatorial(i));
        }

        scanner.close();
    }

    // Função para calcular o fatorial de um número
    public static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}