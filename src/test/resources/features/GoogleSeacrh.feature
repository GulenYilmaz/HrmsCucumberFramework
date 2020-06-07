Feature: Google Search

  Scenario: Search google by typing
    Given I open the browser
    And I navigate to google home page
    When I type any searcheable item
    And I hit enter
    Then I see search results
# Scenario: Search google by voice
#   Given I navigate to google home page
#   When I click on the mic
#   And I speak searchable items
#   Then I see search results
#   And I see number of the results
