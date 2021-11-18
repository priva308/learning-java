package Priyanka_Assertion_practice;

import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Practice_1 {
	@Test
	public void assertIt() {
		Assert.assertEquals(9, 9);
	}
}
