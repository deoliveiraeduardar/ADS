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
        
        double peso, altura, imc;
        Scanner Entrada= new Scanner(System.in);
        
        System.out.println("Digite o peso: ");
        peso=Entrada.nextDouble();
        
        System.out.println("Digite a altura: ");
        altura=Entrada.nextDouble();
        
        imc=peso/(altura*altura);
        System.out.println("O IMC é: "+imc);
        
        if(imc<18.5){
            System.out.println("Abaixo do peso");
        }else if((imc>=18.5)&&(imc<=24.9)){
            System.out.println("Peso normal");
        }else if((imc>24.9)&&(imc<=29.9)){
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidade");
            
        }
        
              

    }
}
