public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
//            System.out.println("Count is " + count);
            count++;
        }
        count = 2;
        while (true) {
            if (count == 12) {
                break;
            }
            System.out.println("Count while " + count);
            count +=2;
        }

//        System.out.println("For loop");
        // The same thing if for loop
        for (count = 1; count < 6; count++) {
//            System.out.println("Count is " + count);
        }
    }
}
