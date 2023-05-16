import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int soma = 0, tam = 3;
        int[] notas = new int[tam];

        Scanner Teclado = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        notas[0] = Teclado.nextInt();
        soma += notas[0];

        System.out.println("Digite a nota 2: ");
        notas[1] = Teclado.nextInt();
        soma += notas[1];

        System.out.println("Digite a nota 3: ");
        notas[2] = Teclado.nextInt();
        soma += notas[2];

        System.out.println("Soma total: " + soma);

    }
}
