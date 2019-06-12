package by.epam.javatraining.yasenko.lesson05.task04.model.logic;

import javax.swing.*;

public class DateLogic {

    private static final int FEBRUARY = 2;
    private static final int APRIL = 4;
    private static final int JUNE = 6;
    private static final int SEPTEMBER = 9;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;
    private static final int MONTH_COUNT = 12;
    private static final int USUAL_DAY_COUNT = 31;
    private static final int UNUSUAL_DAY_COUNT = 30;
    private static final int LEAP_FEBRUARY_DAY = 29;
    private static final int FEBRUARY_DAY = 28;
    private static final String ERROR_MSG = "Error: incorrect date! ";
    private static final String SPLITER = ".";


    public static boolean DateCheck(int year, int month, int day) {

        boolean checker = false;
        if ((month >= 0 && month <= MONTH_COUNT) && (day >= 0 && day <= USUAL_DAY_COUNT)) {
            if (month == FEBRUARY && day <= LEAP_FEBRUARY_DAY) {
                if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                    checker = true;
                } else if (day <= FEBRUARY_DAY) {
                    checker = true;
                }
            } else if ((month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER)) {
                if (day <= UNUSUAL_DAY_COUNT)
                    checker = true;
            } else if (month != FEBRUARY) {
                checker = true;
            }
        }
        return checker;
    }


    public static String showTomorrow(int year, int month, int day) {

        if (!DateCheck(year, month, day)) {
            return ERROR_MSG;
        }

        if (month == FEBRUARY) {

            if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                if (day == LEAP_FEBRUARY_DAY) {
                    month++;
                    day = 1;
                }
            } else if (day == FEBRUARY_DAY) {
                month++;
                day = 1;
            }
        } else if ((month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER)
                && day == UNUSUAL_DAY_COUNT) {
            month++;
            day = 1;

        } else if (day == USUAL_DAY_COUNT && month == DECEMBER) {
            year++;
            month = 1;
            day = 1;

        } else if (day == USUAL_DAY_COUNT) {
            month++;
            day = 1;
        } else {
            day++;
        }
        return "" + year + SPLITER + month + SPLITER + day + SPLITER;
    }

}

