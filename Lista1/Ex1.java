//Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
//• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
//• o imposto equivale a 30% do salário bruto;
//• o salário a receber equivale ao salário bruto menos o imposto.

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner remuneracao = null;
        remuneracao = new Scanner(System.in);
        double salario = 0, salarioBruto = 0, horas = 0, valor = 0, imposto = 0;
        
        System.out.println("Horas trabalhadas: ");
        horas = remuneracao.nextDouble();
        
        System.out.println("Valor da hora: ");
        valor = remuneracao.nextDouble();

        salarioBruto = horas * valor;
        System.out.println("Salário bruto: " + salarioBruto);

        imposto = salarioBruto * 0.3f;
        System.out.println("Imposto cobrado: " + imposto);

        salario = salarioBruto - imposto;
        System.out.println("Salário líquido: " + salario);

        remuneracao.close();
    }
}