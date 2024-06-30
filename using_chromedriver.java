package hello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class UsingChrome {
    public static void main(String[] args) {
        // Set the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the Chrome driver
        
        WebDriver d =new ChromeDriver();
    	d.manage().window().maximize();
    	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


    	// Enter value and click
    	d.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
    	d.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
    	d.findElement(By.xpath("//button[@type='submit']")).click();


    	String act=d.getTitle();
    	String exp="OrangeHRM";
    	System.out.println("Actual title" +act);
    	System.out.println("Expected title"+ exp);
    	if(exp.equals(act)) {
    		System.out.println("Test Successful"+ exp);
    	}
    		
    	else {
	System.out.println("Test not Successful ");


		}
	d.close();
	
    		}
    	}
    


