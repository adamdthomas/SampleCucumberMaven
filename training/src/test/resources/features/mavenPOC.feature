@regression
Feature: LFG user accounts

Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "apprehensiveEisenhower"
	And I click next
	Then I should be at the sign on page
	
Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "bill"
	And I click next
	Then I should be at the sign on page
	
Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "john"
	And I click next
	Then I should be at the sign on page