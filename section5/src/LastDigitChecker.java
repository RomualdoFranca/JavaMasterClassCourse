public class LastDigitChecker {

/*Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within
the range, the method should return false.The method should return true if at least two of the numbers share the same
rightmost digit; otherwise, it should return false.

EXAMPLE INPUT/OUTPUT:
* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000

Write another method named isValid with one parameter of type int.
The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.

EXAMPLE INPUT/OUTPUT
* isValid(10); → should return true since 10 is within the range of 10-1000
* isValid(468); → should return true since 468 is within the range of 10-1000
* isValid(1051); → should return false since 1051 is not within the range of 10-1000
*/
    public static void main(String[] args) {
        // testanto as validacoes
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
    public static boolean hasSameLastDigit(int numA, int numB, int numC) {

        if (!isValid(numA) || !isValid(numB) || !isValid(numC)) {
            System.out.println("number out of range ");
            return false;
        }
        // variavel de controle foi usada para controlar a quantidade de loops que vao ocorrer, je que tendo 3
        // variaveis no metodo, eu nao sei qual delas usar para a condicao e o incremento
        int count = 0;
        // apenas um loop é suficiente para obter o digito das unidades das variaveis do metodo
        while (count < 1) {

            digitUnity(numA);
            digitUnity(numB);
            digitUnity(numC);
            count++;
        }
        return isValid(digitUnity(numA), digitUnity(numB), digitUnity(numC) );
    }
    // validar os numeros dentro do intervalo
    public static boolean isValid(int number) {
        return number > 9 && number <= 1000;
    }
    // obter o digito das unidades
    public static int digitUnity(int unity) {
        return unity % 10;
    }
    // comparar os digitos das unidades
    public static boolean isValid(int num1, int num2, int num3){
//  return digitUnity(numA) == digitUnity(numB) || digitUnity(numA) == digitUnity(numC) || digitUnity(numB) == digitUnity(numC);
        return num1 == num2 || num1 == num3 || num2 == num3;
    }
}
