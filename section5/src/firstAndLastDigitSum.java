public class firstAndLastDigitSum {

    /*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
    The method needs to find the first and the last digit of the parameter number passed to the method,
    using a loop and return the sum of the first and the last digit of that number.
    If the number is negative then the method needs to return -1 to indicate an invalid value.

    Example input/output
    * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
    * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
    * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit,
    which gives us 0+0 and the sum is 0.
    * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit,
    which gives us 5+5 and the sum is 10.
    * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
    */
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public  static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        // Vaiavel fora do loop para que o retorno do metodo tenha acesso a ela.
        // caso estivesse dentro do loop, o retorno não poderia acessar essa variavel
        int lastDigit = number % 10;
        // Só a variável dentro da condicao do while pode ser acessado pelo retorno do metodo
        while (number / 10 >= 1) {
            number /= 10;
        }
        return number + lastDigit;
        /*Explicacao d condicao do while:
        * Primeira ideia: 'while(number > 0)' o loop só findava qnd o resultado fosse igual a 0.
        * E esse resultado era considerado o ultimo algarismo do numero
        * Segunda ideia: while (number / 10 >= 1) o loop é interrompido antes de realizar a condicao no ultimo
        * algarismo do numero e como consequencia, armazena o ultimo no numero na variavel 'number'*/
    }
    /*Codigo sem comentario
    *         public  static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number / 10 >= 1) {
            number /= 10;
        }
        return number + lastDigit;

    }*/
}
