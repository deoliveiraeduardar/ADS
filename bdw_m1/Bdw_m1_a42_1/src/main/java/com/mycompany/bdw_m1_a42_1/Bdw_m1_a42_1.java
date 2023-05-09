package com.mycompany.bdw_m1_a42_1;
/* 1. Criar variáveis
   2. Avaliar critérios
   3. Imprimir respostas
*/

public class Bdw_m1_a42_1 {

    public static void main(String[] args) {
        boolean renda=false;
        boolean adimplencia=true;
        boolean privilege=false;
        boolean restricao=false;
        
        boolean resultado=((renda&&adimplencia)||privilege)&&!restricao;
         
        System.out.println("Empréstimo deve ser concedido? "+resultado);
    }
}
