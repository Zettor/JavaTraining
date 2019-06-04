package by.epam.javatraining.yasenko.lesson06.task05.controller.main;

import by.epam.javatraining.yasenko.lesson06.task05.model.logic.NumberLogic;
import by.epam.javatraining.yasenko.lesson06.task05.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int number = 194;

        boolean logic = NumberLogic.checkIsSimple(number);

        Printer.println(logic);

    }

}
