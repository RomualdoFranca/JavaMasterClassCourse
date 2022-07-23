public class SharedDigit {

/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range,
the method should return false.The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
*/
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(23, 23));
    }
    public static boolean hasSharedDigit(int num1, int num2) {

        boolean isValidNumbers = num1 > 9 && num1 < 100 && num2 > 9 && num2 < 100;
        if (!isValidNumbers) {
            return false;
        }
        int compareNumbers = 0;
        while (num1 > 0) {
            int digitsNum1 = num1 % 10;
            int digitsNum2 = num2 % 10;
            num1 /= 10;
            System.out.println("num1 " + digitsNum1);
            num2 /= 10;
            System.out.println("num2 " + digitsNum2);
            if (digitsNum1 == digitsNum2) {
                System.out.printf("num1 %d num2 %d", num1, num2);
            }
        }
        return true;
    }
}
