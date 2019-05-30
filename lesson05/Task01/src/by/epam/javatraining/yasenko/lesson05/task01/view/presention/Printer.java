package by.epam.javatraining.yasenko.lesson05.task01.view.presention;

public class Printer {

    public static void println(int heads, int eyes) {

        if (heads != 0) {
            System.out.println("The dragon has " + heads + " heads and "
                    + eyes + " eyes.");
        } else {
            System.out.println("Error: incorrect count of years!");
        }
    }
}
