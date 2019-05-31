package by.epam.javatraining.yasenko.lesson05.task03.controller.main;

import by.epam.javatraining.yasenko.lesson05.task03.model.logic.MoodSensor;
import by.epam.javatraining.yasenko.lesson05.task03.view.presentation.Printer;

public class Main {

    public static void main(String[] args) {

        String mood = MoodSensor.RandomMood();

        Printer.println(mood);

    }
}
