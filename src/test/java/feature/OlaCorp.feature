Feature: Validate fields in OLA Corporate Application

  Background: open the browser and the navigate to the OLACorp page
    Given User is on OlaCorp page

  Scenario: Validate Empty Name field
    When Click on Sumit button with entering value in the field
    Then Error Message displyed for mandatory name field

  Scenario Outline: Validate Name field
    When Enter value in "<Name>" to validate field length
    Then Error Message displyed for Name "<Name>" field

    Examples: 
      | Name                                                                                                   |
      | T                                                                                                      |
      | testingtestingtestingtestingtestingtestingtestingtestingtestingtestingtestingtestingtestingtest1234567 |

  Scenario Outline: Validate phone field max and min field length
    When Validate value in phone "<phone>" field
    Then Error Message displyed entering min value in phone "<phone>"

    Examples: 
      | phone           |
      |      1234567890 |
      | 787654323456789 |

  Scenario: Validate Country field drop down list
    When Validate value in Country field is mandatory
    Then Error Message displyed without entering value in Country

  Scenario: Validate Country field drop down list options
    When Validate option available in Country field
    Then Verify the option of in Country drop downlist
