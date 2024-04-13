@Suite @Login
Feature: CP01 - Validar creacion de usuario

  Background: Validar el inicio de sesion con credenciales validadas e invalidas
    Given El usuario navega en el sitio web


  @RegisterUser
  Scenario Outline: 1- Registrar un nuevo usuario
    And el usuario selecciona la opcion Sign Up
    When el usuario ingresa el "<User>" y "<PassWord>"
    Then Podra registrarse correctamente

    Examples:
      | User      | PassWord  |
      | Pruebas50 | 123456789 |

  @ValidCredentials
  Scenario: 2 - Validar que el usuario se pueda logear con credenciales correctas
    When El usuario ingresa credenciales validas
    Then La aplicacion debera mostrar el home del aplicativo con el usuario logeado

