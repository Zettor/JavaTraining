package by.epam.javatraining.Yasenko.lesson05.task04.task04.controller.main;

import by.epam.javatraining.Yasenko.lesson05.task04.task04.model.logic.DateLogic;
import by.epam.javatraining.Yasenko.lesson05.task04.task04.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int year = 2019;
        int month = 05;
        int day = 31;

        String tomorrow = DateLogic.showTomorrow(year, month, day);

        Printer.println(tomorrow);
    }
}
