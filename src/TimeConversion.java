package org.challenges;

public class TimeConversion {
    private static String timeConversion(String time) {
        String[] timeParts = time.split(":");
        if ((timeParts[0].equals("12") && time.toLowerCase().contains("am"))
        || (!timeParts[0].equals("12") && time.toLowerCase().contains("pm"))) {
            int hour = (Integer.parseInt(timeParts[0]) + 12) % 24;
            timeParts[0] = String.format("%02d", hour);
        }
        return String.join(":", timeParts).replaceAll("(?i)am|pm", "");
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:45PM"));
    }
}
