import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    @DisplayName("Palindrom Sayılar Testi")
    @Test
    public void testIsPalindrome(){
        assertTrue(Main.isPalindrome(-1221));
        assertTrue(Main.isPalindrome(707));
        assertFalse(Main.isPalindrome(11212));
    }

    @DisplayName("Mükemmel Sayılar Testi")
    @Test
    public void testIsPerfectNumber(){
        assertTrue(Main.isPerfectNumber(6));
        assertTrue(Main.isPerfectNumber(28));
        assertFalse(Main.isPerfectNumber(5));
        assertFalse(Main.isPerfectNumber(-1));

    }

    @DisplayName("Sayıları Kelimelere Cevirme Testi")
    @Test
    public void testNumberToWords(){
        assertEquals("One Two Three", Main.numberToWords(123));
        assertEquals("One Zero One Zero", Main.numberToWords(1010));
        assertEquals("Invalid Value", Main.numberToWords(-12));
    }
}
