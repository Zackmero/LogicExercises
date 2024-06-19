package execises;

/**
 *
 * @author Zacarias Mercado
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        PrimeNumbers p = new PrimeNumbers();

        for (int x = 0; x <= 100; x++) {
            if (p.isPrime(x)) {
                System.out.println(x);
            }
        }
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0 && number != 2) {
                return false;
            }
        }
        return true;
    }
}
