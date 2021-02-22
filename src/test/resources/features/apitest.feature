Feature: Cash Withdrawals

  Scenario: Cash withdrawal
    Given Sent generate a new password
    |length| upperCase | digits | specialCharacters|
    |10    | true      | true   | true             |

  Scenario: Get Articles
    Given Get Articles Request
