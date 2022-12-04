Feature: Tests the drop down menu buttons

  Background:
    Given SwagLabs website is open
    And the username is 'standard_user'
    And the password is 'secret_sauce'
    When login button is clicked

  Scenario Outline:
    Given Sauce Labs Fleece Jacket is clicked
    And the drop down menu button is clicked
    Then '<button>' option takes us to '<page>'

    Examples:
      | button    | page                                     |
      | All Items | https://www.saucedemo.com/inventory.html |
      | About     | https://saucelabs.com/                   |
      | Log Out   | https://www.saucedemo.com/               |

  Scenario:
    Given Sauce Labs Bike Light is added to the cart
    And Sauce Labs Onesie is added to the cart
    And the drop down menu button is clicked
    And Reset App state button is clicked
    Then cart is empty