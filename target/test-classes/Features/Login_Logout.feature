
Feature: Accesos de Usuario
  I want to use this template for my feature file

@Login_Logout
  Scenario: Verificar acceso a la plataforma STORE
    Given Estoy en la aplicacion STORE
    When Inicie sesion en la aplicacion
   	Then Verificar Welcome Usuario
   	And Finaliza sesion de Usuario
   	
 
		
 