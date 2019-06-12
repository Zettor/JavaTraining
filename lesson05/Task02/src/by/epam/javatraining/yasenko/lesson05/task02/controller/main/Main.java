
package by.epam.javatraining.yasenko.lesson05.task02.controller.main;

import by.epam.javatraining.yasenko.lesson05.task02.model.logic.LetterLogic;
import by.epam.javatraining.yasenko.lesson05.task02.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {
        char letter1 = 'u';
        char letter2 = 'z';


        String logic1 = LetterLogic.VowelCheckOne(letter1);
        String logic2 = LetterLogic.VowelCheckTwo(letter2);


        Printer.println(logic1);
        Printer.println(logic2);

    }
}