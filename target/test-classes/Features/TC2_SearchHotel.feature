@searchHotel
Feature: Verifying  adactin search hotel details

  Scenario Outline: Verify adactin hotel select all fields
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform search hotel "<location>","<selectHotel>","<selectRoomType>","<noOfRooms>","<checkIndate>","<checkOutDate>","<adaultsPerRoom>" and "<childrenperRoom>"
    Then User should verify after search hotel the success message "Select Hotel"

    Examples: 
      | userName  | passWord   | location | selectHotel | selectRoomType | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom | childrenperRoom |
      | Mohan1222 | Noor@12345 | Sydney   | Hotel Creek | Standard       | 1 - One   | 03/01/2023  | 04/01/2023   | 2 - Two        | 1 - One         |

  Scenario Outline: Verifying mandatory fields in adactin hotel
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should Enter only mandatory fields  "<location>","<noOfRooms>","<checkIndate>","<checkOutDate>""<adaultsPerRoom>"
    Then User should verify after search hotel the success message "Select Hotel"

    Examples: 
      | userName  | passWord   | location | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom |
      | Mohan1222 | Noor@12345 | Sydney   | 1 - One   | 03/01/2023  | 04/01/2023   | 2 - Two        |

  Scenario Outline: Verify adactin hotel to validate date
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform search hotel "<location>","<selectHotel>","<selectRoomType>","<noOfRooms>","<checkIndate>","<checkOutDate>","<adaultsPerRoom>" and "<childrenperRoom>"
    Then User should verify after search hotel the error message "Check-In Date shall be before than Check-Out Date" , "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName  | passWord   | location | selectHotel | selectRoomType | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom | childrenperRoom |
      | Mohan1222 | Noor@12345 | Sydney   | Hotel Creek | Standard       | 1 - One   | 18/01/2024  | 19/01/2023   | 2 - Two        | 1 - One         |

  Scenario Outline: Verify adactin hotel without enter any fields
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform to click search button
    Then User should verify after search hotel the error message "Please Select a Location"

    Examples: 
      | userName  | passWord   |
      | Mohan1222 | Noor@12345 |
