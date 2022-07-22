public class Sum3And5 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i=1; i<=1000; i++) {
            if (i % 15 == 0) {
                count ++;
                sum += i;
                System.out.println("Find number = " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum = " + sum);// Deve esta fora do loop, ou o resultado sera incorreto

    }
}
