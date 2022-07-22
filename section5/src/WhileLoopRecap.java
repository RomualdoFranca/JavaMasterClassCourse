
public class WhileLoopRecap {
    public static void main(String[] args) {
//        System.out.println("While loop");
//        int count = 1; // initialization
//        while (count <= 5) { // condition
//            System.out.println("count = " + count);
//            count++; // increment
//        }
//        System.out.println("do-while loop");
//        do {
//            count++;
//            System.out.println("count = " + count);
//        } while (count <= 5);
//
//        System.out.println("For loop");
//        //  init   condition increment
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("count = " + i);
//        }
        int number = 0; // init
        while (number < 15) { // condition ( 0 < 15 is true )
            number++; // increment (number = 1)

            if (number <= 5) { // as long as number is less than or equal to 5, condition is true, execute code block
                System.out.println("Skipping number " + number);
                continue; // continue with a loop ( bypass all other conde in the block/body )
            }
            System.out.println("number " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break; // exit the loop depending on the condition that we are checking
            }

        }
    }
}
