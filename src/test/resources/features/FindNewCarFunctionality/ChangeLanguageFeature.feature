Feature: Change Language feature 

In order to use the carwale website in Hindi language, 
the change language button is available for the user

Background:
    Given User is on the Car wale website
		Then Change language icon is displayed in the global menu bar
		

		Scenario: Change the lannguage to hindi
		When User change the language to "Hindi"
		Then User can see the heading displayed as "<सही कार ढूंढें>"
		