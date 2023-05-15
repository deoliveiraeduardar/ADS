public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criar um código com while");

        int x = 1;/* Antes de fazer while tenho que iniciar a variável */
        while (x <= 10) {
            if ((x % 2) == 0) {
                System.out.println("While número= " + x);
            }
            x++;

        }
    }
}
