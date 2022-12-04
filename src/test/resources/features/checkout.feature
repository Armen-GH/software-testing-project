Feature: Sauce demo checkout test

  Background:
    Given SwagLabs website is open
    And the username is 'standard_user'
    And the password is 'secret_sauce'
    When login button is clicked

  Scenario: Correct checkout sum
    Given the Sauce Labs Backpack is added to the cart
    And the Sauce Labs Bolt T-Shirt is added to the cart
    And the cart icon is clicked
    And the checkout button is clicked
    And the First Name is filled with 'A'
    And the Last Name is filled with 'B'
    And the Zip Code is filled with '1234'
    When the Continue button is clicked
    Then 'Item total: $45.98' should be shown

  Scenario Outline: no checkout allowed with missing personal details
    Given the cart icon is clicked
    And the checkout button is clicked
    And the First Name is filled with '<first name>'
    And the Last Name is filled with '<last name>'
    And the Zip Code is filled with '<zip code>'
    When the Continue button is clicked
    Then error '<msg>' is displayed

    Examples:
      | first name | last name | zip code | msg                            |
      |            |           |          | Error: First Name is required  |
      | A          |           |          | Error: Last Name is required   |
      | A          | B         |          | Error: Postal Code is required |
      | A          |           | 1234     | Error: Last Name is required   |