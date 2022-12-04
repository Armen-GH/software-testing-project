Feature: Sauce Demo Websire Sorting Functionality

  Background:
    Given SwagLabs website is open
    And the username is 'standard_user'
    And the password is 'secret_sauce'
    When login button is clicked
    And name sorting menu button is clicked

  Scenario: Name A to Z
    Given name a to z button is clicked
    Then first item should be Sauce Labs backpack
    And last item should be red t-shirt

  Scenario: Name Z to A
    Given name z to a button is clicked
    Then first item should be red t-shirt
    And last item should be Sauce Labs backpack

  Scenario: Price low to high
    Given price low to high button is clicked
    Then first item should be Sauce Labs onesie
    And last item should be Sauce Labs fleece jacket

  Scenario: price high to low
    Given price high to low button is clicked
    Then first item should be Sauce Labs fleece jacket
    And last item should be Sauce Labs onesie