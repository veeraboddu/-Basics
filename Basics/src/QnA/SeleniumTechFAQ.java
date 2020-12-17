package QnA;

public class SeleniumTechFAQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		seleniumFAQ();
		
		
	}
	
	// we need to pass driver + time + condition (clickable)
	// it will wait till the element to clicable then execute the event.
	// if element does not exist timeout exception will through. 
	public static void explicitWait(WebDriver driver, String str){
		(new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClicable(By.linkTest(str))));
	}
	
	//
	public static void implicitWait(WebDriver driver){
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnits.SECONDS)
	}
	public static void seleniumFAQ(){
		/*
		 retrive elements form dropdown and assert
		 
		 public class accessDropDown {
 public static void main(String[] args) { 
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
 }
}

WebElement select = driver.findElement(By.id("gender"));
List<WebElement> options = select.findElements(By.tagName("option"));

for (WebElement option : options) {
if("Germany".equals(option.getText().trim()))
 option.click();   
}
		 ------------
		 locators
		    - ID,xpath, name, byClassName, css, selector, byTagName, linkTest, partiallLinkTest
		    id, name, link
		    , partialLinkText, tagName, cssSelector, classname, Xpath
id
name
linkText
partialLinkText
tagName
cssSelector
className
xpath


		 Example
		 
		 public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java Practice\\SeleniumJars\\chromedriver_win32\\chrome_2_25\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.facebook.com/");
		wd.findElement(By.id("email")).sendKeys("sunitha.paraselli20@gmail.com");
		wd.findElement(By.id("pass")).sendKeys("mummysis3");
		wd.findElement(By.id("u_0_o")).click();
	}
		 
		 
		  Q. wait statement till the element is visible
 *       wait statement until the alert present.
	public void seleniumMethods(){
		WebDriver driver = new WebDriver(FirefoxDriver);
		WebDriverWait wait = new WebDriverWait(driver,20);
		Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("path")));
		
		WebDriverWait wdw = new WebDriverWait(driver,20);
		wdw.until(ExpectedConditions.alertsPresent());
		
		explicit
		driver.manager().timeouts().pageloadtimeout(10,timeunits.seconds);
		
		implicti
		driver.manager().timeouts().implicitwait(10,timeunits.seconds);
		
		Q. Selenium window scroll down the window page or scroll to view the particular element. 
		
		(JavaScriptExecutor(driver)).executeScript("Window.scrollBy(0,500)");
		
		(JavaScriptExecutor(driver)).executeScript("arguments[0].scrollToView();",element);
		
		Q. How to take a screenshot in Selenium WebDriver.
		
		   WebDriver driver = new FirefoxDriver();
		   driver.get("http://www.google.com");
		   // take the screenshot and it will store in cache memory
		   File scrfile = ((TakeScreenShot)driver).getScreenShotAs(OutputType.FILE);
		   try{
		        // save the scrfile from cache memory to external memory
		   		FileUtils.copyFile(scrfile,new File("d:\\screenshot.pmg");
		   }
		
		Q. How to set the size of browser window by using selenium.
		
		   driver.manage().window().maximize();
		   
		   //customise size
		    sysout.out.println(driver.manage().window().getSize());
		    Dimension d = new Dimension(500,600);
		    driver.manage().window().resize(d);
		    
		    // by using javascript
		     (JavaScriptExecutor)driver.executescript(window.resize(550,600))
		
		Q. How to select a value from dropdown. 
		
		    WebDriver driver = new FirefoxDriver();
		    
		    <Select id="myselect">
		    <option value ="option1">France</option>
		     <option value ="option1">Italy</option>
		      <option value ="option1">Spain</option>
		     </Select>
		     
		     WebElement we =driver.findElement(By.Id("myselect"));
		     Select dropdown = new select(we);
		     dropdown.SelectByIndex(2);
		     dropdown.SelectByValue("option3");
		     
		Q. How to switch new window
		   driver.switchTo().window("windowname");
		   driver.switchTo().frame("framename");
		   driver.swithchTo().alert
		   
		Q. How to fetch an attribute from an element?
		   how to retrieve typed text from a textbox?
		   
		    WebElement element = driver.findElement("login");
		    String lgndetails = element.getAttribute("classname");
		    
		    String logtext = element.GetText();
		    
		Q. enter a text without useing sendkeys.
		
		    JavaScriptExecutro jse = (JavaScriptExecutor)driver;
		    jse.executeScript("document.getElementById("login")").value = "test text without sendkeys";
		    
		Q. Explain how to find the broken links in an page. 
		
		    . hyderlinks an anchor tag.
		    . get value of  href for all the element in the page
		    - it will be available in elements.
		    - iterate the elements get the individual href and hit the url. 
		    - if returns status as 200 it is success else failure. 
		    
		    
		Q. What are the different type of frameworks. 
		
		    - DataDriven Frameworks
		    - Keyword driven framework
		    - Hybrid framework
		    - POM - Page Object Model - Design pattern
		    
		    Architecture
		    
		    - Test Management tool
		    - Automation Tool - selenium 
		    - Framework logical layer - hide the all the 
		       - Driver script - capable of calling all the methods
		       - Automation script
		       - Object Repository
		       
		   - DB Layer
		      - Test data
		      - global variable
		      
		   - Reported layer
		     - test reports
		     - error logs
		     - defect reports
		     - Exception email notification        
		     
		 Q. Selenium Web driver - web automation tool, that allow you to execute your tests 
		    against different browser
		    
		    Selenim IDE - It the simplest tool, it is firefox-add on , easy to record and play back.
		    
		    Selenium RC - older version of webDriver used to test web app UI
		    
		    Selenium GRID - Selenium suite that specialized on running multiple test across
		    different browser, OS and machines in parallel.
		    
		Q. Cross browser testing - yes I performed cross browser testing across IE,crome and safari
		   But while performing  cross browser testing in my automation framework. 
		   It was getting slower and data would not be going on the proper browser.
		   
		Q  Automation testing mainly focus on - regression, smoke, sanity and End to End testing
		
		Q. Have you created any framework? Which framework you have used?
		
		   Yes, I have created Data-Driven Framework , some of functionalities of hybrid framework
		   and page object model
		   
		Q  Can you explainframework architecture?
		
		   Automation Frame work
		   |
		   src|testng.xml|log4j.xml|build.xml|
		   
		   Src
		   |
		   AppModule |Common|Config|DataTable|Extent Report|ObjectRepository|Script|
		   TestListener|TestMethod|
		   
		 Q. Challenges you have faced while automation your app
		     Frequent changes in UI. It always need to make changes in code most of time
		     - Stuck somewhere while running automation script in chrome browser getting
		       errors that elements is not visible, element not found.
		     - Reused of test scripts.
		     
		 Q. Different kinds of exceptions 
		    - ElementNotSelectedException
		    - ElementNotVisisbleException
		    - NosuchAttributeException
		    - NoSuchFrameException
		    - TimeoutException
		    - Element not visible at this point.
		    - staleException
		    
		 Q. Window alert can not handle by using selenium But javascript/web based alert can handle
		    
		    Alert alert = driver.switchTo().alert();
		    alert.accept();
		    alert.dismiss();
		    alert.getTest();
		    alert.sendKeys();
		    
		Q   example
		
		    public class Sele{
		    
		    WebDriver driver = new FirefoxDriver();
		    
		    @test
		    public void Examp(){
		       driver.manage().window().maximize();
		       driver.get("www.google.com");
		      String st= driver.findElement(By.ID("123").getText();
		       
		       assert.assertEqual("UserId_sourcce", destination);
		       assert.assertEqual(actual, expected);
		    }   
		       
		    }
		 
		 Q. Handle multiple windows
		    driver.switchTo().window(Child_window);
		    driver.switchTo().frame(int arg0);
		     driver.switchTo().frame(Element);
		 
		 Q. Different locators  -- findElement is an API 
		 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	    
		    -  css performance is faster than xpath
		    -  CSS selectors behaves perfectly in IE and other browsers but Xpath sometimes
		       get changed in case of IE browser.
		       
		Q  how to check is enabled or selected            
		    driver.findElement(By.xpath("//xpath of element").isEnabled();
		    driver.findElement(By.xpath("//xpath of element").isSelected();
		    driver.findElement(By.xpath("//a[@class='nav-menu-links__link'and @href="/opinions"]")).isEnabled();
		    
		Q  Navigation commands.
		
		   driver.navigate().to(url);
		   driver.navigate().forward();
		   driver.navigate().back();
		   driver.navigate().refresh();
		
	    Q. Quit and close
	       driver.close  - closes the focus window 
	       driver.quit  - browser windows and ends webdrive session gracefully.
	       
	    Q  pageload timeout
	       driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);  
	       
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)
	       
	       WebDriverWait wait = new WebDriverWait(driver,10);
	       
	    Q   JavaScriptExecutor js = (JavascriptExecutor)driver;
	         js.executeScript
	         
	    Q  Take screen shot
	    
	      File scr = ((TakesScreensShot)driver).getScreenshotAS(OutputType.FILE);
	      FileUtils.copyFile(scr,new File("System.currentTimeMillis()+".png"));
	      
	    Q. resize window
	       WebDriver driver = new FirefoxDriver();
	       JavascriptExecutor jse = (JavaScriptExecutor)driver;
	       jse.executeScript("windows.scrollBy(0,250)")
	      
	    Q Challenges  with IE browser
	       - NoSuchWindowException   - can be avoid by doing some IE setting
	       - sendKeys works very slow - only it happend if you work window -64 bit
	       - unexpected error while launching IE.Protected mode must be set to the same value
	       - zoom level wase set to 0%
	       - Untrusted SSL certificate error in IE
	    
	    Q Handle proxy in selenium webdriver
	       when you try to access some secure applications you will get proxy issues.
	       Until we do not set proxy. 
	       - we can handle manually 
	       - we can chnage proxy setting using webdriver code
	       
	    Q Action class in selenium - to perform mouseOver, Keyboard events, DragAndDrop
	    
	    Q. Headless testing
	    
	    WebDriver driver = new HtmlUnitDriver();
	          
	    Q. How to download a file in Selenium
	    
	       FirefoxProfile profile new FirefoxProfile();
	       
	    Q. Automation Test life Cycle?
	       - Automation Feasibility analysis
	       - Test Plan/Test Design
	       - Environment Setup
	       - Test script development
	       - test script execution
	       - generate test result
	       
	    Q. Automation Test plan?
	       - scope
	       - Test strategy
	       - Resources
	       - Tools
	       - Schedule
	       - Environment
	       - Deliverables
	       - Risks
	       - Test data
	       - Reports/ results
	    
	    Q. How to read write excel file by using Apache POI
	    
	      HSSFWorkbook and XSSFWorkbook
	      HSSF : denotes the API is for working with Excel 2003 
	      XSSF: denotes the API is for working with Excel 2007
	      
	          
	    Q. How to improve the performance
	       By using the annotation , it will fetch the element from cache no need to get it from browser every time.
	       @CacheLookup
	       
	       @FindBy(xpath="//a[@data-navigation-id='23063']")
			@CacheLookup
			WebElement helplink;
			
		Q. different ways to use xpath locators 
		
		  driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")
		
			 //input[@type='submit' and @value='Login']
	 
	 links
	//a[text()='Help' and @class='tab prox-b']
	//a[contains(text(),'Features')]
	 //*[text()='Daily Face Cover (Pack of 10)' and @class='a-size-base-plus a-color-base a-text-normal']
	 
	 
	 Button
	//button[text()='Sign Up']
	 //button[contains(text(),'Sign Up')]
	//button[@type='button' and @class='btn']
	
	Div 
	//div[@class='input-group-btn']//input[@type='submit']
	//button[@id='xys']
	
	relative xcopy - inspecct- select attribute - right click - copy - copy xpath
	//*[@id="container"]/div[3]/div[1]/div/div/div/div/div[2]/ul/li[2]/a/img
	
	
	//a[text()='test2 test2']//parent::td[@class='className']//preceding-sibling::td[@class='classname']
	  //input[@name='conatact_id']

	 driver.findElement(By.xpath(" copy/paste xpath  ")).click();
	 
	 // Reading elemnts in datatable 
	
	 //a[contains(text(),'Bank of India')]/parent::*/following-sibling::td[3]
		 
/*
tr - table row
td - table data / table column

find the total number of row
List<WebElement> rows = driver.findElements(By.xpath("//table[@id='name']/tbody/tr"))

String beforexpath =" //*[@id='customers']/tbody/tr[";
String afterxpath = "]td[1]";

for(int i=1;i<rows;i++){
String actualxpath = beforexpath + afterxpath ;
WebElement element = driver.findElement(By.xpath(actualXpath));
System.out.println(element.getText());

}

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 
	 
	 Q.. Action class useage
		public Helppage helpLink(){
			Actions action = new Actions(driver);
			action.moveToElement(helplink).build().perform();
			helplink.click();
			return new Helppage();
		}
		
	Q),,	// drop down selection
		
		public void createContactTitle(String str){
			Select select = new Select(driver.findElement(By.name("title")));
			select.selectByVisibleText(str); // Mr. Mrs. Dr Miss etc.
		}
	          
	  Q...  WebDriver Fire Event
	  
	  Q. Selenium architecture 
	  
	  Selenium Client Library - JSSON Wire protocol over HTTP - brow Driver library - Real Browser 
	  
	  
	  cucumber annotations
	  --------------------
	  @RunWith(Cucumber.class)
@CucumberOptions(features="<path of feature file>", 
glue="<path of step defs class>",format = {"pretty", "html:target/Destination"})
		 
		 */
		
	}

}
