package com.cucumber3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;


public class SmokeTest_RegresionSteps {

	WebDriver driver;

	
	@Before
	public void before3() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS );
	}
	
	
	@Given("Inicio de sesion en la aplicacion Orange")
	public void Inicio_de_sesion_en_la_aplicacion_Orange() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).submit();
		Thread.sleep(1500);
	}

	@When("Cuando se muestre el dashboard")
	public void Cuando_se_muestre_el_dashboard() {
		WebElement dashboard = driver.findElement(By.cssSelector("#menu_dashboard_index"));
		dashboard.click();		
	}
//Escenario1
	@Then("Selecciona opcion menu Admin")
	public void Selecciona_opcion_menu_Admin()throws InterruptedException {
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule > b")).click();
		Thread.sleep(2000);
		
	}

	@And("haga clic en User Management")
	public void haga_clic_en_User_Management() throws InterruptedException {
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		Thread.sleep(2000);
	}
	
	@And("Ingresar Nombre Usuario")
	public void Ingresar_Nombre_Usuario() throws InterruptedException {
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("David.Morris");
		Thread.sleep(2000);
	}

	 @And ("Ingresar Nombre Empleado")
	 public void Ingresar_Nombre_Empleado() throws InterruptedException {
			driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("David Morris");
			Thread.sleep(2000);
		}
	 
	 @Then("Selecciona opcion Search Empleado")
		public void Selecciona_opcion_Search_Empleado() throws InterruptedException{
			WebElement btnSearch = driver.findElement(By.id("searchBtn"));
			Thread.sleep(1000);
			btnSearch.click();
			Thread.sleep(2000);
	 }
	 
	 //Escenario 2:
	 
	 @Then("Selecciona opcion PIM")
		public void Selecciona_opcion_PIM()throws InterruptedException {
			driver.findElement(By.cssSelector("#menu_pim_viewPimModule")).click();
			Thread.sleep(2000);
			
		}
	 @And("haga clic en Employee List")
		public void haga_clic_en_Employee_List() throws InterruptedException {
			driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
			Thread.sleep(2000);
		}
	 @And("Ingresar Empleado List")
		public void Ingresar_Empleado_List() throws InterruptedException {
		 driver.findElement(By.cssSelector("#empsearch_employee_name_empName")).sendKeys("Maria Lopez");
			Thread.sleep(2000);
		}
	 @And("Ingresar ID")
		public void Ingresar_ID() throws InterruptedException {
		 driver.findElement(By.id("empsearch_id")).sendKeys("70988095");
			Thread.sleep(2000);
		}
	 @And("Ingresar Nombre Supervisor")
		public void Ingresar_Nombre_Supervisor() throws InterruptedException {
		 driver.findElement(By.id("empsearch_supervisor_name")).sendKeys("John Smith");
			Thread.sleep(2000);
		}
	 
	 @And("Selecciona opcion Add Empleado")
		public void Selecciona_opcion_Add_Empleado() throws InterruptedException{
			WebElement btnAdd = driver.findElement(By.id("btnAdd"));
			Thread.sleep(1000);
			btnAdd.click();
			Thread.sleep(2000);
	 } 
//Escenario 2.1
	 @And("Ingresar First Name")
		public void Ingresar_First_Name() throws InterruptedException {
		 driver.findElement(By.id("firstName")).sendKeys("Maria");
			Thread.sleep(2000);
		}
	 @And("Ingresar Middle Name")
		public void Ingresar_Middle_Name() throws InterruptedException {
		 driver.findElement(By.id("middleName")).sendKeys("Raquel");
			Thread.sleep(2000);
		}
	 @And("Ingresar Last Name")
		public void Ingresar_Last_Name() throws InterruptedException {
		 driver.findElement(By.id("lastName")).sendKeys("Lopez");
			Thread.sleep(2000);
		}
	
	 @Then("Selecciona opcion Guardar Empleado")
		public void  Selecciona_opcion_Guardar_Empleado() throws InterruptedException{
			WebElement btnSave = driver.findElement(By.id("btnSave"));
			Thread.sleep(1000);
			btnSave.click();
			Thread.sleep(2000);
	 } 	
	 
	 //Escenario 3
	 @Then("Selecciona opcion Time")
		public void Selecciona_opcion_Time()throws InterruptedException {
			driver.findElement(By.cssSelector("#menu_time_viewTimeModule")).click();
			Thread.sleep(2000);
	 }
	 
	/* @And("haga clic en Timesheets")
		public void haga_clic_en_Timesheets() throws InterruptedException {
			driver.findElement(By.id("menu_time_Timesheets")).click();
			Thread.sleep(2000);
	 }*/
	 
	 @And("Ingresar Empleado registrado")
		public void Ingresar_Empleado_registrado() throws InterruptedException {
		 driver.findElement(By.id("employee")).clear();
		 driver.findElement(By.id("employee")).sendKeys("Maria Raquel Lopez");
			Thread.sleep(2000);
		}
	 @And("Seleccionar View")
		public void Seleccionar_View() throws InterruptedException{
			WebElement btnView = driver.findElement(By.id("btnView"));
			Thread.sleep(1000);
			btnView.click();
			Thread.sleep(2000);
	 }  
	 
		@And("Editar TimeSheet")
		public void Editar_TimeSheet() throws InterruptedException{
			WebElement btnEdit = driver.findElement(By.id("btnAddTimesheet"));
			Thread.sleep(1000);
			btnEdit.click();
			Thread.sleep(2000);
	 } 
		
		
			
		 //Escenario 4
		 @Then("Seleccionar Directory")
			public void Seleccionar_Directory()throws InterruptedException {
				driver.findElement(By.cssSelector("#menu_directory_viewDirectory")).click();
				Thread.sleep(2000);
				
			}
		 @And("Ingresar Name Empleado")
			public void Ingresar_Name_Empleado() throws InterruptedException {
			 driver.findElement(By.id("searchDirectory_emp_name_empName")).sendKeys("Maria Raquel Lopez");
			Thread.sleep(2000);
			}
		 @Then("Selecciona Search Directory")
			public void Selecciona_Search_Directory() throws InterruptedException{
				WebElement btnSearch = driver.findElement(By.id("searchBtn"));
				Thread.sleep(1000);
				btnSearch.click();
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
