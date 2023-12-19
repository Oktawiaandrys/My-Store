Feature: Work with My Store - Final Exercise Part 1

  Scenario Outline: Successful log in an account and setting up addresses
    Given Page 'https://mystore-testlab.coderslab.pl/' opened in browser
    When Click sign in
    When Email entered in email box
    When Password entered in password box
    And Sign in button clicked
    And Address clicked
    And Create new address clicked
    And New '<Alias>' Alias
    And Address '<Address>' field fill
    And City '<City>' field fill
    And ZipCode '<ZipCode>' field fill
    And Phone '<Phone>' field filled
    And Click save button

    Then Check if address alias is equal '<Alias>'
    Then Check if address equals '<Address>'
    Then Check if address city equal '<City>'
    Then Check if address zipCode equal '<ZipCode>'
    Then Check if phone equals '<Phone>'
    Then Delete address
    Then Check if address deleted
    Then Close the browser

    Examples:
      | Alias | Address      | City       | ZipCode | Phone     |
      | Ad1   | 18 Walmsley  | Bristol    | BS 11E  | 123456789 |
      | Ad2   | 14 Eastgate  | London     | E1 8RU  | 234567890 |
      | Ad3   | 12 Tib St    | Manchester | M1 1AG  | 345678901 |