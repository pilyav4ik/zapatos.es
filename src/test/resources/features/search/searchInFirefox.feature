Feature: Product search in Firefox

  Scenario Template: Product search text input
    Given open web page in Firefox
    Given input "<search phrase>" to search
    And click search button
    Then click product with link title "<link title>"
    Then text in breadcrumbs is "<link title>"
    And brand link with text "<brand>" visible
    And close browser

    Examples:
      |search phrase|link title|brand|
      |zapatillas mayoral|Zapatillas MAYORAL - 47249 Rosa 73|Mayoral|

  Scenario Template: Fail product search text input
    Given open web page in Firefox
    Given input "<search phrase>" to search
    And click search button
    Then text with "<text output>" visible
    And close browser

    Examples:
      |search phrase|text output|
      |.            |No hay productos que coincidan con la selección.|