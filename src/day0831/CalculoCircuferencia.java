package day0831;

import java.util.Scanner;

public class CalculoCircuferencia {

    public static void main(String[] args) {
        // Primeira atidade do dia 31/08

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double area = Math.pow(raio, 2) * 3.14159;
        // double c = r * r * 3.14159;
        // System.out.print("A área é ");
        System.out.printf("%s%.4f\n", "A área é ", area);
        
        double exDouble = 3.;

        if (raio > 3.5){
            double circunferencia = 2 * 3.14159 * raio;
            System.out.printf("%s%f\n", "A circunferência é ", circunferencia);
        }
    }
}