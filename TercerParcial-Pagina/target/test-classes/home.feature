Feature: Home page

  Background: User login into Sauce demo
    Given Estamos en la pagina de saucedemo
    When colocamos el nombre del Usuario "standard_user"
    And Colocamos la contraseña "secret_sauce"
    And Hacemos click en el boton de Login

    ##Testeo del boton de Remove
    Scenario: Verify the functional button Reset
      Given Verificamos si la pagina esta habilitada o no
      And Agregamos el productos "Sauce Labs Backpack" al carrito
      And Agregamos el productos "Sauce Labs Bike Light" al carrito
      And Hago click en  burguer_menu
      And Hago click en  buttom reset
      And Verificamos los botones Remove

    ##Testeo de agregar y quitar productos del carrito
    Scenario: Delete products from checkout
      Given Verificamos si la pagina esta habilitada o no
      And Agregamos el productos "Sauce Labs Backpack" al carrito
      And Agregamos el productos "Sauce Labs Bike Light" al carrito
      And Hacemos click al icono del carrito
      And Elimino "Sauce Labs Backpack" del carro
      And Elimino "Sauce Labs Bike Light" del carro
      And Vuelvo a la pagina principal






