
@PopuplarClothing
Feature: Check if all popular cloths are present

  @PopuplarClothing
  Scenario Outline: Check if all popular cloths are present
    Given Driver is initiated
    When Home page is opened
    Then <cloth> is displayed on the screen
    
    Examples:
    |cloth|
    |"Faded Short Sleeve T-shirts"|    
    |"Blouse"											|
    |"Printed Dress"							|
    |"Printed Summer Dress"				| 
    |"Printed Chiffon Dress"			|
 
 
