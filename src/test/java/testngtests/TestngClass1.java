package testngtests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngClass1 {


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

}
