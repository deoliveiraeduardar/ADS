

package com.mycompany.bdw_m1_a44_1;

import java.util.Scanner;

/*1. Receber o dia do usuário: variavel int
  2. Gerar o di correspondente
*/

public class Bdw_m1_a44_1 {

    public static void main(String[] args) {
        int dia;
        Scanner Entrada=new Scanner(System.in);
        
        System.out.println("Qual o número do dia? (1-7): ");
        dia=Entrada.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;        
            case 4:
                System.out.println("Quinta");
                break;               
            case 5:
                System.out.println("Sexta");
                break;   
             case 6:
                System.out.println("Sábado");
                break;                  
            case 7:
                System.out.println("Domingo");
                break;   
            default:
                System.out.println("NÚMERO INVÁLIDO");
                
                
        }
        

    }
}
