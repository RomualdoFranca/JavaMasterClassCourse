public class ListaDeDivisores {

    public static void main(String[] args) {
        System.out.println(listaDivisores(12, 20));
    }
    public static int listaDivisores(int num, int num2) {
        int count = 0;
        int i = 2;
        int numInteiro = num;
        // fazer a busca do divisores do numero ate no maximo a metade do seu valor
        // retornar o ultimo valor que tenha a divisao exata
        for ( i = 2; i <= num / 2; i++) {
            // a quantidade de loops deve ser definida a partir do menor numero
            count++;
            System.out.printf("%d° loop %d/%d\n",count, num, i);
            numInteiro /= i;
        }


        return 1;
    }
}
