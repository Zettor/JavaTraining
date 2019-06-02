package by.epam.javatraining.yasenko.lesson06.task04.controller.main;

import by.epam.javatraining.yasenko.lesson06.task04.model.logic.NumberLogic;
import by.epam.javatraining.yasenko.lesson06.task04.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int number = 236;

        boolean logic = NumberLogic.ParityCheck(number);

        Printer.println(logic);
    }

}
