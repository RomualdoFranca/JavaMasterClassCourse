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
        System.out.println(hasSameLastDigit(23,456,789));
    }
    public static boolean hasSameLastDigit(int numA, int numB, int numC) {
        boolean isNumAValid = numA > 9 && numA <= 1000;
        boolean isNumBValid = numB > 9 && numB <= 1000;
        boolean isNumCValid = numC > 9 && numC <= 1000;

        if (!isNumAValid || !isNumBValid || !isNumCValid) {
            System.out.println("number out of range ");
            return false;
        }
        // variavel de controle
        int count = 0;
        while (count < 1) {
            int digitUnityNumA = numA % 10;
            int digitUnityNumB = numB % 10;
            int digitUnityNumC = numC % 10;
            System.out.println("");
            numA /= 10;
            int digitTensNumA = numA % 10;
            numB /= 10;
            int digitTensNumB = numB % 10;
            numC /= 10;
            int digitTensNumC = numC % 10;
            count++;

        }
        System.out.println("return");
        return true;


    }
}
/* Outputs para verificar as logicas aplicada nos argumentos

*       System.out.println("digito da unidade de numA " + digitUnityNumA);
        System.out.println("digito da unidade de numB " + digitUnityNumB);
        System.out.println("digito da unidade de numC " + digitUnityNumC);
        System.out.println("digito das dezenas de numB " + digitTensNumB);
        System.out.println("digito das dezenas de numA " + digitTensNumA);
        System.out.println("digito das dezenas de numC " + digitTensNumC);
        *
        *
* */