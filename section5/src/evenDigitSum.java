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
        System.out.println(getEvenDigitSum(12));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0 ) {
            return -1;
        }
        int sum = 0;
        while (number / 10 > 0) {
            int lastDigit = number % 10;
            number /= 10;
            boolean isLastNumberEven = (lastDigit % 10) % 2 == 0;
            System.out.println("valida o ultimo digito " + isLastNumberEven);
            boolean isNumberEnven = (number % 2) == 0;
            System.out.println("valida o primeiro digito " + isNumberEnven);
            int digits = number % 10;
//            System.out.println(number);
            if (digits % 2 == 0) {
//                System.out.println("even digits inside if " + digits);
                sum += digits;
//                int totalSum = sum + number + lastNumber;
//                System.out.println("sum of even numbers " + sum);
            }

        }
        return -100;
    }
}
