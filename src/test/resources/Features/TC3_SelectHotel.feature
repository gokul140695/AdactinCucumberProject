@selecthotel
Feature: Verifying  adactin select hotel details

  Scenario Outline: Verify adactin select hotel
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform search hotel "<location>","<selectHotel>","<selectRoomType>","<noOfRooms>","<checkIndate>","<checkOutDate>","<adaultsPerRoom>" and "<childrenperRoom>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User should perform select hotel
    Then User should verify after select hotel success message "Book A Hotel"

    Examples: 
      | userName  | passWord   | location | selectHotel | selectRoomType | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom | childrenperRoom |
      | Mohan1222 | Noor@12345 | Sydney   | Hotel Creek | Standard       | 1 - One   | 03/01/2023  | 04/01/2023   | 2 - Two        | 1 - One         |

  Scenario Outline: Verify adactin without select hotel
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform search hotel "<location>","<selectHotel>","<selectRoomType>","<noOfRooms>","<checkIndate>","<checkOutDate>","<adaultsPerRoom>" and "<childrenperRoom>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User should click continue button without select hotel
    Then User should verify after select hotel the error message "Please Select a Hotel"

    Examples: 
      | userName  | passWord   | location | selectHotel | selectRoomType | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom | childrenperRoom |
      | Mohan1222 | Noor@12345 | Sydney   | Hotel Creek | Standard       | 1 - One   | 03/01/2023  | 04/01/2023   | 2 - Two        | 1 - One         |
