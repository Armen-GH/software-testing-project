Feature: Tests The Social Icons

  Scenario Outline:
    Given SwagLabs website is open
    And the username is 'standard_user'
    And the password is 'secret_sauce'
    When login button is clicked
    Then '<social>' button takes us to the corresponding '<page>'
    And navigate to 'https://www.linkedin.com/company/sauce-labs/'

    Examples:
      | social   | page                                         |
      | Twitter  | https://twitter.com/saucelabs                |
      | Facebook | https://www.facebook.com/saucelabs           |
      | LinkedIn | https://www.linkedin.com/company/sauce-labs/ |