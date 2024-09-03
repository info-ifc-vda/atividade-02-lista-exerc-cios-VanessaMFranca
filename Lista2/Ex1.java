//Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
//escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
//deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
//um número negativo ou 0.

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorLinhas = 0;

        while (true) {
            // Ler o valor
            System.out.print("Digite um número (negativo ou 0 para sair): ");
            double valor = scanner.nextDouble();

            // Verificar se o valor é negativo ou 0 para finalizar
            if (valor <= 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Exibir o cabeçalho a cada 20 linhas
            if (contadorLinhas % 20 == 0) {
                System.out.printf("%-10s %-10s %-10s%n", "Valor", "Cubo", "Raiz Quadrada");
                System.out.println("----------------------------------------");
            }

            // Calcular o cubo e a raiz quadrada
            double cubo = Math.pow(valor, 3);
            double raizQuadrada = Math.sqrt(valor);

            // Exibir a linha da tabela
            System.out.printf("%-10.2f %-10.2f %-10.2f%n", valor, cubo, raizQuadrada);

            // Incrementar o contador de linhas
            contadorLinhas++;
        }

        scanner.close();
    }
}