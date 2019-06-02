package by.epam.javatraining.yasenko.lesson06.task02.controller.main;

import by.epam.javatraining.yasenko.lesson06.task02.model.logic.NumberLogic;
import by.epam.javatraining.yasenko.lesson06.task02.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int number = 987654;

        boolean logic = NumberLogic.checkSequence(number);

        Printer.println(logic);

    }
}
