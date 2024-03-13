@Suite @ShoppingCart
Feature: CP02 - Validar carrito de compras

  Background: Realizar las respectivas validaciones en el carrito de compras

    Given El usuario navega en el sitio web

  @ShoppingCartList
  Scenario Outline: 1 - Añadir un producto específico al carrito

    When el usuario selecciona la categoria "<categoria>"
    And el usuario selecciona el producto "<producto>"
    And el usuario añade el producto al carrito
    When realiza el usuario realiza ek proceso de compra completo
    Then El sistema debera procesar la compra

    Examples:
      | categoria | producto         |
      | Phones    | Samsung          |
      | Phones    | Nokia lumia 1520 |
      | Laptops   | Sony             |
      | Laptops   | Dell i7 8gb      |
      | Monitors  | Apple monitor 24 |

