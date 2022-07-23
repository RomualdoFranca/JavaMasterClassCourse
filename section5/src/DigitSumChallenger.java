public class DigitSumChallenger {

    /*Write a method with the name sumDigits that has one int parameter called number.If parameter is >= 10 then the
    method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
    The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers,
    so also return -1 for negative numbers.

    For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
    Calling the method sumDigits(1) should return -1 as per requirements described above.
    Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid
    and invalid values passed as arguments.

    Hint:
    Use n % 10 to extract the least-significant digit.
    Use n = n / 10 to discard the least-significant digit.
    The method needs to be static like other methods so far in the course.

    Tip:
    Create a project with the name DigitSumChallenge.*/
    public static void main(String[] args) {
        //  test out if our logic in the method is working
        System.out.println("The sum of the digits  is " + sumDigit(125));
    }
    public static int sumDigit(int number) {

        // solution
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        // 125 -> 125 / 10 = 12 -> * 10 = 120 -> 125 - 120 = 5
        // keep looping while the number is greater than 0
        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;
            // drop the least-significant digit
            number /= 10;
            System.out.println(digit);
//            System.out.println(number);
        }

//        if (number <= 9) {
//            return -1;
//        }
//        // armazena o ultimo algorismo
//        int lastDigit = number % 10;
//        // armazena a soma dos algorismos
//        int sumOfDigits = 0;
//
//        while (number > 9) {
//            // output para visualizar o que ocorre em cada loop
////            System.out.println("numero antes do incremento " + number);
//            // a cada divisao, o ultimo algorismo é eliminado
//            number /= 10;
//            // output para visualizar o que ocorre em cada loop
////            System.out.println("numero depois do incremento " + number);
//            // soma dos digitos, exceto o ultimo
//            sumOfDigits += number % 10;
////            System.out.println("a soma dos ultimos digitos " + (sumOfDigits + lastDigit));
//        }
//        return sumOfDigits + lastDigit;
        return sum;
    }
}
