//Faça uma calculadora de troco, baseado nas cédulas da nossa moeda.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor total da compra
        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        // Ler o valor pago pelo cliente
        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double valorPago = scanner.nextDouble();

        // Calcular o troco
        double troco = valorPago - valorCompra;

        // Verificar se o valor pago é suficiente
        if (troco < 0) {
            System.out.println("O valor pago é insuficiente. Faltam R$ " + Math.abs(troco));
        } else if (troco == 0) {
            System.out.println("Não há troco a ser dado.");
        } else {
            System.out.println("Troco a ser dado: R$ " + troco);
            calcularCedulas(troco);
        }

        scanner.close();
    }

    // Função para calcular a quantidade de cédulas e moedas necessárias para o troco
    public static void calcularCedulas(double troco) {
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        int moedas = 1;

        // Converter troco para centavos
        int trocoCentavos = (int) Math.round(troco * 100);

        // Calcular cédulas
        for (int cedula : cedulas) {
            int quantidadeCedulas = trocoCentavos / (cedula * 100);
            if (quantidadeCedulas > 0) {
                System.out.println(quantidadeCedulas + " cédula(s) de R$ " + cedula);
                trocoCentavos %= (cedula * 100);
            }
        }

        // Calcular moedas de R$ 1,00
        if (trocoCentavos >= moedas * 100) {
            int quantidadeMoedas = trocoCentavos / 100;
            System.out.println(quantidadeMoedas + " moeda(s) de R$ 1,00");
        }
    }
}