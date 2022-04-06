
@SignIn
Feature: SignIn an existing user

  @SignIn
  Scenario Outline: Check if all popular cloths are present
    Given Driver is initiated
    When Home page is opened
    And I do a login with <email> and <password>
    Then I am able to see <username> logged in
    
    Examples:
    |email|password|username|
    |"catcher@mygola.com"|"sad@321"|"Catcher Singh"|  
 
