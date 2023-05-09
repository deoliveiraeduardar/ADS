package com.mycompany.bdw_m1_a42_1;
/* 1. Criar variáveis
   2. Avaliar critérios
   3. Imprimir respostas
*/

public class Bdw_m1_a42_1 {

    public static void main(String[] args) {
        boolean renda=true;
        boolean adimplencia=false;
        boolean privilege=false;
        boolean restricao=true;
        
        boolean resultado=((renda&&adimplencia)||privilege);
         
        System.out.println("Empréstimo deve ser concedido? "+resultado);
    }
}
