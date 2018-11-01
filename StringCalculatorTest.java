import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {




	   // @Test
	    public void test() {
	        String expected = "2.0";
	        String actual = StringCalculator.add("1,1");
	        assertEquals(expected, actual);
	    }
	    @Test
	    public void test11() {
	        String expected = "0";
	        String actual = StringCalculator.add("");
	        assertEquals(expected, actual);
	    }
	    @Test
	    public void test1() {
	        String expected = "Number expected but '\n' found at position 1";
	        String actual = StringCalculator.add("1,\n1");
	        assertEquals(expected, actual);
	    
	    }
	    @Test
	    public void test2() {
	        String expected = "Number expected but Eof found";
	        String actual = StringCalculator.add("2,3,");
	        assertEquals(expected, actual);
	    }
	   
	    
	}



