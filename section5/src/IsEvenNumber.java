public class IsEvenNumber {
    public static void main(String[] args) {

//        isEvenNumber(3);
        int num = 4;
        int finishNum = 20;
        int countEvenNumber = 0;

        // correcao:
        while (num <= finishNum) {
            num++;
            if (!isEvenNumber(num)){
                continue;
            }
            System.out.println(num + " is a even number");
            countEvenNumber++;
            if (countEvenNumber >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found " + countEvenNumber);

        // minha solução
//        while (num <= finishNum) {
//            num++; // ATENCAO onde deve ser inserido a variavel de controle
//            if (!isEvenNumber(num)){ // negacao de um metodo
////                 System.out.println(num + " isn't a even number"); printa os numeros impares
//                continue; // se o if for false o loop ira passar para os proximos codigos abaixo
//            }
//            // countEvenNumber == 5: o break acontece na 5° volta do laço sem acessar o 5° numero par
//            countEvenNumber++;
//            if (countEvenNumber > 5) { // 2° estrutura de controle
//                break;
//            }
//            // esse sout tem relacao com a 2° estrutura de controle. ela sera repetida o n° de vezes da condicao dentro desse if
//            System.out.println(num + " is a even number"); // fora do if, todos os numeros pares sao printados
//
//            //
////            if (countEvenNumber == 5) {
////                System.out.println(num + " is a even number"); // com o output dentro do if, apenas o 5° numero par é printado
////               break;
////            }
//        }
    }
    public static boolean isEvenNumber(int num) {

        if ((num % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
//        while (true) {
//            // test to see if that number is not even
//            if (num % 2 != 0) {
//                System.out.println(num + " isn't an even number");
//                return false; //
//
//            }
//            System.out.println(num + " is an even number");
//            return true; // sem esse retorno, gera loop infinito
//        }

        // while com erros:

        // bug do codigo: loop infinito do sout fora do if
//        while (true) {
//            if (num % 2 != 0) {
//                System.out.println(num + " isn't an even number");
//                break;
//            }
//            System.out.println(num + " is an even number");
//        }
//        return true;

        // o codigo escrito dessa forma exige um retorno fora do loop
        // bug do codigo: o if sendo verdadeiro, o valor do retorno sempre irá retornar
//        while (true) {
//            if (num % 2 == 0) {
//                System.out.println(num + " is an even number");
//                break;
//
//            }
//            // se a condicao do if for false, essa parte do codigo sera chamada
//            System.out.println(num + " isn't an even number");
//            return false;
//        }
//        // ATENÇÃO: o valor desse retorno tem relação com o if. Se a condicao do if for true, o valor do retorno sera apresentado
//        // O valor desse retorno tem de ser coerente com a condicao do if
//        return true;

}
