//Faça um programa que leia um número e calcule o fatorial desse número

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebe o número do usuário
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é não negativo
        if (numero < 0) {
            System.out.println("Número inválido. Por favor, digite um número não negativo.");
        } else {
            // Calcula o fatorial usando o método iterativo
            long fatorial = calcularFatorialIterativo(numero);
            System.out.println("Fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }

    public static long calcularFatorialIterativo(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}