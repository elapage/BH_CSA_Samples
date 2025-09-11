/**
 * Displays two angles given a time (hours, minutes)
 * @author YOUR NAME HERE
 * @version Sept 11 2025
 */

public class AnalogClock
{
    public static void main(String[] args)
    {
        //set values
        int hour = 3;
        int minute = 14;

        double angleHour, angleMinute;
        double minuteRatio;

        //minuteRatio is the ratio of the minute to
        //all possible minutes
        minuteRatio = minute / 60.0;

        //minute is a value between 0-59, and must be
        //mapped to a value between 0-359
        angleMinute = minuteRatio * 360;

        //hour is a value between 1-12, and must be mapped
        //to a value between 0-359. You must take into
        //account the minute as well
        angleHour = (hour + minuteRatio) / 12.0 * 360;

        System.out.println("Minute angle: " + angleMinute);
        System.out.println("Hour angle: " + angleHour);
    }
}
