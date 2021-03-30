Feature: Application Login



Scenario: Home page login
Given User is on Home page
When User login with Username "Akash" and password "No"
Then Home page is displayed
And Cards is displayed
