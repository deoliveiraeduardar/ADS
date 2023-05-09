
package com.mycompany.bdw_m1_tp_1_programa3;
import java.util.Scanner;
public class Bdw_m1_tp_1_programa3 {
    public static void main(String[] args) {
        int aux;
        boolean avista, carronovo, seguir;
        double desconto, valorcarro;
        Scanner Entrada= new Scanner (System.in);
        do{
            desconto=0.0;
            avista=false;
            carronovo=false;
            seguir=false;
            System.out.println("programa para venda de carro /n/n/nDigite o valor do Carro (ex: 95000)");
            valorcarro=Entrada.nextDouble();
            System.out.println("O pagamento será à vista? Sim (aperte 1), Não (aperte outro número)");
            aux=Entrada.nextInt();
            if(aux==1);
                carronovo=true;
            if((avista==true)&&(carronovo=true)){
                desconto=0.15;
            }else if(avista==true){
                desconto=0.08;
            }else if(carronovo==true){
                desconto=0.05;
            }else{
                System.out.println("Ofereça um café para o cliente.");
            }
            valorcarro-=(valorcarro*desconto);
            System.out.println("Valor final para pagamento: "+valorcarro);
            System.out.println("/n/n/n/n/nCalcular o valor de uma nova venda (Aperte1)  ");
            System.out.println("Encerrar o programa        (Aperte outro número)");
            aux=Entrada.nextInt();
            if(aux==1)
                seguir=true;
        }While(seguir==true);
    }
}
