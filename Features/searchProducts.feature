
Feature: searching product

Scenario Outline: searching product in google

Given i am in the google homepage

When i enter the "<Product_name>" in the search bar
And i click on the search button

Then i can see the search result successfully


Examples:
|Product_name |
| Toy         |
