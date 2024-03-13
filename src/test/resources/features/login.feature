@Suite @Login
Feature: CP01 - Validar creacion de usuario

  Background: Validar el inicio de sesion con credenciales validadas e invalidas
    Given El usuario navega en el sitio web

  @ValidCredentials
  Scenario: 1 - Validar que el usuario se pueda logear con credenciales correctas
    When El usuario ingresa credenciales validas
    Then La aplicacion debera mostrar el home del aplicativo con el usuario logeado

