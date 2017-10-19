@calcTest
Feature: Lincoln Financial Group Life Insurance Calculators


Scenario: How much life insurance do you need
	Given I navigate to the lfg homepage
	When I click on the "Life insurance" link
	And I click on the "What type is right for me?" link
	And I open the life insurance calculator
	Then I see the How Much Life Insurance calculator
	And I enter basic Age Income and Assumptions data
	And I enter basic immediate cash data
	And I enter basic long term income needs data
	And I enter basic availible resources data
	When I click Submit 
	Then I see my results
	
	