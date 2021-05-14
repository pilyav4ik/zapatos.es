Feature: Cart functionality in Chrome

  Scenario Template: Delete product from cart
    Given open web page in Chrome
    Given input "<search phrase>" to search
    And click search button
    Then click product with link title "<link title>"
    Then click button with text "Añadir al carrito"
    And select size <size>
    Then text with "El producto ha sido añadido al carrito" visible
    Then click link with text "Ir al carrito"
    Then click link with text "X Eliminar artículo"
    Then cart button must have text "Carrito de compra (0)"

    Examples:
      |search phrase|link title|size|
      |zapatillas mayoral|Zapatillas MAYORAL - 47249 Rosa 73|37|
