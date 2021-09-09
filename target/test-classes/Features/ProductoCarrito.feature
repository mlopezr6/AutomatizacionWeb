Feature: Como comprador requiero un producto de STORE

  Background: 
    Given Inicio de sesion en la aplicacion STORE
    When se loguea para una compra

 @Categoria
  Scenario: Agregar un producto de Categoria 
  When Selecciona opcion Categoria
  Then haga clic en Categoria Laptop
	And selecciona el producto para detalle
  
    
    
