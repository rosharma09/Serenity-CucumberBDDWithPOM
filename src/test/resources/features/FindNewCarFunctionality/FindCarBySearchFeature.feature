Feature: Search feature to search a car
  
  In order to search for a car, 
  the user is provided a search 
  bar where he/she can serach 
  for the car

  Background: 
    Given User is on the Car wale website
    Then Search bar is visible to the user

  Scenario Outline: Find for search car, from the options displayed in the search bar
    When User enters the "<Car Name>" in the search box

    #And Select the "<Option>" in the list of car Names Displayed
    #Then User can see the Car Name, Car Price and EMI as follow "<Car Name>" , "<Car Price>" and "<EMI>"
    Examples: 
      | Car Name    | Option      | Car Price   | EMI          |
      | Kia Sonet   | Kia Sonet   | ₹ 8.19 Lakh | EMI ₹ 12,744 |
      | Hyundai i20 | Hyundai i20 | ₹ 8.30 Lakh | EMI ₹ 12,761 |
      | Honda Amaze | Honda Amaze | ₹ 7.50 Lakh | EMI ₹ 11,683 |
