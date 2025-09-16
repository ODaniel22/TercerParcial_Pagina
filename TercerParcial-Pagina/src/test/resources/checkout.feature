Feature: Checkout feature

  Background: User should be logged
    Given Estamos en la pagina de saucedemo
    When colocamos el nombre del Usuario "standard_user"
    And Colocamos la contraseña "secret_sauce"
    And Hacemos click en el boton de Login

    ##Test de checkout con productos
  Scenario: User can checkout a purchase
    Given Verificamos si la pagina esta habilitada o no
    And Agregamos el productos "Sauce Labs Backpack" al carrito
    And Agregamos el productos "Sauce Labs Backpack" al carrito
    And Hacemos click al icono del carrito
    When Realizo click en checkout
    And LLenamos la informacion para el checkout
      | Oscar Daniel | Vargas Sirpa | 1923 |
    And Hago click en el boton de continuar
    When Hacemos Click en el boton Finish
    Then Mensaje que dice "Thank you for your order!" mostrando habilitacion

    ##Test de checkout sin productos
  Scenario: User cannot checkout an empty purchase
    Given Verificamos si la pagina esta habilitada o no
    And Hacemos click al icono del carrito
    When Realizo click en checkout
    And LLenamos la informacion para el checkout
      | Oscar Daniel | Vargas Sirpa | 1923 |
    And Hago click en el boton de continuar
    When Hacemos Click en el boton Finish
    Then Mensaje que dice "Thank you for your order!" mostrando habilitacion
    Then Si llegas aqui la prueba fallo

    ##Revisamos si ocontrola el no tener datos para el checkout
  Scenario: Checkout a purchase without any information
    Given Verificamos si la pagina esta habilitada o no
    And Agregamos el productos "Sauce Labs Backpack" al carrito
    And Hacemos click al icono del carrito
    When Realizo click en checkout
    And Hago click en el boton de continuar
    Then Nos sale un mensaje de error "Error: First Name is required"

