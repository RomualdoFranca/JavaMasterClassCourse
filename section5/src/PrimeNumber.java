public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber(23);
    }
    public static boolean primeNumber(int number) {
        // Excluindo o numero 1, pois ele nao é primo
        if (number == 1) {
            System.out.println("The number " + number + " isn't a prime number.");
            return false;
        }
        // int i=2:  O loop inicia a partir do numero 2.
        // i<= number/2: O loop vai ate a metade do numero inserido
        // Enquanto i for menor ou igual a metade do numero inserido, soma-se 1 ao resultado a cada volta do loop
        for (int i=2; i <= number/2; i++) {
            if (number % 2 == 0) {
                System.out.println("The number " + number + " isn't a prime number.");
                return false;
            }
        }
        System.out.println("The number " + number + " is a prime number.");
        return true;
    }
}
