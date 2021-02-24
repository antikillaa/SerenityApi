Business Need: Get Articles

  Rule: User should be able get Articles list
    Scenario Template: : Get Articles

    Given Get Articles "<URL>" Request and get response with "<status>" code
    Examples:
      | URL            | status |
      | articles.json  | 200    |
      |                | 404    |
      | wrong.json     | 404    |