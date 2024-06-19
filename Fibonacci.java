package execises;

/**
 *
 * @author Zacarias Mercado
 */
public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

        f.fibMethod();
    }

    public void fibMethod() {

        long n1 = 0;
        long n2 = 1;

        for (int x = 0; x <= 50; x++) {
            System.out.println(n1);

            long fib = n1 + n2;

            n1 = n2;
            n2 = fib;
        }
    }

}
