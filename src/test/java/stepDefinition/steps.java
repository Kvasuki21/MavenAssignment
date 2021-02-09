package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class steps {
	
	WebDriver driver;
		@Given("Give URL")
		public void give_url() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\KatakamVasuki\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		}

		@When("Entering username {string}")
		public void entering_username(String string) {
		    driver.findElement(By.id("login")).sendKeys(string);
		}
		@When("Entering password and click login {string}")
		public void entering_password_and_click_login(String string) {
		    driver.findElement(By.id("password")).sendKeys(string);
		    driver.findElement(By.id("form-login_submitAuth")).click();
		}
		@Then("Verify the mail {string}")
		public void verify_the_mail(String string) {
		    driver.findElement(By.className("dropdown-toggle")).click();
		    String str1=driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p")).getText();
		    System.out.print(str1);
		    driver.close();
		}


		
		@When("Do login {string} {string}")
		public void do_login(String string, String string2) throws InterruptedException {
			driver.findElement(By.id("login")).sendKeys(string);
			driver.findElement(By.id("password")).sendKeys(string2);
		    driver.findElement(By.id("form-login_submitAuth")).click();
		    Thread.sleep(3000);
		}


		
		@When("Go to inbox and click on compose")
		public void go_to_inbox_and_click_on_compose() throws InterruptedException {
			driver.findElement(By.className("dropdown-toggle")).click();
			driver.findElement(By.linkText("Inbox")).click();
			driver.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/a[1]/img")).click();
			Thread.sleep(10000);
		}

		@When("Type message")
		public void type_message() throws InterruptedException {
			driver.findElement(By.className("select2-search__field")).sendKeys("Test1");
			Thread.sleep(2000);
			driver.findElements(By.className("select2-results__option")).get(2).click();
			Thread.sleep(200);
			//driver.findElement(By.cssSelector("a['href=http://elearningm1.upskills.in/main/messages/new_message.php']")).click();
			driver.findElement(By.id("compose_message_title")).sendKeys("Test send message");
			Thread.sleep(200);
			Thread.sleep(2000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("/html/body")).sendKeys("Hi, Im composing message");
			Thread.sleep(200);
			////*[@id="cke_1_contents"]/iframe 
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("/html/body")).sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
			Thread.sleep(10000);
			//driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ENTER);
			
//			WebElement fileInput = driver.findElement(By.xpath(""));
//			fileInput.sendKeys("C:/Users/KatakamVasuki/Desktop/Upload doc.docx");
			
			//driver.findElement(By.name("attach_1")).sendKeys(Keys.TAB);
//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,-250)");
//			
//			driver.findElement(By.linkText("Personal data")).click();
//			driver.findElement(By.id("file-descrtiption")).sendKeys("Desc adding");
//			String descrd=driver.findElement(By.id("file-descrtiption")).getText();
//			System.out.print("DESC=="+descrd);
//			
//			driver.findElement(By.id("file-descrtiption")).sendKeys(Keys.TAB);
//			WebElement sendmessage = driver.findElement(By.xpath("//button[contains(text(),'Send message')]"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sendmessage);
//			Thread.sleep(500); 
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("compose_message_compose")));
			
			
//			((JavascriptExecutor) driver)
//		     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			//driver.findElement(By.cssSelector("compose_message > fieldset > div:nth-child(7)")).click();
//			driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
//			System.out.print("After xpath");
			//driver.findElement(By.xpath("//button[@id='compose_message_compose']")).click();
			//driver.findElement(By.name("compose")).click();
			//driver.findElement(By.className("fa fa-paper-plane")).click();
		}
		@SuppressWarnings("deprecation")
		@Then("Verify message")
		public void verify_message() {
			String alert1=driver.findElement(By.xpath("//*[@id='cm-content']/div/div[2]/div/div[1]")).getText();
			System.out.print(alert1);
			String alertmsg="The message has been sent to fn ln (test12)";
			Assert.assertEquals(alert1, alertmsg);
//			String alert=driver.findElement(By.className("alert alert-success")).getText();
//			System.out.print(alert);
			driver.close();
			   
		}



	






		
		




}
