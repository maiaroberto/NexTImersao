package day0901;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {
        
        //Enquanto usuario nao inserir a palavra 'SAIR' continue operacao
        
        // Scanner sc = new Scanner(System.in);

        // char frase = 'q';

        // while(frase != 'r'){ 

        //     System.out.println("Somos CESAR!");
        //     //TODO final da aula
        //     frase = sc.next().charAt(0);

        // }

        // Scanner sc = new Scanner(System.in);

        // String dia = sc.nextLine().toLowerCase();

        // frase = 

        // do {
            
        //     System.out.println("SOMOS CESAR");

        // } while (!frase.equals("SAIR"));


        Scanner sc = new Scanner(System.in);
        int resultadoFatorial = 1;
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int valorInicial = num;

        while(num > 0){
            if (num == 1){
                break;
            }
            resultadoFatorial = resultadoFatorial*num;
            num--;
        }

        System.out.println("O resultado do fatorial de " + valorInicial + " é: " + resultadoFatorial);
        sc.close();




    }
    
}
