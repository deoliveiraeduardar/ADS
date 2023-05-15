import java.util.Scanner;
        /*        Scanner Entrada= new Scanner(System.in); */

public class App {
    public static void main(String[] args) throws Exception {
        double peso, altura, imc;
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Digite o peso: ");
            peso=Entrada.nextDouble();

            System.out.println("Digite a altura:");
            altura=Entrada.nextDouble();
        }

        imc=peso/(altura*altura);
        System.out.println("O imc é"+imc);

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

