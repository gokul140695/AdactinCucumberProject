@bookhotel
Feature: Verifying adactin book a hotel details

  Scenario Outline: Verifying adactin book hotel
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform search hotel "<location>","<selectHotel>","<selectRoomType>","<noOfRooms>","<checkIndate>","<checkOutDate>","<adaultsPerRoom>" and "<childrenperRoom>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User should perform select hotel
    Then User should verify after select hotel success message "Book A Hotel"
    And User should perform Book a hotel "<firstName>","<lastName>" and "<Address>"
      | Credit Card No   | Credit Card Type | Expiry Month | Expiry Year | CVV Number |
      | 3738373930393827 | American Express | January      |        2022 |        765 |
      | 7645637625738743 | VISA             | April        |        2022 |        879 |
      | 7564783092736452 | Master Card      | February     |        2022 |        356 |
    Then User should verify after booking the success message "Booking Confirmation" and save the order id

    Examples: 
      | userName  | passWord   | location | selectHotel | selectRoomType | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom | childrenperRoom | firstName | lastName | Address                 |
      | Mohan1222 | Noor@12345 | Sydney   | Hotel Creek | Standard       | 1 - One   | 03/01/2023  | 04/01/2023   | 2 - Two        | 1 - One         | Ajith     | kumar    | 40,thuraipakkam,chennai |

  Scenario Outline: Verifying adactin book a hotel without enter any fields
    Given User is on the Adactin login page
    When User should perform login "<userName>" and "<passWord>"
    Then User should verify after login success message "Hello Mohan1222!"
    And User should perform search hotel "<location>","<selectHotel>","<selectRoomType>","<noOfRooms>","<checkIndate>","<checkOutDate>","<adaultsPerRoom>" and "<childrenperRoom>"
    Then User should verify after search hotel the success message "Select Hotel"
    And User should perform select hotel
    Then User should verify after select hotel success message "Book A Hotel"
    And User should perform to click book now button
    Then User should verify after book hotel the error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month","Please Enter your Credit Card CVV Number"

    Examples: 
      | userName  | passWord   | location | selectHotel | selectRoomType | noOfRooms | checkIndate | checkOutDate | adaultsPerRoom | childrenperRoom |
      | Mohan1222 | Noor@12345 | Sydney   | Hotel Creek | Standard       | 1 - One   | 03/01/2023  | 04/01/2023   | 2 - Two        | 1 - One         |
