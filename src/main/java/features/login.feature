Feature: login website

  Scenario Outline: login website scenario
    Given user already on website
    When title of log in page global trade
    Then click on seller join now
    Then click on agent seller
    Then enter information "<name>" and "<email>" and "<Sub domain>" and "<Mobile Number>" and "<Country>" and "<State>" and "<City>" and "<Address>" and "<Enter Postal Code>" and "<Categories>" and "<Password>"
    Then complete registration

    Examples:
      | name | email          | Sub domain | Mobile Number| Country | State     | City | Address | Enter Postal Code | Categories | Password |
      | omer | omer@gmail.com | dadasd     | 45545454     | 29305 | sdad        | sadsad | sdasd | hjkl               |    2        |     dsfd |
      | omer | lkfjsklj@gmail.com |sdfsd    |1231231321   |   29305 |   gjghj  | hfgh   | gfhfg   | sda               | 3         |     dfddsf    |