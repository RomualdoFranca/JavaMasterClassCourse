public class NumberPalindrome {
/*Write a method called isPalindrome with one int parameter called number.The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.Check the tips below for
more info about palindromes.

Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.

Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number.
For example: 121, 12321, 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse.
If both are the the same then the number is a palindrome otherwise it is not.
Tip: Logic to reverse a number
Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
Extract the last digit of the given number by performing the modulo division (remainder).
Store the last digit to some variable say lastDigit = num % 10.
Increase the place value of reverse by one.
To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
Add lastDigit to reverse.
Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10.
Repeat steps until number is not equal to (or greater than) zero.

A while loop would be good for this coding exercise.
Tip: Be careful with negative numbers. They can also be palindrome numbers.
Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number
(parameter).
*/
    public static void main(String[] args) {
        System.out.println(isPalindrome(-77));
    }
    public static boolean isPalindrome(int number) {

        if (number > -10 && number < 10) {
            return false;
        }
        int reverse = 0;
        int numberNoIncrement = number;

        System.out.println(numberNoIncrement);
        while (number > 0) {
            // Para se inverter um numero: multiplicar cada algarismo por 10 e somar com o proximo algarismo encontrado
            // Ex: 1° algarismo encontrado vezes 10 + 2° algarismo vezes 10, e assim sucessivamente
            // essa variavel armazena o numero inverso
            reverse *= 10;
            // formula para pegar o ultimo algarismo do numero
            int digit = number % 10;
            // formula para retirar o ultimo algarismo do numero
            number /= 10;
            // formula que adiciona os algarismo ja multiplicados por 10
            reverse += digit;
            System.out.println("reverse " + reverse);
        }
        System.out.println("number " + numberNoIncrement);
        if (reverse == numberNoIncrement) {
            System.out.println("The number is a palindrome ");
            return true;
        }
        System.out.println("The number isn't a palindrome ");
        return false;
    }
}
/*        int lastDigit = number % 10;;
//        System.out.println("last digit " + lastDigit);
        int digit = 0;
        while (number > 9) {

            System.out.println("numero antes do incremento " + number);
            number /= 10;
            System.out.println("numero após incremento  = " + number);
            digit = number % 10;
            System.out.println("digit = " + digit);
            System.out.println("");
        }
        System.out.println("last digit = " + lastDigit);
        System.out.println("number fora do loop " + number);
        return true;*/
