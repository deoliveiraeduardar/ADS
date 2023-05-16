import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int soma = 0, qtdmat = 2, qtdaluno = 3, cont;

        int[][] notas = new int[qtdaluno][qtdmat];

        Scanner Teclado = new Scanner(System.in);
        int contal, contmat;

        for (contal = 0; contal < qtdaluno; contal++) {
            System.out.println("Aluno " + (contal + 1));
            for (contmat = 0; contmat < qtdmat; contmat++) {
                System.out.println("Digite a nota: ");
                notas[contal][contmat] = Teclado.nextInt();

            }
        }
        for (contal = 0; contal < qtdaluno; contal++) {
            System.out.println("Notas do aluno" + (contal + 1));
            for (contmat = 0; contmat < qtdmat; contmat++) {
                System.out.print("" + notas[contal][contmat]);

            }
        }
    }
}
