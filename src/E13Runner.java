/* prints the product of the first ten positive integers, 1*2*.…*10. (Use * to indicate
multiplication in Java.) */

public class E13Runner  {
    public static void main(String[] args) {

        E13 seriesMultiplication = new E13();
        int result = seriesMultiplication.seriesMultiplication(10);

        System.out.println(result);
    }
}
