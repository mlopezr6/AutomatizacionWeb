package com.cucumber1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {

	WebDriver driver;
	
	@Before
	public void beforeScenary() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		
	}
	
//Login
	@Given("Estoy en la aplicacion STORE")
	public void cuando_este_en_la_aplicacion_Store()  {
		
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
	}

	@When("Inicie sesion en la aplicacion")
	public void inicie_sesion_en_la_aplicacion() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#login2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("Raquel");
		Thread.sleep(1500);
		driver.findElement(By.id("loginpassword")).sendKeys("prueba");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Thread.sleep(3000);
		
			
	}

	@Then("Verificar Welcome Usuario")
	public void Verificar_Welcome_Usuario() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("driver.getTitle()" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contentEquals("STORE"));
		Thread.sleep(1000);
		WebElement Welcome = driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[7]/a"));
		System.out.println("Welcome.isEnabled(): " + Welcome.isEnabled());
		Assert.assertTrue(Welcome.isEnabled());
		
		
			
	}

	@And ("Finaliza sesion de Usuario")
	public void Finaliza_sesion_de_Usuario() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[6]/a")).click();
		Thread.sleep(1000);
	}
	
	
	
	@After
	public void afterScenary1() {
		try {
			driver.close();
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
