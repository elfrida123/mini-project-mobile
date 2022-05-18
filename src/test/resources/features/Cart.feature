Feature: Cart

  @add-to-cart
  Scenario: Add product to cart
    Given I am on the home page
    When I click Beli button
    Then Product Increases On Cart