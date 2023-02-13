@login
Feature: Verifying  adactin hotel login details

  Scenario Outline: Verify adactin hotel valid login
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"

    Examples: 
      | userName  | passWord   |
      | Mohan1222 | Noor@12345 |

  Scenario Outline: Verify adactin hotel login with enter key
    Given User is on the Adactin login page
    When User should perform login "<userName>","<passWord>" with Enter key
    Then User should verify after login success message "Hello Mohan1222!"

    Examples: 
      | userName  | passWord   |
      | Mohan1222 | Noor@12345 |

  Scenario Outline: Verify adactin hotel invalid login credentials
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login with invalid credentials error message contains "Invalid Login details"

    Examples: 
      | userName | passWord |
      | Gre8434  | ifsd76   |
