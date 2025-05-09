import com.miguelromero717.java_study.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testCase1() {
        // given
        String word = "ABDEFGABEF";
        int expected = 6;

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.findLongest(word);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testCase2() {
        // given
        String word = "BBBB";
        int expected = 1;

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.findLongest(word);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testCase3() {
        // given
        String word = "GEEKSFORGEEKS";
        int expected = 7;

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.findLongest(word);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testCase4() {
        // given
        String word = "";
        int expected = 0;

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.findLongest(word);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testCase5() {
        // given
        int expected = 0;

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.findLongest(null);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testCase6() {
        // given
        String word = "GEE$SFORGEE$S";
        int expected = 7;

        // when
        int result = LongestSubstringWithoutRepeatingCharacters.findLongest(word);

        // then
        assertEquals(expected, result);
    }
}
