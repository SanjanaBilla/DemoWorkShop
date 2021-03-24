package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class BookDemoShop {
	
	WebDriver driver;
	

	
	@Given("User logs into the site")
	public void user_logs_into_the_site() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}

	@Then("User clicks login button and Signin message is displayed")
	public void user_clicks_login_button_and_Signin_message_is_displayed() {
		
driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		String expectedMessage="Welcome, Please Sign In!";
		
				String ActualMessage= driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]")).getText();
			Assert.assertEquals(ActualMessage,expectedMessage);
			
			//System.out.println("Message validation Successful");
		
	}

	@Then("login with \"(.*)\" and \"(.*)\" credentials")
	public void login_with_the_user_credentials(String Username, String Password) {
		driver.findElement(By.id("Email")).sendKeys(Username);
		
		driver.findElement(By.id("Password")).sendKeys(Password);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String Actualuser= driver.findElement(By.className("account")).getText();
		String ExpectedUser= Username;
		Assert.assertEquals(ExpectedUser, Actualuser);
		
			
			
		}
	
	@Then ("Clear the shopping cart")
	public void Clear_the_shopping_cart () {
		
		driver.navigate().refresh();
		
		driver.findElement(By.className("cart-qty")).click();
		
		List<WebElement> checklist= driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement ele: checklist){
			
			ele.click();
		}
		
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		
	}
		
	@Then ("Select Books from Categories and select a book from the list")
	public void Select_Books_from_Categories_and_select_book_from_list () {
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		driver.findElement(By.xpath("//img[@title='Show details for Computing and Internet']")).click();
		
		// Get the price of the book
		
		String BookPrice= driver.findElement(By.className("price-value-13")).getText();
		System.out.println("Price of the Book:"+BookPrice);
		
		//Enter Quantity and click on Add to cart
		WebElement Quantity= driver.findElement(By.xpath("//*[@data-val-number='The field Qty must be a number.']"));
		Quantity.clear();
		Quantity.sendKeys("2");
		driver.findElement(By.id("add-to-cart-button-13")).click();
		
		
			
			
		
	}

	
	@Then ("Get the total price of the order and checkout")
	public void Get_the_total_price_of_order_and_checkout() {
		
		driver.findElement(By.className("cart-label")).click();
		//System.out.println("item added to cart");
		String Total= driver.findElement(By.xpath("//span[@class='product-price']")).getText();
		System.out.println("Total amount to be paid:"+Total);
		
		// Agree to the terms and conditions and checkout
		
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
	}
	
	@Then("Select country from the dropdown")
	public void Select_country_from_the_dropdown() {
		
		WebElement Countrydd= driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select sel=new Select(Countrydd);
		sel.selectByVisibleText("India");
		
		
	}
	
	@Then("Enter \"(.*)\" \"(.*)\" \"(.*)\" and \"(.*)\" values")
	public void fill_City_Address1_Zip_PhoneNumber_values(String City,String Address1, String Zip, String PhoneNumber ) {
		
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys(City);
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(Address1);
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(Zip);
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(PhoneNumber);
		
		driver.findElement(By.xpath("//input[@onclick='Billing.save()'] ")).click();
		
		
	}
	
	@Then ("click on Continue in Shipping Address column")
	public void click_on_Continue_in_Shipping_Address_column() {
		
		System.out.println("Items added to cart");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()'] "))).click();
		
		
		
	
	}
	
	@Then ("Select the shipping method as Next Day Air and click on Continue")
	public void Select_the_shipping_method_as_Next_Day_Air_and_click_on_Continue(){
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='checkout-shipping-method-load']/div/div/ul/li[2]/div[1]/label"))).click();
		
		
		
		//driver.findElement(By.xpath("//*[@id='checkout-shipping-method-load']/div/div/ul/li[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
		
		//Click continue on COD mode
		
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@onclick='PaymentMethod.save()']"))).click();
		
		WebDriverWait wa=new WebDriverWait(driver,10);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()']"))).click();
		
		//driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
		
		
	}
	
	@Then ("click on Confirm order and get the details")
	public void click_on_Confirm_order_and_get_details() {
		
		WebDriverWait wa=new WebDriverWait(driver,10);
		wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()']"))).click();
		
		//String OrderNumber=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")).getText();
		
		//System.out.println(OrderNumber);
		
	}
		
		@Then("Logout from the application")
		public void Logout_from_application() {
			WebDriverWait wa=new WebDriverWait(driver,10);
			wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-2 order-completed-continue-button']"))).click();
			
		driver.findElement(By.xpath("//a[contains(text(), 'Log out')]")).click();
		
		
	}
	
		
		

	
	}


	
		
		
		
	


