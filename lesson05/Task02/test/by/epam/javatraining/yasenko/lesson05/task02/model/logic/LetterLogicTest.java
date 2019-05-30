package by.epam.javatraining.yasenko.lesson05.task02.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class LetterLogicTest {

    @Test
    public void vowelCheckOneIncorrect() {
        char letter = '*';

        String expected = "not a";

        Assert.assertEquals(expected, LetterLogic.VowelCheckOne(letter));
    }

    @Test
    public void vowelCheckOneVowel() {
        char letter = 'e';

        String expected = "a vowel";

        Assert.assertEquals(expected, LetterLogic.VowelCheckOne(letter));
    }

    @Test
    public void vowelCheckOneConsonant() {
        char letter = 'г';

        String expected = "a consonant";

        Assert.assertEquals(expected, LetterLogic.VowelCheckOne(letter));
    }

    @Test
    public void vowelCheckTwoIncorrect() {
        char letter = '*';

        String expected = "not a";

        Assert.assertEquals(expected, LetterLogic.VowelCheckTwo(letter));
    }

    @Test
    public void vowelCheckTwoVowel() {
        char letter = 'e';

        String expected = "a vowel";

        Assert.assertEquals(expected, LetterLogic.VowelCheckTwo(letter));
    }

    @Test
    public void vowelCheckTwoConsonant() {
        char letter = 'г';

        String expected = "a consonant";

        Assert.assertEquals(expected, LetterLogic.VowelCheckTwo(letter));
    }
}