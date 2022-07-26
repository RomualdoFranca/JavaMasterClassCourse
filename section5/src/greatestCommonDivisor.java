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
        System.out.println(Mdc(18));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 0 || second < 0) {
            return -1;
        }
        int count = 0;
        int divisor = 2;
        boolean isMdc = first % divisor == 0 && second % divisor == 0;

        return 1;
    }

    public static int Mdc(int num) {
        if (num <= 0) {
            return -1;
        }
        int quosciente = 0;
        int remainderNum = 0;
        // enquanto o resto num % i == 0; nao deve haver incremento no i
        for (int i = 2; num > 0;) {
            System.out.println("num 1 = " + num);
//            num /= i;
            // Se o resto da divisao do numero pelo incremento for igual a zero, o if é acessado
            if (num % i == 0) {
                // 1° divisao de num por 2.
                num /= i;
                System.out.println("num 2 = " + num);
                System.out.println("incremento dentro do if " + i);
                System.out.println("");
            }else {
            i++;
            }
            System.out.println("num 3 = " + num);
            System.out.println("incremento fora do if " + i);
//            num /= i;
            System.out.println("num 4 = " + num);
            System.out.println("");

        }
        return 1;
    }
}
