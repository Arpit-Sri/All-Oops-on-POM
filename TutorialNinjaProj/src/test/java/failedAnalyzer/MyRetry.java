package failedAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer{
	
	
	
	int count=0;
	int retryLimit=9;
	@Override
	public boolean retry(ITestResult result) {
			
			if(count<retryLimit) {
				count++;
				return true;
			}
		return false;
	}
	

}
