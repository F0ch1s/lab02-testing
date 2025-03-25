package caesarshift;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CaesarShiftCipherTest {
    @Test
    public void testSimpleShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }
    @Test
    public void testShiftWithWrapAround() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals("abc", result);
    }
    @Test
    public void testShiftWithSpace() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("a b c", 1);
        Assertions.assertEquals("b c d", result);
    }
    @Test
    public void testNegativeShift() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("def", -3);
        Assertions.assertEquals("abc", result);
    }
    @Test
    public void testInvalidCharacter() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String result = cipher.CaesarShiftCipher("abc!", 2);
        Assertions.assertEquals("invalid", result);
    }
}
