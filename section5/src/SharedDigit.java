public class SharedDigit {

/*Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range,
the method should return false.The method should return true if there is a digit that appears in both numbers,
such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
*/
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(60, 16));
    }
    public static boolean hasSharedDigit(int num1, int num2) {

        boolean isValidNumbers = num1 > 9 && num1 < 100 && num2 > 9 && num2 < 100;
        if (!isValidNumbers) {
            System.out.println("out of range");
            return false;
        }

        // condicao para o loop seja interrompido antes do resultado da divisao por 10 for igual a zero
        while (num1 / 10 >= 1) {
            // armazena os digitos das nunidades
            int digitUnidadeNum1 = num1 % 10;
            int digitUnidadeNum2 = num2 % 10;
            // armazena o digito das dezenas
            num1 /= 10;
            num2 /= 10;
            // validacao de igualdade entre o algarimos da unidade do 1° numero com ambos algarismos do 2°
            boolean isUnityEqualUnityOrTens = digitUnidadeNum1 == digitUnidadeNum2 || digitUnidadeNum1 == num2;
            // validacao de igualdade entre o algarimos da dezena do 1° numero com ambos algarismos do 2°
            boolean isTensEqualUnityOrTens = num1 == num2 || num1 == digitUnidadeNum2;
            if (isTensEqualUnityOrTens || isUnityEqualUnityOrTens) {
                System.out.println("Ha algarismo semelhante entre os numeros");
                return true;
            }
        }
        System.out.println("Não ha nenhum algarismo semelhante entre os numeros");
        return false;
    }
}
/*  Essa logica compara digitos de mesma posicao no numero EX. dezena/dezena, unidade/unidade
*         boolean compareNumbers = true;
*         while (num1 > 1) {
            int digitsNum1 = num1 % 10;
            int digitsNum2 = num2 % 10;
            num1 /= 10;
            num2 /= 10;
*           compareNumbers = digitsNum1 == digitsNum2;
*       }
* */
