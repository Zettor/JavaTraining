package by.epam.javatraining.yasenko.lesson05.task02.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class LetterLogicTest {

    @Test
    public void vowelCheckOneVowel() {
        char letter = 'y';

        String expected = "This letter is vowel.";

        Assert.assertEquals(expected, LetterLogic.VowelCheckOne(letter));
    }

    @Test
    public void vowelCheckOneNotVowel() {
        char letter = 'r';

        String expected = "This letter is not vowel.";

        Assert.assertEquals(expected, LetterLogic.VowelCheckOne(letter));
    }


    @Test
    public void vowelCheckTwoVowel() {
        char letter = 'a';

        String expected = "This letter is vowel.";

        Assert.assertEquals(expected, LetterLogic.VowelCheckTwo(letter));
    }

    @Test
    public void vowelCheckNotVowel() {
        char letter = 'r';

        String expected = "This letter is not vowel.";

        Assert.assertEquals(expected, LetterLogic.VowelCheckTwo(letter));
    }
}