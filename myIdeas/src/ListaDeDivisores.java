public class ListaDeDivisores {

    public static void main(String[] args) {
        System.out.println(listaDivisores(24));
    }
    public static int listaDivisores(int num) {

        int count = 0;
        for (int i = 2; i <= num; i++) {
            count++;
            if (num % i == 0) {
                System.out.printf("%d,", i);
            }
        }
        return 1;
    }
}
/*       for (int i = 2; i <= num; i++) {
            count++;
//            System.out.println("quosciente " + num);
//            num = numInteiro / i;
            // condicao
            if (num % i == 0) {
//                System.out.println("numInteiro " + numInteiro);
//                System.out.printf("%d° loop; Divisores exatos: %d\n",count, i);
                System.out.printf("%d,", i);
            }
        }*/