Feature: feature to test google search functionality

Scenario: Validate google search is working
   Given browser is open
   And user is on google search page
   And user enters a text in search box
   Then hits enter
   Then user is navigated to search results
   Then close the broswer