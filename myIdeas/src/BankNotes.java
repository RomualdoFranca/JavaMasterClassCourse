public class BankNotes {

    /*
    In this problem you have to read an integer value and calculate the smallest possible number of banknotes in which the
    value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read value and the list of banknotes.
    Input
    The input file contains an integer value N (0 < N < 1000000).
    Output
    Print the read number and the minimum quantity of each necessary banknotes in Portuguese language,
    as the given example. Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.
    */
    public static void main(String[] args) {

//        System.out.println(isDivisibleFor50And20(70));
        bills(5);


    }
    public static boolean isDivisibleFor10And5(int money) {

        return money >= 20;
    }
    public static int bills(int money) {

        if (isDivisibleFor10And5(money)) {
            int cedula_20 = money / 20;
            int bill10 = money % 20 / 10;
            int cedula_5 = money % 10 / 5;
            System.out.printf("%d notas de 10 e %d notas de 5 ", bill10, cedula_5);

        }
        return money / 5;
    }



}
