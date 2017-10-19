Feature: LFG Second

@smoke
Scenario: Account login from homepage
	Given I navigate to the lfg homepage
	When I enter my username "second"
	And I click next
	Then I should be at the sign on page