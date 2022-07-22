
public class SecondsAndMinuts {
    public static void main(String[] args) {
        String convertion =  getDurationString(1, 5);
        System.out.println(convertion);
        System.out.println(getDurationString(30));

    }
    public static String getDurationString(int minuts, int seconds) {

        boolean isValidation = minuts >= 0 && (seconds >= 0 && seconds <= 59);
        if (isValidation) {
            int hours = minuts / 60;
            minuts %= 60;
            return hours + "h " + minuts + "m " + seconds + "s ";
        }
        return "This is invalid value";
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minuts = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minuts, remainingSeconds);
    }


}
