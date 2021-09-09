
package com.AltaUsuario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Usuario {
	
	WebDriver driver ;

	@Before
	public void before2() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
	}
	
	@Given("estoy en la aplicacion STORE")
	public void estoy_en_la_aplicacion_STORE()  {
		
		System.out.println("driver.getTitle()" + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contentEquals("STORE"));
		//driver.navigate().to("https://www.demoblaze.com/index.html");
		
	}

	@When("hago click en el enlace SignUp")
	public void hago_clic_en_el_enlace_Sign_Up() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#signin2")).click();
		Thread.sleep(1500);
		
		
			
	}
	
	@Then("muestra ventana de registro")
	public void muestra_ventana_de_registro() throws InterruptedException {
	
		driver.findElement(By.id("sign-username")).sendKeys("Sofia8");
		Thread.sleep(1500);
		driver.findElement(By.id("sign-password")).sendKeys("prueba");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
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
