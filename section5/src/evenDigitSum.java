public class evenDigitSum {

/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.

EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
*/
    public static void main(String[] args) {
        System.out.println("soma dos numeros pares " + getEvenDigitSum(123456));
    }
    public static int getEvenDigitSum(int number) {

        if (number < 0 ) {
            return -1;
        }
        int sum = 0;
        int digits = 0;
        while (number > 0) {
            // se essa variavel estiver apos o incremento, nao vai armazenar nem o 1° nem o ultimo digito com essa condicao
            // do while
            digits = number % 10;
            // Obeservar a posicao do incremento
            number /= 10;
            if (digits % 2 == 0) {
                sum += digits;
            }
        }
        return sum;
    }
}

