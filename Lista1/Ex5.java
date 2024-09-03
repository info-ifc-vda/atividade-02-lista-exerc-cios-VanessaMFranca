//Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
//Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
//calcule e mostre:
//• a quantidade de jogadores com idade inferior a 18 anos;
//• a média das idades dos jogadores de cada time;
//• a média das alturas de todos os jogadores do campeonato;
//• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicialização de variáveis
        int jogadoresMenores18 = 0;
        double somaAlturas = 0.0;
        int totalJogadoresAcima80kg = 0;
        int totalJogadores = 5 * 11; // 5 times com 11 jogadores cada
        int[][] idadesPorTime = new int[5][11];
        int[] somaIdadesPorTime = new int[5];
        
        // Leitura dos dados dos jogadores
        for (int time = 0; time < 5; time++) {
            double somaIdadesTime = 0.0;
            System.out.println("Time " + (time + 1) + ":");
            
            for (int jogador = 0; jogador < 11; jogador++) {
                System.out.print("Digite a idade do jogador " + (jogador + 1) + ": ");
                int idade = scanner.nextInt();
                
                System.out.print("Digite o peso do jogador " + (jogador + 1) + " (em kg): ");
                double peso = scanner.nextDouble();
                
                System.out.print("Digite a altura do jogador " + (jogador + 1) + " (em metros): ");
                double altura = scanner.nextDouble();
                
                // Contagem de jogadores com idade inferior a 18 anos
                if (idade < 18) {
                    jogadoresMenores18++;
                }
                
                // Soma das idades por time
                somaIdadesTime += idade;
                
                // Soma das alturas
                somaAlturas += altura;
                
                // Contagem de jogadores com mais de 80 kg
                if (peso > 80) {
                    totalJogadoresAcima80kg++;
                }
            }
            
            // Calcula a média das idades para o time atual
            somaIdadesPorTime[time] = (int) somaIdadesTime;
            System.out.printf("Média das idades do Time %d: %.2f%n", (time + 1), somaIdadesTime / 11);

            scanner.close();
        }
        
        // Cálculo da média das alturas
        double mediaAltura = somaAlturas / totalJogadores;
        System.out.printf("Média das alturas de todos os jogadores: %.2f metros%n", mediaAltura);
        
        // Cálculo da porcentagem de jogadores com mais de 80 kg
        double porcentagemAcima80kg = (totalJogadoresAcima80kg * 100.0) / totalJogadores;
        System.out.printf("Porcentagem de jogadores com mais de 80 kg: %.2f%%%n", porcentagemAcima80kg);
        
        // Contagem de jogadores menores de 18 anos
        System.out.println("Quantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenores18);
    }
}