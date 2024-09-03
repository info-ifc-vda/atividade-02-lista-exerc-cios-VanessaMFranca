//Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez 
//contas e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros
//(não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um
//vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a
//conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta posição
//do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o seguinte menu na tela:
//• Efetuar depósito
//• Efetuar saque
//• Consultar o ativo bancário (soma de todos os saldos)
//• Finalizar programa
//Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
//Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente para o saque.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores para armazenar códigos das contas e seus respectivos saldos
        int[] codigosContas = new int[10];
        double[] saldosContas = new double[10];

        // Ler os códigos das contas e seus respectivos saldos
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            int codigo = scanner.nextInt();

            // Verifica se o código da conta já foi utilizado
            while (existeCodigo(codigo, codigosContas, i)) {
                System.out.println("Código já utilizado. Digite um código diferente.");
                codigo = scanner.nextInt();
            }

            codigosContas[i] = codigo;

            System.out.print("Digite o saldo inicial da conta " + (i + 1) + ": ");
            saldosContas[i] = scanner.nextDouble();
        }

        // Menu de operações bancárias
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Efetuar depósito
                    System.out.print("Digite o código da conta para depósito: ");
                    int codigoDeposito = scanner.nextInt();
                    int indiceDeposito = encontrarIndiceConta(codigoDeposito, codigosContas);

                    if (indiceDeposito != -1) {
                        System.out.print("Digite o valor a ser depositado: ");
                        double valorDeposito = scanner.nextDouble();
                        saldosContas[indiceDeposito] += valorDeposito;
                        System.out.println("Depósito realizado com sucesso. Novo saldo: R$ " + saldosContas[indiceDeposito]);
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 2: // Efetuar saque
                    System.out.print("Digite o código da conta para saque: ");
                    int codigoSaque = scanner.nextInt();
                    int indiceSaque = encontrarIndiceConta(codigoSaque, codigosContas);

                    if (indiceSaque != -1) {
                        System.out.print("Digite o valor a ser sacado: ");
                        double valorSaque = scanner.nextDouble();

                        if (saldosContas[indiceSaque] >= valorSaque) {
                            saldosContas[indiceSaque] -= valorSaque;
                            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + saldosContas[indiceSaque]);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 3: // Consultar o ativo bancário
                    double ativoBancario = 0;
                    for (double saldo : saldosContas) {
                        ativoBancario += saldo;
                    }
                    System.out.println("O ativo bancário total é: R$ " + ativoBancario);
                    break;

                case 4: // Finalizar programa
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }

    // Método para verificar se um código já existe no vetor
    public static boolean existeCodigo(int codigo, int[] codigosContas, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            if (codigosContas[i] == codigo) {
                return true;
            }
        }
        return false;
    }

    // Método para encontrar o índice de uma conta pelo código
    public static int encontrarIndiceConta(int codigo, int[] codigosContas) {
        for (int i = 0; i < codigosContas.length; i++) {
            if (codigosContas[i] == codigo) {
                return i;
            }
        }
        return -1; // Retorna -1 se a conta não for encontrada
    }
}