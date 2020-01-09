@AccSum
Feature: Account Activity content


    Scenario: Account Summary Page Title
      Given user is on the login page
      When user logs in with "username" and "password"
      Then Account Summary page should have the title "Zero - Account Summary"

    Scenario Outline: All <AccountTypes>
      And verify "<AccountTypes>" are displayed
      Examples:
      | AccountTypes        |
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

      Scenario Outline: <CreditAccounts> table columns
        And verify "<CreditAccounts>" columns
        Examples:
          | CreditAccounts        |
          | Account               |
          | Credit Card           |
          | Balance               |



