Feature: Validate fields in OLA Corporate Application

  Background: open the browser and the navigate to the OLACorp page
    Given User is on OlaCorp page

   @Name
  Scenario Outline: Enter value in Name
    When User Enter value in Name Text box "<value>"
    Then Click on Submit button
    Then Result will display "<Result>"

    Examples: 
      | value                          | Result                         |
      | Name@1234                      | Name accepts Alphanumeric Char |
      | Name#1234Text!2345Box1232526*& | Name accepts 30 Chars          |
   @email
  Scenario Outline: Enter value in email
    When User Enter value in email Text box "<Email>"
    Then Result will display "<Result>"

    Examples: 
      | Email                          | Result                                                          |
      | Validemailaddress@gmail.com    | email address accepts Alphanumeric Char                         |
      | Validemailaddress_12@gmail.com | email address accepts Alphanumeric and special char of 30 digit |
