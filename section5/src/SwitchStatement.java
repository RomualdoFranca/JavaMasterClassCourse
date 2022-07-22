public class SwitchStatement {
    public static void main(String[] args) {

        char letter = 'a';

        switch (letter) {
            case 'a':
                System.out.println("Was a 'a' ");
                break;
            case 'b':
                System.out.println("Was a 'b' ");
                break;
            default:
                System.out.println("Was not 'a' or 'b'");
                break;
        }

    }
}
