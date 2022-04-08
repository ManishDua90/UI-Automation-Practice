package testngtests;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngClass1 {
	Logger logger = null;
	
	public TestngClass1()
	{
		logger = Logger.getLogger(TestngClass1.class);
	}
	
	@BeforeClass
	public void start() {
		logger.info("Starting TestNG tests.");
	}


	@Test (priority = 2)
	public void test1()
	{
		System.out.println("THIS IS A TEST1");
	}


	@Test (priority = 0)
	public void test2()
	{
		System.out.println("THIS IS A TEST2");
	}

	@Test
	public void test3()
	{
		System.out.println("THIS IS A TEST3");
	}

	@Test
	@Parameters({"testparam"})
	public void test4(String value)
	{
		System.out.println("THIS IS A TEST4 parameter : " + value);
	}


	@Test (priority = 1)
	public void test()
	{
		System.out.println("THIS IS A TEST");
	}

	@Test (dataProvider = "data-provider")
	public void test5(String value)
	{
		System.out.println("THIS IS A TEST5 : " + value);
	}

	@DataProvider (name = "data-provider")
	public Object[] dpMethod(){
		return new Object[] {"First-Value", "Second-Value"};
	}
	
	@AfterClass
	public void end() {
		logger.info("Finished TestNG tests.");
	}

}
