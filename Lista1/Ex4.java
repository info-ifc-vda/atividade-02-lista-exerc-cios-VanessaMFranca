//Faça um programa que receba
//• O código do produto comprado;
//• A quantidade comprada do produto
//Calcule e mostre:
//• O preço unitário do produto comprado, seguindo a Tabela I;
//• O preço total da nota;
//• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
//• O preço final da nota depois do desconto.
//Tabela I
//Código Preço
//1 a 10 R$ 10,00
//11 a 20 R$ 15,00
//21 a 30 R$ 20,00
//31 a 40 R$ 40,00
//Tabela II
//Preço Total da Nota % de Desconto
//Até R$ 250,00 5%
//Entre R250, 00eR 500,00 10%
//Acima de R$ 500,00 15%

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebe o código do produto
        System.out.print("Digite o código do produto (1 a 40): ");
        int codigoProduto = scanner.nextInt();

        // Recebe a quantidade comprada
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        // Determina o preço unitário com base no código do produto
        double precoUnitario = obterPrecoUnitario(codigoProduto);
        if (precoUnitario == 0) {
            System.out.println("Código do produto inválido.");
            return;
        }

        // Calcula o preço total da nota
        double precoTotal = precoUnitario * quantidade;

        // Calcula o valor do desconto
        double desconto = calcularDesconto(precoTotal);

        // Calcula o preço final após o desconto
        double precoFinal = precoTotal - desconto;

        // Exibe os resultados
        System.out.printf("Preço unitário do produto: R$ %.2f%n", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f%n", precoTotal);
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço final da nota: R$ %.2f%n", precoFinal);

        scanner.close();
    }

    public static double obterPrecoUnitario(int codigo) {
        if (codigo >= 1 && codigo <= 10) {
            return 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            return 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            return 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            return 40.00;
        } else {
            return 0; // Código inválido
        }
    }

    public static double calcularDesconto(double precoTotal) {
        if (precoTotal <= 250.00) {
            return precoTotal * 0.05;
        } else if (precoTotal <= 500.00) {
            return precoTotal * 0.10;
        } else {
            return precoTotal * 0.15;
        }
    }
}