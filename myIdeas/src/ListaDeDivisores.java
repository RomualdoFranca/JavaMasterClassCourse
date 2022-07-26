public class ListaDeDivisores {

    public static void main(String[] args) {
        System.out.println(listaDivisores(32));
    }
    public static int listaDivisores(int num) {
        int count = 0;
        int i = 2;
        int numInteiro = num;
        // fazer a busca do divisores do numero ate no maximo a metade do seu valor
        // retornar o ultimo valor que tenha a divisao exata
        for ( i = 2; i <= numInteiro / 2; i++) {
            count++;
            System.out.println("quosciente " + num);
//            System.out.printf("%d° loop: Divisores : %d/%d\n",count, numInteiro, i);
            num = numInteiro / i;
            // implementa a logica para considerar apenas os divisores com quoscientes exatos
            if (numInteiro % i == 0) {
//                System.out.println("numInteiro " + numInteiro);
                System.out.printf("%d° loop:Divisao exata; Divisores : %d\n",count, i);
//                System.out.printf("%d° loop: divisao exata \n",count);

//                count++;
//                numInteiro /= i;
//                System.out.printf("%d° loop: Divisores sem resto: %d/%d\n",count, num, i);

            }
        }


        return 1;
    }
}
