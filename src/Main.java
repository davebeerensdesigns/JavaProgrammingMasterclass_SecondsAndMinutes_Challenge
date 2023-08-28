public class Main {

    public static void main(String[] args) {
        // convert seconds to time
        System.out.println(getDurationString(1830));
        // convert minutes and seconds to time
        System.out.println(getDurationString(30, 30));
    }

    public static String getDurationString(int seconds){
        // check if seconds is not a negative number
        if(seconds < 0) {
            return "Seconds can't be a negative number";
        }
        // calculate whole minutes from seconds
        int secondsToMinutes = seconds / 60; // 3630 / 60 = 60.5
        // calculate whole hours from calculated minutes
        int minutesToHours = secondsToMinutes / 60; // 60.5 / 60 = 1.0083333
        // check how many seconds are remaining after dividing total seconds by 60
        int secondsRemaining = seconds % 60; // 30
        // check how many minutes are remaining after dividing total minutes by 60
        int minutesRemaining = secondsToMinutes % 60;

        // return the time
        return minutesToHours + "h " + minutesRemaining + "m " + secondsRemaining + "s";

    }
    public static String getDurationString(int minutes, int seconds){
        // check if minutes is not a negative number
        if(minutes < 0){
            return "Minutes can't be a negative number";
        }
        // check if seconds is not a negative number
        if(seconds < 0) {
            return "Seconds can't be a negative number";
        }
        // check if seconds is not more than 59 seconds
        if(seconds > 59){
            return "Seconds can't be higher than 59";
        }
        // use method overload to calculate time
        return getDurationString((minutes * 60) + seconds);
    }
}