package by.epam.javatraining.yasenko.lesson05.task02.model.logic;

public class LetterLogic {

    public static String VowelCheckOne(char letter) {

        if (!Character.isLetter(letter)) {
            return "not a";
        }

        letter = Character.toLowerCase(letter);

        if ("aeiyouаеёиоуыэюя".contains(Character.toString(letter))) {
            return "a vowel";
        } else {
            return "a consonant";
        }
    }

    public static String VowelCheckTwo(char letter) {

        if (!Character.isLetter(letter)) {
            return "not a";
        }

        letter = Character.toLowerCase(letter);

        for (char ch : "aeioyuаеёиоуыэюя".toCharArray()) {
            if (letter == ch)
                return "a vowel";
        }

        return "a consonant";
    }
}
