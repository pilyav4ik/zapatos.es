Feature: Product search

 Scenario Template: Product search text input in Chrome
   Given input "<search phrase>" to search
   And click search button
   Then click product with link title "<link title>"
   Then text in breadcrumbs is "<link title>"
   And brand link with text "<brand>" visible

   Examples:
   |search phrase|link title|brand|
   |zapatillas mayoral|Zapatillas MAYORAL - 47249 Rosa 73|Mayoral|

  Scenario Template: Fail product search text input in Chrome
    Given input "<search phrase>" to search
    And click search button
    Then text with "<text output>" visible

    Examples:
      |search phrase|text output|
      |.            |No hay productos que coincidan con la selección.|