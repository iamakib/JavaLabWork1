/* prints the balance of an account after the first, second, and third year. The
account has an initial balance of $1,000 and earns 5 percent interest per year. */

public class E14Runner {
    public static void main(String[] args) {
        E14 finalBalance = new E14();

        float balance = finalBalance.finalBalance();

        System.out.println(balance);

    }
}
