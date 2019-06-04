package by.epam.javatraining.yasenko.lesson06.task03.controller.main;

import by.epam.javatraining.yasenko.lesson06.task03.model.logic.NumberLogic;
import by.epam.javatraining.yasenko.lesson06.task03.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int number = 5;

        int result = NumberLogic.getFactorial(number);

        Printer.println(result);
    }
}
