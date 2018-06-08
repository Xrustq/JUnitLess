package task1;

import org.junit.*;

import java.util.Random;


public class UtilsTest extends Assert {

    private Utils utils = new Utils();
    private Random rand = new Random();

    private int  n;
    private long c;

    @Before
    public void init(){

        n = rand.nextInt(20) + 1;
        c = utils.factorial(n);
    }


    @Test
    public void concatenateWords() {

        assertEquals("ab",utils.concatenateWords("a","b"));
    }

    @Test
    public void concatenateWordAndNull(){

        assertEquals("a",utils.concatenateWords("a",null));
        assertEquals("b",utils.concatenateWords(null,"b"));
    }

    @Test
    public void concatenateNull(){

        assertNull(utils.concatenateWords(null,null));
    }

    @Test
    public void concatenateEmptyStrings(){

        Utils utils = new Utils();  assertEquals("  ",utils.concatenateWords(" "," "));
    }

    @Test
    public void isLatin(){

        assertFalse(utils.concatenateWords("в","п").matches("^[A-Za-z]"));
    }

    @Test
    @Ignore
    public void testComputeFactorial() {

        assertEquals(1, utils.factorial(0));
        assertEquals(24, utils.factorial(4));
        assertEquals(362880, utils.factorial(9));
    }


    @Test(timeout=100)
    public void testFactorialWithTimeout() {

        assertEquals(c, utils.factorial(n));

    }


}