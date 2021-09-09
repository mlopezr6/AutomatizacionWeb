Feature: Como Administrador deberia ingresar a la plataforma de RRHH Orange con mi usuario y contrasena
  y tener acceso a la opcion Directory y poder realizar busquedas con diferentes criterios.

  Background: 
    Given Inicio de sesion en la aplicacion Orange
    When Cuando se muestre el dashboard

 @SmokeTest-E1
  Scenario: Realizar la búsqueda del Usuario del Empleado
  Then Selecciona opcion menu Admin
    And haga clic en User Management
    And Ingresar Nombre Usuario
    And Ingresar Nombre Empleado
    Then Selecciona opcion Search Empleado
    
 @Regresion-E2
Scenario: Verificar que permita Add un nuevo empleado y registrarlo
Then Selecciona opcion PIM
    And haga clic en Employee List
    And Ingresar Empleado List
    And Ingresar ID
    And Ingresar Nombre Supervisor
    And Selecciona opcion Add Empleado
    And Ingresar First Name
    And Ingresar Middle Name
    And Ingresar Last Name
    Then Selecciona opcion Guardar Empleado
    
@Regresion-E3
Scenario: Visualizar empleado registrado
Then Selecciona opcion Time
And Ingresar Empleado registrado
And Seleccionar View
And Seleccionar AddTimeSheet
And Editar TimeSheet
And Ingresar Proyecto
And Seleccionar Actividad

@Regresion-E4
Scenario: Buscar Directorio Empleado
Then Seleccionar Directory
And Ingresar Name Empleado
 Then Selecciona Search Directory



