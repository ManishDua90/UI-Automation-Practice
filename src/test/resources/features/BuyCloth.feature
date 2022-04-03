
@BuyCloth
Feature: Check if all popular cloths are present

  @BuyCloth
  Scenario Outline: Check if all popular cloths are present
    Given Driver is initiated
    When Home page is opened
    Then Buy a <cloth>
    
    Examples:
    |cloth|
    |"Faded Short Sleeve T-shirts"|    
    |"Blouse"											|
 
