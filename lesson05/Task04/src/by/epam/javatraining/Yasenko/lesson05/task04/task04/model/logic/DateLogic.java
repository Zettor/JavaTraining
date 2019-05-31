package by.epam.javatraining.Yasenko.lesson05.task04.task04.model.logic;

import javax.swing.*;

public class DateLogic {

    private static final int FEBRUARY = 2;
    private static final int APRIL = 4;
    private static final int JUNE = 6;
    private static final int SEPTEMBER = 9;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;


    public static boolean DateCheck(int year, int month, int day) {
        if ((month >= 0 && month <= 12) && day >= 0 && day <= 31) {
            if (month == FEBRUARY) {
                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && day <= 29) {
                    return true;
                }
                if (day <= 28) {
                    return true;
                }
            } else if ((month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER)) {
                if (day <= 30)
                    return true;
            } else if (month != FEBRUARY) {
                return true;
            }
        }
        return false;
    }


    public static String showTomorrow(int year, int month, int day) {

        if (DateCheck(year, month, day)) {
            if (month == FEBRUARY) {

                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                    if (day == 29) {
                        month++;
                        day = 1;
                    }
                } else if ( day == 28) {
                    month++;
                    day = 1;
                }
            } else if ((month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER)
                    && day == 30) {
                month++;
                day = 1;

            } else if (day == 31 && month == DECEMBER) {
                year++;
                month = 1;
                day = 1;

            } else if (day == 31) {
                month++;
                day = 1;
            } else {
                day++;
            }

        } else {
            return "Error: incorrect date! ";
        }
        return "" + year + "." + month + "." + day + ".";
    }

}


