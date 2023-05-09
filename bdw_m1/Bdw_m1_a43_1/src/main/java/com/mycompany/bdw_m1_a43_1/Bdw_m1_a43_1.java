package com.mycompany.bdw_m1_a43_1;
import java.util.Scanner;

/*
1. Criar variáveis: peso, altura, imc
2. Coletar informações com buffer
3. Cálculo IMC: peso/altura^2
4. Classificar o imc
*/

public class Bdw_m1_a43_1 {

    public static void main(String[] args) {
        
        double peso, altura;
        Scanner Entrada= new Scanner(System.in);
        
        System.out.println("Digite o peso: ");
        peso=Entrada.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura=Entrada.nextDouble();
        
        double imc=((peso)/(altura*altura));
        System.out.println("O IMC é: "+imc);
        
        
                
                
                

    }
}
