package day0901;

import java.util.Scanner;

public class RepeticaoSwitch {


    public static void main(String[] args) {
        
        int mes = 3;

        switch(mes){

            case 1:
                System.out.println("Roger e Daniel");
                break;

            case 2:
                System.out.println("Maria e Malu");
                break;

            default:
                System.out.println("Ninguem faz aniversario!");
                break;
        }
        System.out.println(mes);
    
    //Usando as iniciais de dia da semana (d, s, t, q) imprima os dias 
    //que comecam a letra recebida


    // char dia = 's';
    

    // switch(dia){
        
    //     case 'd':
    //         System.out.println("domingo");
    //         break;
        
    //     case 's':
    //         System.out.println("segunda, sexta e sábado");
    //         break;            

    //     case 't':
    //         System.out.println("terça");
    //         break;

    //     case 'q':
    //         System.out.println("quarta e quinta");
    //         break;    
    //     default:
    //         System.out.println("nenhum dia da semana");
    //     break;
    
    // }

    Scanner sc = new Scanner(System.in);
    String dia = sc.next().toLowerCase();

    switch (dia) {
      case "d":
        System.out.println("Domingo");
        break;
        
      case "s":
        System.out.println("Segunda, Sexta e Sabado");
        break;
    
      case "t":
      System.out.println("Terça");
      break;

      case "q":
        System.out.println("Quarta e Quinta");
        break;

    }

    sc.close();


}
}
