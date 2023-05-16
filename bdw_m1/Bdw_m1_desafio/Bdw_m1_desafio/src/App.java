import java.lang.reflect.Array;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{

    double exemplo(double num) {
        if (num == 5) {
            return 1;

        } else {
            return (5 * exemplo(5 - 1));
        }
    }
}