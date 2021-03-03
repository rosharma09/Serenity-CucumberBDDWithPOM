Feature: Latest articles 

In order to get the latest insight in the car world, 
the latest articles is displayed to the user under the Review&News section 

Background:
    Given User is on the Car wale website
	
		Scenario: 
    When Selects "REVIEWS & NEWS" menu option
		Then User can see the latest article section 
		