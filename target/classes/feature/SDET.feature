Feature: Google search functionality

  Background: open the browser and the navigate to the google page
    Given User navigate to Google page

  @smoke
  Scenario Outline: Serach value in Google
    When User Enter value in search box "<value>"
    Then Result will display "<Sample>" , "<Sample2>"

    Examples: 
      | value   | Sample  | Sample2 |
      | IBM     | String1 | String2 |
      | Manipal | String3 | String3 |

  @regression
  Scenario Outline: Serach value in Google
    When User Enter value in search box "<value>"
    Then Result will display "<Sample>" , "<Sample2>"

    Examples: 
      | value    | Sample  | Sample2 |
      | IBM1     | String1 | String2 |
      | Manipal1 | String3 | String3 |
