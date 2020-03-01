Feature: Here we will write cases for search items on my application and purchase

@Regression
Scenario: Search Electewronic item, add to cart and pucharse using debit card
   Given  User is on login page
   When   User enters username
   And    User enters password
   And    User clicks on signin button
   Then   User verify login successfully
   And    User should get welcome message
   When   User enter data in search box
   And    User click on Search button
   Then   Search results should be displayed   
   
 
Scenario: Search Electqweqwronic data, add to cart and pucharse using debit card
   Given  User is on login page
   When   User enters username
   And    User enters passwd
