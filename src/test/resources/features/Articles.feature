@art
Feature: Get Articles
  User needed get the list of Articles

  Scenario Template: : Sent request for getting articles

    Given Get Articles "<URL>" Request and get response with "<status>" code
    Examples:
      | URL           | status |
      | articles.json | 200    |
      |               | 404    |
      | wrong.json    | 404    |

    Scenario: : Get list of articles
      Given Get Articles List Request

    Scenario: Check filled filled Url, Lang and Title
      Given Get Articles List Request
      And check that Posts have filled Url, Lang and Title