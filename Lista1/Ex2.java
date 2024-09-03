//Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa que recebe o valor do
//salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
//• o valor de cada quilowatt;
//• o valor a ser pago por essa residência;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Recebe a quantidade de quilowatts consumida
        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quilowattsConsumidos = scanner.nextDouble();

        // Calcula o valor de cada quilowatt
        double valorPorQuilowatt = salarioMinimo * 0.01;

        // Calcula o valor total a ser pago
        double valorTotal = valorPorQuilowatt * quilowattsConsumidos;

        // Exibe os resultados
        System.out.printf("Valor de cada quilowatt: R$ %.2f%n", valorPorQuilowatt);
        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
