public class Divisibilidade {
    public static void main(String[] args) {
        System.out.println(divisibilidade(25));
    }
    public static int divisibilidade(int num) {
        if (num <= 0) {
            System.out.println("Invalid value");
            return -1;
        }
        for (int i=5; i>= num; i/=5 )
            if (num % 5 == 0) {
                System.out.println(i);
                return i;
            }
        return 0;
    }
}
