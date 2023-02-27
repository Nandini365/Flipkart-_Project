Feature: Search a product feature


  Scenario: verify that the user can be visible to searchbar
    Given  The use is on the Flipkart website and the search bar is visible.
    When The user enters a valid product name in the search bar and hits enter key.
    Then the search results page should display all the relevant products related to the entered product name.


  Scenario:  verify that user can search with incorrect input
    Given The user is on the Flipkart website.
    When The user enters an invalid product name in the search bar and hits the enter key.
    Then The search results page should display all relevant products.


  Scenario:Verify that user can  search with special characters
    Given The user is on the Flipkart website and search bar is visible.
    When The user enters a product name with special characters in the search bar and hits the enter key.
    Then The search results page should display all the relevant products related to the entered product name, including special characters.

  Scenario:  Verify that user can search with multiple keywords
    Given The user is on the Flipkart website and it visible the searchbar.
    When The user enters multiple keywords in the search bar, separated by space, and hits the enter key.
    Then The search results page should display all the relevant products related to the entered keywords.

  Scenario Outline: verify that user can search with different products
    Given  The user is navigated to flipkart website
    When the user enters "<product name>" in the search bar
    Then the search bar should display all the related results "<Result>"
    Examples:
      |  product name      | Result |
      |  samsung mobiles  |samsung mobiles|
      |  wall shelves      |wall shelves   |

