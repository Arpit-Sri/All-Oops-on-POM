package interviewQue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunTestWithIAnnotation {
	@Test
	public void sample1() {
		System.out.println("Sample-1 got executed");
		Assert.fail("failed intensionally");
	}
	@Test
	public void sample2() {
		System.out.println("Sample-2 got executed");
	}
	@Test
	public void sample3() {
		System.out.println("Sample-3 got executed");
		Assert.fail("failed intensionally");
	}
		
		@Test
		public void sample4() {
			System.out.println("Sample-4 got executed");
			
	}

}
