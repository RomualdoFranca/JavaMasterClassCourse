public class SumOddNumbers {

    public static void main(String[] args) {
        System.out.println(sumOdd(-1,10));
    }
    public static boolean  isOdd(int number) {

        return number % 2 != 0 && number > 0;
    }
    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) {
            return -1;
        }
        int sumOdd = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }
}


