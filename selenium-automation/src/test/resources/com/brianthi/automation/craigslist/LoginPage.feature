Feature: Login Page Feature

  Background: Unauthenticated on home page
    Given Unauthenticated on Craigslist login page

  Scenario: Successful login
    When Submit email:seleniumautomationbthi@gmail.com and password:fMRdbjrWYio98cPJ0eG9
    Then Forwarded to account page

  Scenario: Failed login due to invalid password
    When Submit email:seleniumautomationbthi@gmail.com and password:myInvalidPassword
    Then Shown login error message

  Scenario: Failed login due to invalid email
    When Submit email:invalidemaila7df98adf99a9@gmail.com and password:fMRdbjrWYio98cPJ0eG9
    Then Shown login error message

  Scenario: Failed login due to invalid email and password
    When Submit email:invalidemaila7df98adf99a9@gmail.com and password:myInvalidPassword
    Then Shown login error message
