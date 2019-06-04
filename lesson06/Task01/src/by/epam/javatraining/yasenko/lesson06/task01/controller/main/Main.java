package by.epam.javatraining.yasenko.lesson06.task01.controller.main;

import by.epam.javatraining.yasenko.lesson06.task01.model.logic.CoinLogic;
import by.epam.javatraining.yasenko.lesson06.task01.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        int throwcount = -2;

        String logic = CoinLogic.getHeadsAndTails(throwcount);


        Printer.println(logic);

    }
}
