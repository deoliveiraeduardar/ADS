package com.mycompany.bdw_m1_a42_1;
/* 1. Criar variáveis
   2. Avaliar critérios
   3. Imprimir respostas
*/

public class Bdw_m1_a42_1 {

    public static void main(String[] args) {
        boolean renda=true;
        boolean adimplencia=true;
        boolean privilege=true;
        boolean restricao=true;
        
        boolean resultado=((renda&&adimplencia)||privilege)&&!restricao;
         
        System.out.println("Empréstimo deve ser concedido? "+resultado);
    }
}
