package test;


import jDBC.Driver;

import org.junit.Assert;
import org.junit.Test;


public class IntegrationTest {

	public static Class<?> getSpecifications(){
		return Driver.class;
	}
	
	@Test
	public void test() {
		Assert.assertNotNull("Failed to create Driver implemenation",  (Driver)TestRunner.getImplementationInstance());
	}

}