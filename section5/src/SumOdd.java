public class SumOdd {
/*Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
Check that number is > 0, if it is not return false.If number is odd return true, otherwise  return false.
Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
The method should use a for loop to sum all odd numbers  in that range including the end and return the sum.
It should call the method isOdd to check if each number is odd.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied return -1 from the method to indicate invalid input.

Example input/output:
* sumOdd(1, 100); → should return 2500
* sumOdd(-1, 100); →  should return -1
* sumOdd(100, 100); → should return 0
* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
* sumOdd(100, -100); → should return -1
* sumOdd(100, 1000); → should return 247500

TIP: use the remainder operator to check if the number is odd
*/
    public static void main(String[] args) {

//        sumOdd(1,10);// testing if output it's only odd numbers
        System.out.println(sumOdd(100, 1000));
    }
    //  validate the odd numbers
    public static boolean  isOdd(int number) {
        // if the number is a multiple of 2, it isn't odd.
        return number > 0 && number % 2 != 0;
    }
    public static int sumOdd(int start, int end) {
        if (end < start || start < 0) {
            return -1;
        }
        // Essa variavel deve ficar fora do loop para que seja possivel chamar o retorno fora do loop
        int sum = 0;
        // Minha primeira duvida foi como iria atribuir os valores a init, condition e increment, principalmento o incremet
        for (int i = start; i <= end; i++){
//            System.out.println("All numbers "+ i);
//            System.out.println("Sum the odd numbers " + sum);
            if (isOdd(i)) {
                // testing if output it's only odd numbers
//                System.out.println("Only odd numbers " + i);
                sum += i;
                // Estava numa duvida desgraçada se deveria ter retorno dentro do if. NÃO PRECISA NESSE CASO
            }
        }
        // Essa merda desse retorno foi o que me causou todo o problema
        // FICAR ATENTO A LOCALIZAÇÃO DO RETURNO
        return sum;
    }
}
