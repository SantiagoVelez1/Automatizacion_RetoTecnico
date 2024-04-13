@Suite @Login
Feature: CP01 - Validar creacion de usuario

  Background: Validar el inicio de sesion con credenciales validadas e invalidas
    Given El usuario navega en el sitio web


  @RegisterUser
  Scenario Outline: 1- Registrar un nuevo usuario
    And el usuario selecciona la opcion Sign Up
    When el usuario ingresa el usuario "<user>" y la contraseña "<password>"
    Then la aplicacion debera volver al inicio con el nuevo registro

    Examples:
      | user      | password  |
      | Pruebas50 | 123456786 |

  @ValidCredentials
  Scenario: 2 - Validar que el usuario se pueda logear con credenciales correctas
    When El usuario ingresa credenciales validas en la opcion Login
    Then La aplicacion debera mostrar el home del aplicativo con el usuario logeado

