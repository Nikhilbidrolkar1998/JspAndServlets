package com.voya.sample;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.voya","com.voya"})
@IncludePackages(value= {"com.voya.testcases.trial"})
public class AllTests {
	
}
