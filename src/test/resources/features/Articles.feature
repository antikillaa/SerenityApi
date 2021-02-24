Business Need: Get Articles

  Rule: User should be able get Articles list
    Scenario Template: : Sent request for getting articles

    Given Get Articles "<URL>" Request and get response with "<status>" code
    Examples:
      | URL            | status |
      | articles.json  | 200    |
      |                | 404    |
      | wrong.json     | 404    |

  Rule: The Articles list should be not null
    Scenario: : Get list of articles
      Given Get Articles List Request