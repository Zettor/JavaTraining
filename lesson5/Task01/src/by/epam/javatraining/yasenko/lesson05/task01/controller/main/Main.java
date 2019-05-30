package by.epam.javatraining.yasenko.lesson05.task01.controller.main;

import by.epam.javatraining.yasenko.lesson05.task01.model.logic.DragonLogic;
import by.epam.javatraining.yasenko.lesson05.task01.view.Printer;


public class Main {

    public static void main(String[] args) {


        double years = 250;

        int heads = DragonLogic.getHeads(years);
        int eyes = DragonLogic.getEyes(years);

        Printer.println(heads, eyes);
    }
}
