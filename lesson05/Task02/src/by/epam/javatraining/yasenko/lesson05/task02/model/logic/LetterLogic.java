package by.epam.javatraining.yasenko.lesson05.task02.model.logic;

public class LetterLogic {

    public static final String VOWELS = "aeiyou";
    public static final String VOWEL_MSG = "This letter is vowel.";
    public static final String NOT_VOWEL_MSG = "This letter is not vowel.";


    public static String VowelCheckOne(char letter) {

        letter = Character.toLowerCase(letter);

        return VOWELS.contains(Character.toString(letter)) ? VOWEL_MSG : NOT_VOWEL_MSG;
    }

    public static String VowelCheckTwo(char letter) {

        letter = Character.toLowerCase(letter);

        String checker = NOT_VOWEL_MSG;

        for (char ch : VOWELS.toCharArray()) {
            if (letter == ch)
                checker = VOWEL_MSG;
        }

        return checker;
    }
}