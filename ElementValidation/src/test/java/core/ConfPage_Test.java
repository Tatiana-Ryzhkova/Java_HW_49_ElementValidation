package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ConfPage_Test {
	  
	static WebDriver driver = new FirefoxDriver();
	static String URL = "http://learn2test.net/qa/apps/sign_up/v1/conformation.php";
	
	
	
	@BeforeClass
	public static void beforeClass(){ 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void afterClass() {  
		driver.quit();
	}
	
	@Test
  public void test_01_Page_Title_Confirmation() {
		driver.get(URL);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();

		 //TEST ID
		 System.out.println("CONFIRMATION PAGE");
		 System.out.println(">>> TEST 01 Page Title (Confirmation) >>>");
		 
		// IS PRESENT
		 boolean QuoteisPresent = driver.findElements(By.id("id_f_title")).size() > 0;
		 System.out.println("isPresent? " + QuoteisPresent);
		 
		// IS VISIBLE
		 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_title")).isDisplayed();
		 System.out.println("isDisplayed? " + QuoteisDisplayed);
		 
		 // IS ENABLED
		 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_title")).isEnabled();
		 System.out.println("isEnabled? " + QuoteisEnabled);
		 
		// LOCATION
		 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_title")).getLocation();
		 System.out.println("Location X: " + QuoteLocation.getX());
		 System.out.println("Location Y: " + QuoteLocation.getY());
		 
		// SIZE
		 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_title")).getSize();
		 System.out.println("Size Width: " + QuoteSize.getWidth());
		 System.out.println("Size Height: " + QuoteSize.getHeight());
	}
	@Test
	  public void test_02_Label_First_Name() {
			
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 02 Label (First Name) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_fname_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_fname_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_fname_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_fname_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_fname_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_03_Field_First_Name() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 03 Field (First Name) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_fname_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_fname_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_fname_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_fname_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_fname_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_04_Label_Last_Name() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 04  Label (Last Name) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_f_label_ln_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_label_ln_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_label_ln_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_label_ln_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_label_ln_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_05_Field_Last_Name() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 05 Field (Last Name) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_lname_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_lname_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_lname_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_lname_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_lname_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_06_Label_Email_Address() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 06  Label (Email Address) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_f_label_email_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_label_email_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_label_email_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_label_email_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_label_email_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_07_Field_Email_Address() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 07 Field (Email Address) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_email_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_email_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_email_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_email_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_email_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_08_Label_Phone_Number() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 08  Label (Phone Number) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_f_label_phone_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_label_phone_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_label_phone_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_label_phone_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_label_phone_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_09_Field_Phone_Number() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 09 Field (Phone Number) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_phone_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_phone_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_phone_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_phone_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_phone_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_10_Label_Gender() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 10  Label (Gender) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_f_label_gender_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_label_gender_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_label_gender_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_label_gender_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_label_gender_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_11_Field_Gender() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 11 Field (Gender) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_gender_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_gender_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_gender_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_gender_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_gender_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_12_Label_State() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 12  Label (State) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_f_label_state_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_label_state_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_label_state_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_label_state_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_label_state_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_13_Field_State() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 13 Field (State) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_state_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_state_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_state_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_state_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_state_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_14_Label_Terms() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 14  Label (Terms?) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_f_label_terms_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_f_label_terms_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_f_label_terms_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_f_label_terms_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_f_label_terms_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_15_Field_Terms() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 09 Field (Terms) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_terms_conf")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_terms_conf")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_terms_conf")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_terms_conf")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_terms_conf")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_16_Button_Back() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 16 Button (Back) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("id_back_button")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("id_back_button")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("id_back_button")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("id_back_button")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("id_back_button")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
		}
	@Test
	  public void test_17_Dynamic_Text_Copyright() {
			 
			 //TEST ID
			 System.out.println(" ");
			 System.out.println(">>> TEST 17 Dynamic Text (Copyright) >>>");
			 
			// IS PRESENT
			 boolean QuoteisPresent = driver.findElements(By.id("copyright")).size() > 0;
			 System.out.println("isPresent? " + QuoteisPresent);
			 
			// IS VISIBLE
			 boolean  QuoteisDisplayed =  driver.findElement(By.id("copyright")).isDisplayed();
			 System.out.println("isDisplayed? " + QuoteisDisplayed);
			 
			 // IS ENABLED
			 boolean  QuoteisEnabled =  driver.findElement(By.id("copyright")).isEnabled();
			 System.out.println("isEnabled? " + QuoteisEnabled);
			 
			// LOCATION
			 org.openqa.selenium.Point QuoteLocation = driver.findElement(By.id("copyright")).getLocation();
			 System.out.println("Location X: " + QuoteLocation.getX());
			 System.out.println("Location Y: " + QuoteLocation.getY());
			 
			// SIZE
			 org.openqa.selenium.Dimension QuoteSize = driver.findElement(By.id("copyright")).getSize();
			 System.out.println("Size Width: " + QuoteSize.getWidth());
			 System.out.println("Size Height: " + QuoteSize.getHeight());
			 System.out.println(" ");
			 System.out.println("CONFIRMATION PAGE ");

		}
}