package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkPageTest extends LaunchTest {
	@Test
	public void testcase1() {
		fswp.worktest();
	
	}
	@Test
	public void testcase2() {
		fswp.worktest2();
		Assert.fail("Testcase is failed.........");
	}

}
