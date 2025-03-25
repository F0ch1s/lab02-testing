package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GHappyTest {
    @Test
    public void testDoubleG() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("xxggxx"));
    }
    @Test
    public void testLonelyG() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxgxx"));
    }
    @Test
    public void testGGroupAndLonelyG() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("xxggyygxx"));
    }
    @Test
    public void testAllHappyGs() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("gggg"));
    }
    @Test
    public void testEmptyString() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy(""));
    }
    @Test
    public void testNoGs() {
        GHappy gh = new GHappy();
        Assertions.assertTrue(gh.gHappy("abcdef"));
    }
    @Test
    public void testGAtBeginningAndEnd() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("gxxggxxg"));
    }
    @Test
    public void testSingleG() {
        GHappy gh = new GHappy();
        Assertions.assertFalse(gh.gHappy("g"));
    }
}
