package com.mycompany.bdw_m1_tp_1_programa2;

import java.util.Scanner;
public class Bdw_m1_tp_1_programa2 {
    public static void main(String[] args) {
        int num1, num2=20, num3;

        Scanner Entrada= new Scanner (System.in);
        System. out .println("Digite um número qualquer: ");
        num1=Entrada.nextInt();
        num2+=num1;
        if((num1%2)==0){
            num3=num1*4;
            System.out.println("Condição 1, if((num1%2)==0     é V ");

        }else if ((num2%3)==0){
            num3=num2+2*num1;
            System.out.println("Condição 2, else if ((num2%3)==0)     é V ");

        }else{
            num3=num2;
            System.out.println("Condição 3, else    é V ");
         
        }
       System.out.println("===========================================");

       System.out.println("1. O valor de num3 é= "+num3);
       System.out.println("        - O valor de num2 é= "+num2);
       

    }
}
