public class ListaDeDivisores {

    public static void main(String[] args) {
        System.out.println(listaDivisores(12, 20));
    }
    public static int listaDivisores(int num, int num2) {

        int count = num;
        int i = 2;
        int remainderNum = 0;
        for ( i = 2; i <= num; i++) {
            // a quantidade de loops deve ser definida a partir do menor numero
            count++;
            System.out.printf("%d° loop %d/%d\n",count, num, i);
            num /= i;
        }


        return 1;
    }
}
