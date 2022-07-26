public class greatestCommonDivisor {

    /*Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
    If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
    The method should return the greatest common divisor of the two numbers (int).
    The greatest common divisor is the largest positive integer that can fully divide each of the integers
    (i.e. without leaving a remainder).

    For example 12 and 30:
    12 can be divided by 1, 2, 3, 4, 6, 12
    30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
    The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.

    EXAMPLE INPUT/OUTPUT:
    * getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
    * getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
    * getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
    * getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder

    HINT: Use a while or a for loop and check if both numbers can be divided without a remainder.
    HINT: Find the minimum of the two numbers.
    */
    public static void main(String[] args) {
        System.out.println(Mdc(12));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int count = 0;
        int divisor = 2;
        boolean isMdc = first % divisor == 0 && second % divisor == 0;

        return 1;
    }

    public static int Mdc(int num) {
        if (num < 10) {
            return -1;
        }
        int countLoop = 0;
        for (int i = 2; num > 0;) {
            countLoop ++;
            System.out.printf("%d° loop fora do if; num = %d; i = %d\n", countLoop, num, i);
            num /= i;
            System.out.printf("%d° loop; num = %d; i = %d\n", countLoop, num, i);
            if (num % i >= 1) {
                System.out.printf("%d° loop  dentro do if antes do incremento e divisao; num = %d; i = %d\n", countLoop, num, i);
                i++;
                num /= i;
                System.out.printf("%d° loop dentro do if apos incremento e divisao; num = %d; i = %d\n", countLoop, num, i);

            }
        }

        return num;
    }
}
