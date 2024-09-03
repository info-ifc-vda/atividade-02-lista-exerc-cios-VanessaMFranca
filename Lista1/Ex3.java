//Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
//obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos lados
        System.out.println("Digite os comprimentos dos 3 lados do triângulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        
        // Leitura dos ângulos
        System.out.println("Digite os ângulos (em graus) do triângulo:");
        double angulo1 = scanner.nextDouble();
        double angulo2 = scanner.nextDouble();
        double angulo3 = scanner.nextDouble();
        
        // Verificar e classificar o triângulo
        if (verificarValidadeTriangulo(lado1, lado2, lado3)) {
            String tipoAngulo = classificarPelosAngulos(angulo1, angulo2, angulo3);
            String tipoLado = classificarPelosLados(lado1, lado2, lado3);
            System.out.println("Classificação pelo ângulo: " + tipoAngulo);
            System.out.println("Classificação pelos lados: " + tipoLado);
        } else {
            System.out.println("Os valores dos lados não formam um triângulo válido.");
        }

        scanner.close();
    }
    
    public static boolean verificarValidadeTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    public static String classificarPelosAngulos(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b + c != 180) {
            return "Ângulos inválidos";
        }
        if (a == 90 || b == 90 || c == 90) {
            return "Retângulo";
        } else if (a > 90 || b > 90 || c > 90) {
            return "Obtusângulo";
        } else {
            return "Acutângulo";
        }
    }
    
    public static String classificarPelosLados(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Lados inválidos";
        }
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}