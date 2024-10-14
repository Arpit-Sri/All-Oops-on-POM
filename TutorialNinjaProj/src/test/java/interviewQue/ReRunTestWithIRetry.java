package interviewQue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReRunTestWithIRetry {
	
	@Test(retryAnalyzer = failedAnalyzer.MyRetry.class)
	public void sampleOne() {
		System.out.println("SampleOne got executed");
	}
	
	//we are failing this method intenstionally by using assertFail() method.
	@Test(retryAnalyzer = failedAnalyzer.MyRetry.class)
	public void sampleTwo() {
		System.out.println("SampleTwo got executed");
		Assert.fail("failed intensionally");
	}
	@Test(retryAnalyzer = failedAnalyzer.MyRetry.class)
	public void sampleThree() {
		System.out.println("SampleThree got executed");
	}
	@Test(retryAnalyzer = failedAnalyzer.MyRetry.class)
	public void sampleFour() {
		System.out.println("SampleFour got executed");
		Assert.fail("failed intensionally");
	}
}
