

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowser {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver d =new EdgeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


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
