public class DayOfWeek {
    public static void main(String[] args) {
        printDayOfWeek(-1);
        printDayOfWeek(7);
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

    }
    private static void printDayOfWeek(int day) {
//        if (day < 0 || day > 6) {
//            System.out.println("Invalid day");
//        }

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day"); // Usa-se o defaut ao inves do if para validar os parametros
                break;
        }
    }
}
