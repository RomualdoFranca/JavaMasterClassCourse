public class Gcd {
    public static void main(String[] args) {
//        System.out.println(getGcdBybruteForce(12,32));
//        System.out.println(euclidsAlgorithm(12, 32));
        System.out.println(steinsAlgorithm(12, 32));
    }
    public static int getGcdBybruteForce(int num1, int num2) {
        // tive essa ideia mas nao implementei da maneira correta: we need to iterate over the loop for n times
        // (equivalent to the smaller number) to find the GCD
        // variavel fora do loop para ser acessada pelo retorno
        int gcd = 1;
        // for (initialized; termination; increment)
        // i = 1; inicio do loop
        // i <= num1 && i <= num2; fim do loop quando o i for igual ao num1 e igual a num2
        // nao sabia que podia ter uma 'terminacao' de mais de uma variavel (com excessao do i) dentro do loop
        for (int i = 1; i <= num1 && i <= num2; i++) {
            // Para que o 'i' seja o gcd ele precisa dividir ambos os numeros ao mesmo tempo.
            // nao imaginei que essa condicao do if "pegaria" o maior divisor de ambos
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static int euclidsAlgorithm(int n1, int n2) {

        if (n2 == 0) {
            return n1;
        }
        return euclidsAlgorithm(n2, n1 % n2);
    }
    public static int steinsAlgorithm(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }

        if (n2 == 0) {
            return n1;
        }

        int n;
        for (n = 0; ((n1 | n2) & 1) == 0; n++) {
            System.out.println("n1 = " + n1);
            System.out.println("n2 = " + n2);
            // Bitwise and Bit Shift Operators
            n1 >>= 1;
            System.out.println("n1 >>= 1" + n1);
            n2 >>= 1;
            System.out.println("n2 >>= 1" + n2);
        }

        while ((n1 & 1) == 0) {
            n1 >>= 1;
        }

        do {
            while ((n2 & 1) == 0) {
                n2 >>= 1;
            }

            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            n2 = (n2 - n1);
        } while (n2 != 0);
        return n1 << n;
    }

}
