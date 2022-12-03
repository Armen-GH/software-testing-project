Feature: SwagLabs login test

  Background:
    Given SwagLabs website is open


  Scenario Outline: Successful Login
    Given username is '<username>'
    And password is 'secret_sauce'
    When login button is clicked
    Then products page is open

    Examples:
      | username                |
      | standard_user           |
      | performance_glitch_user |
      | problem_user            |

  Scenario Outline: Unsuccessful Login
    Given username is '<username>'
    And password is '<password>'
    When login button is clicked
    Then the '<msg>' error message is shown
    Examples:
      | username        | password     | msg                                                                       |
      |                 |              | Epic sadface: Username is required                                        |
      | any_user        |              | Epic sadface: Password is required                                        |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
      | any_user        | any_password | Epic sadface: Username and password do not match any user in this service |