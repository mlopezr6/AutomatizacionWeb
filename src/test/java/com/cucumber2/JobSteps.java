package com.cucumber2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class JobSteps {

	WebDriver driver ;

	
	@Before
	public void before2() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
	}

	@Given("He iniciado sesion en la aplicacion Orange")
	public void he_iniciado_sesion_en_la_aplicacion_Orange() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).submit();
		Thread.sleep(1500);
	}

	@When("Cuando hago clic en el enlace administrador")
	public void cuando_hago_clic_en_el_enlace_administrador() {
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
	}

	@And("Haga clic en Job")
	public void haga_clic_en_job() {
		driver.findElement(By.cssSelector("#menu_admin_Job")).click();;
		
	}

	@And("Validar texto")
	public void validar_texto() throws InterruptedException {
		WebElement jobtexto = driver.findElement(By.id("menu_admin_viewJobTitleList"));
		System.out.println(jobtexto.getText());
		Thread.sleep(2000);
	}

	@Then("Titulo del Job")
	public void titulo_del_job() throws InterruptedException {		
		WebElement titulo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/ul/li[2]/a"));
		 Assert.assertEquals(titulo.getText(),"Job");	
		 Thread.sleep(2000);
	}
	
	
	@After
	public void afterbefore2() {
		try {
			driver.close();
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
