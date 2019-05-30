package by.epam.javatraining.yasenko.lesson05.task02.controller.main;

import by.epam.javatraining.yasenko.lesson05.task02.model.logic.LetterLogic;
import by.epam.javatraining.yasenko.lesson05.task02.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {
        char letter1 = 'д';
        char letter2 = 'y';
        char letter3 = '#';

        String logic1 = LetterLogic.VowelCheckOne(letter1);
        String logic2 = LetterLogic.VowelCheckTwo(letter2);
        String logic3 = LetterLogic.VowelCheckOne(letter3);

        Printer.println(letter1, logic1);
        Printer.println(letter2, logic2);
        Printer.println(letter3, logic3);

    }
}
