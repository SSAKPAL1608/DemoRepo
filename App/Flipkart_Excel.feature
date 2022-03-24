Feature: Test the login part of Flipkart.

  Scenario Outline: To verify the login details.
    Given User is on Login Page
    Then User enter "<SheetName>" and <RowNumber>
    Then User click on login
    Then User should enter the things which they want to search like "Tops"
    Then User click on search button
    Then User should hover on "Home"
    Then User click on "Home Decor"

    Examples: 
      | SheetName | RowNumber |
      | Sheet1    |         0 |
