import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ncsu.test3;

/**
 * The class <code>test3Test</code> contains tests for the class <code>{@link test3}</code>.
 *
 * @generatedBy CodePro at 3/9/15 10:34 PM
 * @author Mohit
 * @version $Revision: 1.0 $
 */
public class test3Test {
	/**
	 * Run the int grayCheck(byte,byte) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	@Test
	public void testGrayCheck_1()
		throws Exception {
		byte term1 = (byte) 1;
		byte term2 = (byte) 1;

		int result = test3.grayCheck(term1, term2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int grayCheck(byte,byte) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	@Test
	public void testGrayCheck_2()
		throws Exception {
		byte term1 = (byte) 1;
		byte term2 = (byte) 1;

		int result = test3.grayCheck(term1, term2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int grayCheck(byte,byte) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	@Test
	public void testGrayCheck_3()
		throws Exception {
		byte term1 = (byte) 1;
		byte term2 = (byte) 1;

		int result = test3.grayCheck(term1, term2);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void main(String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		test3.main(args);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/9/15 10:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(test3Test.class);
	}
}