package QnA;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGQnA {
	
	@Test(dataProvider="data")
	public void testCaseone(String str, Integer i){
		System.out.println("Argument 1 - String " + str + "Argument 2 - Integer " +i);
	}

	@DataProvider(name="data")
	public Object[][] getData(){
			// Row repeat method 3 times
		    // Column number of arguments 2
		Object[][] obj = new Object [3][2];
		
		obj[0][0]  = "String 1";
		obj[0][1]  = 123;
		
		obj[1][0]  = "String 2";
		obj[1][1]  = 456;
		obj[2][0]  = "String 3";
		obj[2][1]  = 789;
		
		return obj;
	}
	
//	Below is the main difference between @Factory and @DataProvider functionalities on TestNG.

	//DataProvider: A test method that uses DataProvider will be executed a multiple number of times based on the data provided by 
			//the DataProvider. The test method will be executed using the same instance of the test class to which the
			//test method belongs.
	//Factory: A factory will execute all the test methods present inside a test class using a separate instance of the respective 
	           //class.
	
	public class DataProviderClass
	{
	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before class executed");
	    }
	 
	    @Test(dataProvider = "dataMethod")
	    public void testMethod(String param) {
	        System.out.println("The parameter value is: " + param);
	    }
	 
	    @DataProvider
	    public Object[][] dataMethod() {
	        return new Object[][] { { "one" }, { "two" } };
	    }
	}
	
	Output:  
		Before clas_executed
		The parameter value is: one
		The parameter value is: two
		PASSED: testMethod("one")
		PASSED: testMethod("two")
		
		------------Factory-------------
		
		public class SimpleTest
		{
		    private String param = "";
		 
		    public SimpleTest(String param) {
		        this.param = param;
		    }
		 
		    @BeforeClass
		    public void beforeClass() {
		        System.out.println("Before SimpleTest class executed.");
		    }
		 
		    @Test
		    public void testMethod() {
		        System.out.println("testMethod parameter value is: " + param);
		    }
		}
		 
		public class SimpleTestFactory
		{
		    @Factory
		    public Object[] factoryMethod() {
		        return new Object[] {
		                                new SimpleTest("one"),
		                                new SimpleTest("two")
		                            };
		    }
		}
		
		output:
			Before SimpleTest class executed.
			testMethod parameter value is: two
			Before SimpleTest class executed.
			testMethod parameter value is: one
			PASSED: testMethod
			PASSED: testMethod
	//@Test
/*	
 * 
 *  
		    ****************************************************
		    
		    TestNG
		    @BeforeSuite /After
		    @BeforeClass/After
		    @BeforeTest/After
		    @BeforeGroup/After
		    @BeforeMethod/After
		    @DataProvider
		    @Listener
		    @Test
		    
		    @Test(priority=2)
		    @Test(dependsOnMethods={"meht1","mehtod2"}
		    @Test(group ="grpname"}
		    @Test(enabled=false)
		    
		    
		    Junit annotaionts
		    @Test
		    @BeforeClass
		    @AfterClass
		    @Before - Before Test 
		    @After - After test
		    
		    @Test(invocationCount=10)
		    public void exam(){
		       // it repeates this method 10 times
		    }
		    
		    @Test(expectedException=NumberFormatException.class)
		    public void exam(){
		    // we are expecting numberformationexception so continue ,,, no fail case
		    }
		    @Test(invocationTimeout=<timeperiod>)
		    
		    @Parameters({"browser","env"})
			public void pageTitleTest(String browser, String env){
		
			System.out.println("browser :  "+browser);
			System.out.println("env :  "+env);
			}
		    
		    <?xml>
		    <suite name ="name">
		    
		    <test name ="tname">
		    <classes>
		    <class name ="com.easy.Testcase"/>
		     <class name ="com.easy.Testcase"/>
		     </classes>
		     </test>
		     
		     <test name ="tname2">
		    <classes>
		    <class name ="com.easy.Testcase"/>
		     <class name ="com.easy.Testcase"/>
		     </classes>
		     </test>
		     
		     </suite>
		     
		     
		     Different TestNG asserts
		     
		    assertEqual(String actual, String Expect);
		    assertEqual(String actual, String Expect, String message);
		    assertEquals(Boolean actual, Boolean expected);
		    assertTrue(conditio);
		    assertTrue(condition, message);
		    assertFalse(condition)
		    assertFalse(condition, message)
		    
		    // if softassert is pass/fail it will continue to next step.
		     * if hard assert is fail it will terminate test case execution

Different types of listeners in TestNG

IExecutionListener
IAnnotationTransformer
ISuiteListener
ITestListener
*******************************************************************

	} */
}
