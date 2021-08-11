Feature: Login for Gmail

  Background: Login for gmail
    Given User need to be on gmail page

  Scenario Outline: Login scenario test for Gmail
    When User enters "<emailid>" email
    And Clicks next button for password
    And User enters "<password>" password
    And Clicks next button for login
    Then Mailbox page of user should be displayed

    Examples: 
      | emailid                         | password  |
      | varun171883.cse@chitkara.edu.in | password1 |
      | varun171883.cse@chitkara.edu.in | password2 |
      | varun171883.cse@chitkara.edu.in | password3 |
