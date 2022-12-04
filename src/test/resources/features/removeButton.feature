Feature: Remove Button on sauce demo testing

  Scenario: :
    Given SwagLabs website is open
    And the username is 'standard_user'
    And the password is 'secret_sauce'
    When login button is clicked
    And the Sauce Labs Bolt T-Shirt is added to the cart
    Then cart is not empty
    But When Sauce Labs Bolt T-Shirt is removed from the cart
    Then cart is empty