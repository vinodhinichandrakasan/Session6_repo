package com.framework.testng.api.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryEngine implements IRetryAnalyzer {
	 
   private int count = 0;

	public boolean retry(ITestResult iTestResult) {
		if (count < 3) {
			count++;
			return true;
		}
		return false;
	}
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryEngine.class);
	}
 
}
