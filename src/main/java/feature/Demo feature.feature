Feature: Facebook Login

  Scenario Outline: Signup facebook page
    Given User is on facebook page
    When he enter the value in all mandatory fields "<userid>" , "<Pasword>"
    Then Click on Create Account button

    Examples: 
      | userid | Password |
      | abc    | xyz      |
