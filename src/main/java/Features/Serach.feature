Feature: Seraching Nikon

Scenario: Serching Nikon product on amazone.com and displaying details of Nikon product

Given User is on "amazone.com" home page
When  User enters Nikon in serach text box
When User hits enter button from keybord
When User Sort result from High to low
Then User is on search result page and user selects the second product
Then User should see selected product details
And  User should see Nikon product list in search list page


