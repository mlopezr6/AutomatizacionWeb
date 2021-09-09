package com.cucumber3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class Sesion_Producto_Carrito {

	WebDriver driver;

	
	@Before
	public void before3() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );
	}
	
	
	@Given("Inicio de sesion en la aplicacion STORE")
	public void Inicio_de_sesion_en_la_aplicacion_STORE() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.demoblaze.com/index.html");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("Raquel");
		Thread.sleep(1500);
		driver.findElement(By.id("loginpassword")).sendKeys("prueba");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
		Thread.sleep(3000);
	}

	@When("se loguea para una compra")
	public void se_loguea_para_una_compra() {
		WebElement dashboard = driver.findElement(By.cssSelector("#nameofuser"));
		dashboard.click();		
	}
	//Escenario de Agregar Categoria
	@When("Selecciona opcion Categoria")
	public void Selecciona_opcion_Categoria()throws InterruptedException {
		WebElement categoria = driver.findElement(By.cssSelector("#cat"));
		categoria.click();	
		
	}

	@Then("haga clic en Categoria Laptop")
	public void haga_clic_en_Categoria_Laptop() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[3]")).click();
		Thread.sleep(3000);
	}
	
	@And("selecciona el producto para detalle")
	public void Selecciona_el_producto_para_detalle() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/a/img")).click();
		Thread.sleep(2000);
	}

	
/*	@And("Selecciona Add to cart")
	public void Selecciona_Add_to_cart() throws InterruptedException {
		driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).submit();
		Thread.sleep(1500);
	}*/

	 
	 
	 //Carrito
	 
	 @When("Selecciona opcion Cart")
		public void Selecciona_opcion_Cart()throws InterruptedException {
			driver.findElement(By.cssSelector("#menu_pim_viewPimModule")).click();
			Thread.sleep(2000);
			
		}
	 @Then("Verificar producto agregado")
		public void Verificar_producto_agregado() throws InterruptedException {
			driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
			Thread.sleep(2000);
		}
	 @And("Verificar el texto del producto")
		public void Verificar_el_texto_del_producto() throws InterruptedException {
		 driver.findElement(By.cssSelector("#empsearch_employee_name_empName")).sendKeys("Maria Lopez");
			Thread.sleep(2000);
		}
	 
		
	@After
	public void afterScenary3() {
		try {
			driver.close();
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
