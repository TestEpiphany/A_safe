import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class A_safe_WebPage {
	
	 String[] contacts = {"Emma@gmail.com","07986466423","Delelel","EpiphanyCompany",
	    		"Lorem Ipsum is simply dummy typesetting ", "Emmanuel","TesterTester"};   
        
	WebDriver driver;	
		
		@Before
		public void A_SafeURL(){
			System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.navigate().to("https://www.asafe.com/en-gb/");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();

	}
		@After
		public void xx() {
		driver.close();
		
		}

		
		@Test
		public void A_Safe_Logo_LandingPage() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/div/a/img")).click(); //Logo
		
		
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div[1]/div/div[4]/a[1]/div/p")).click(); //Enquire Now
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/section[1]/div[1]/div/div[4]/a[2]/div/p")).click(); //Products
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[1]/div/div/div[2]/a/div/p")).click(); //Our Clients
		driver.navigate().back();
		}
		
		@Test
		public void Why_ASafe_HomePage() {			
		driver.findElement(By.xpath("//a[@href ='https://www.asafe.com/en-gb/why-a-safe/']")).click(); //
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/a[1]/div/p")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div/div/a[2]/div/p")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/section[6]/div/div[2]/div/div/div/div[4]/a/div/p")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[1]/section[7]/div[2]/div/div[2]/a/div/p")).click();
		driver.navigate().back();
		}
		
		@Test
		public void Industry_Solutions() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[2]/a")).click(); //
		
		
		driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div[2]/div[2]/div/a[1]/div/div[2]/div/div[1]/p")).click(); 
		driver.navigate().back();
		}
		
		@Test
		public void ProductsPage() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[3]/a")).click(); //
		
//		Select select = new Select(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[3]/a")));
//		select.deselectByIndex(arg0);
		}
		
		@Test
		public void ServicesPage() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[4]/a")).click(); //
		String textP = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[4]/a")).getText();
		System.out.println(textP);
		
		String title = driver.getTitle();
		System.out.println(title);
		String services = driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div/div/h1/p")).getText();
		System.out.println(services);
	    System.out.println(driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div[2]/div/div/h1/p")).isDisplayed());
		}
		
		@Test
		public void Resources() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[5]/a")).click(); //
		String title = driver.getTitle();
		System.out.println(title);
		}
		
		@Test
		public void Code_Of_Practice() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[6]/a")).click(); //
		String title = driver.getTitle();
		System.out.println(title);
		}
		
		@Ignore //Test
		public void Contact_Page() {			
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div/ul/li[7]/a")).click(); //
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"f6718dda-0e45-48f9-bf8f-ecfe8a500a9e\"]")).sendKeys(contacts[2]);
		driver.findElement(By.xpath("//*[@id=\"41a3ec9d-738c-4f6d-848e-68f20866e63c\"]")).sendKeys(contacts[5]);
		driver.findElement(By.xpath("//*[@id=\"c9204231-7756-4e10-cb50-60870fb4bb73\"]")).sendKeys(contacts[0]);
		driver.findElement(By.xpath("//*[@id=\"1e714552-8fc8-4dd2-b9ca-1999542ddf89\"]")).sendKeys(contacts[1]);
		driver.findElement(By.xpath("//*[@id=\"d69e4ea5-4957-4b27-f572-cae872e2dc75\"]")).sendKeys(contacts[4]);
		WebElement click = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[2]/div/form/div/div[2]/div/div/input"));
		click.click();
		}

}
