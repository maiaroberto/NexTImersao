package day0901;

import java.util.Scanner;

public class RepeticaFor {

    public static void main(String[] args) {
        
        // //
        // int varArray[] = {1,10,3,56};
        // System.out.println(varArray.length);

        // // int varInt = 0;


        // // // for(int i = 0; i<10; i++){

        // // //     System.out.println(i);
        // // // }

        // // for (int v : varArray) {
            
        // //     System.out.println(v);
            
        // // }

        // int resto = 5%3;
        // System.out.println(resto);
        // String a = "fasfsad";
        // a.length();


    // Faça loop FOR que recebe ler um array, com 5 elementos e 
    // imprime o se esse elemento é ou não par.

        int varArray[] = {12, 7, 3, 9};


        for (int i = 0; i < varArray.length; i++) {
            varArray[i] = varArray[i]*2;
            System.out.println(varArray[i]);
            
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int num = input.nextInt();
        
        int resultado = 1; 

        for(int i=1; i <= num; i++){
            resultado = resultado * i;
        }
        
        System.out.println("O fatorial de " + num + " é igual a " + resultado);
        input.close();
        
        

    }  
    
}
