Feature: Find New car by brand feature
  
  In order to find new cars for a particular brand, the user can use the find new car 
  feature to search for the newly arrived cars by clicking on the respective car brand.

  Background: 
    Given User is on the Car wale website

  Scenario Outline: Find new car by the brand names
    When User navigates to the "Find New Cars" option under the "NEW CARS" menu option
    Then User can see the "New Cars" label displayed on the page
    When User selects the car brand as "<Car Brands>"
    Then User can see the cars for the respective brands

    Examples: 
      | Car Brands    |
      | Kia           |
      | Tata          |
      | Honda         |
      | Maruti Suzuki |
      | BMW           |
      | Renault       |
      | Skoda         |
      | Ford          |
      | Toyota        |
      | Mercedes-Benz |
