Feature: Cart functionality in Firefox

  Scenario Template: Add product to cart from product page
    Given open web page in Firefox
    Given input "<search phrase>" to search
    And click search button
    Then click product with link title "<link title>"
    Then click button with text "Añadir al carrito"
    And select size <size>
    Then text with "El producto ha sido añadido al carrito" visible
    Then close popup window with added product
    When cart button must have text "Carrito de compra (1)"
    Then click cart button after added product
    Then on the cart page product size must be <size>

    Examples:
      |search phrase|link title|size|
      |zapatillas mayoral|Zapatillas MAYORAL - 47249 Rosa 73|37|
