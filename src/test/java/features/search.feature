Feature: Search
  As a user I should be able to search catalog of the app

  Scenario Outline: Search with valid query and press search button
  As a user I should be able to search using valid query and click search button

    Given I am on the web shop extremeintimo
    When I enter my search query "<search>"
    And I click on the search button
    Then Verify that the search results are displayed

    Examples:
      | search              |
      | kupaći              |
      | majice              |
      | veš                 |
      | čarape              |
      | odeća               |
      | aksesoari           |
      | Brushalteri         |
      | program za spavanje |