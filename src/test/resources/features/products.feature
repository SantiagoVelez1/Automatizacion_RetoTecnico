@Suite @ShoppingCart
Feature: CP02 - Validar carrito de compras
  Background: Realizar las respectivas validaciones en el carrito de compras
    Given El usuario navega en el sitio web
    When El usuario ingresa credenciales validas

    @ShoppingCartList
    Scenario Outline: 1 - Listar los productos en el carrito
      And selecciona una "<categoria>"
      And selecciona un "<producto>"
      And da click en la opcion cart
      Then el sistema debera listar los productos agregados en el carrito
      Examples:
        | categoria | producto |
        |phones | samsumg, sony, nokia, iphone|
        |laptops | mac|
        | monitors | apple, asus  |


  @ShoppingCartEmpty
      Scenario: 2 - Cuando el carrito este vacio de productos, no procesar la compra
        And da click en la opcion de "cart"
        Then El sistema debera mostrar la cesta sin productos

        @ShoppingCartProcces
        Scenario: 3 - Cuando se realice la compra, se mostrara un mensaje de compra
          And Agrega productos al carrito de compras
          And da click en la opcion cart
          When completa todo el resgistro de productos
          Then El sistema debera procesar la compra

