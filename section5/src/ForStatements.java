public class ForStatements {

    public static void main(String[] args) {
// for (initialized; termination; increment)
// initialized = Em qual valor o loop sera iniciado
// termination = Determina a saida do loop. Quando essa condição for verdadeira, o loop para. Enquanto for falsa, continua
// increment == A cada loop a variavel 'i' recebe um incremento

//        for (int i=0; i<5; i++ ){
//            System.out.println("Loop " + i);
//        }
//
//        for (int i=5; i>=0; i--) {
//            System.out.println("Loop " + i);
//        }

//        for (int i=10; i>=0; i-=2){
//            System.out.println("Loop par = " + i);
//        }
//        for (int i=11; i>=0; i-=2){
//            System.out.println("Loop impar = " + i);
//        }
//        for (int i=2; i<=16; i*=2){
//            System.out.println("Loop de multiplicacao = " + i);
//        }
//        for (int i=40; i>=2; i/=2){
//            System.out.println("Loop de divisao = " + i);
//        }

        for (int i=2; i<9; i++){
            System.out.println(String.format("10,000 at %d interest = %.2f", i, calculateInterest(10000, i)));
        }
        System.out.println("*********************************");
        for (int i=8; i>1; i--) {
            System.out.println(String.format("10,000 at %d interest = %.2f", i, calculateInterest(10000, i)));
        }




    }
    public static double calculateInterest(double amount, double interestRate) {

        return amount * (interestRate / 100);
    }
    public static int isDivisible(int year) {
        boolean isDisible = year % 4 == 0 ;
        return 0;
    }


}
