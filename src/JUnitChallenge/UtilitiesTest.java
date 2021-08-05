package JUnitChallenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private  Utilities utils;

    @Before
    public void setUp() throws Exception {
        utils= new Utilities();
        System.out.println("Running a test...");
    }

    @Test
    public void everyNthChar_1() {
       char [] nThArray = utils.everyNthChar(new char[]{'h','e','l','l','o'},2);
       assertArrayEquals(new char[]{'e', 'l'},nThArray );
    }
    @Test
    public void everyNthChar_2() {
        char [] nThArray = utils.everyNthChar(new char[]{'h','e','l','l','o'},6);
        assertArrayEquals(new char[]{'h','e','l','l','o'},nThArray );
    }
    @Test
    public void removePairs_1() {
        String result = utils.removePairs("AABCDDEF");
        assertEquals("ABCDEF",result);

    }
    @Test
    public void removePairs_2() {
        String result = utils.removePairs("ABCCABDEEF");
        assertEquals("ABCABDEF",result);

    }

    @Test
    public void removePairs_3() {
        assertNull("Did not get null returned when argument passed was null", utils.removePairs(null));
   }
    @Test
    public void removePairs_4() {
        String result = utils.removePairs("A");
        assertEquals("A",result);
    }
    @Test
    public void removePairs_5() {
        String result = utils.removePairs("");
        assertEquals("",result);
    }
    @Test
    public void converter_1() {
       int output = utils.converter(10,5);
       assertEquals(300,output);
    }
    @Test(expected = ArithmeticException.class)
    public void converter_2() throws Exception{
        utils.converter(10,0);


    }
    @Test
    public void nullIfOddLength() {
        assertEquals("even", utils.nullIfOddLength("even"));
        assertNotNull(utils.nullIfOddLength("even"));
        assertNull(utils.nullIfOddLength("odd"));
    }
}