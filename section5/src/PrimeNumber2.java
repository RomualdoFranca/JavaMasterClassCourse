public class PrimeNumber2 {
    // Create a for statement using any range of numbers
    // Determine if the number is prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the number of prime number found
    // if that count is 3 exit the for loop
    // hint: Use the break: statement to exit.
    public static void main(String[] args) {
//        System.out.println(isPrime(7));

        int count = 0; // O valor dessa variavel vai determinar o numero de loops.
        //  O loop vai percorrer os numeros de 10 ate 49 a depender do valor da variavel count
        //  Loops executes a block of code when the condition is true in steps
        //  Loops stops when the condition is false
        //  The statements will execute every step or we can say, every iteration
        for (int i=10; i<50; i++) {// i++: increment or iterator or iterator step
        //  O valor de i é enviado ao metodo que valida se o numero é primo
            if (isPrime(i)) {
                count++; // A cada loop soma-se 1 ao contador
                System.out.println("The number " + i + " is a prime number.");
                if (count==5) {
                    System.out.println("Exiting the loop ");
                    break; // break statements
                }
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {// Exclui o numero 1 pois esse nao é primo
            return false;
        }
        // O loop se inicia a partir do 2 para avaliar se o numero é primo
        // i <= number / 2: Esse é o maior divisor inteiro de um  numero
        // O valor da variavel number aqui sera o valor que vem desse loop for (int i=10; i<50; i++)
        for (int i=2; i <= number / 2; i++) {
            if (number % i == 0 ) {
                return false;
            }
        }
        return true;
    }


}
