@AccAct
  Feature: Account Activity page

    Background: : Logging in
      Given user is on login page
      When user logs in with username "username" and password "password"
      When user clicks on "Account Activity" tab

      @PageVerify
      Scenario: Account Activity Page title

        Then verify page title is "Zero-Account activity"

        @AccountDropDown
        Scenario Outline: All <Drop-down> options
          And verify "<Drop-down>" has correct options
          Examples:
          | Drop-down   |
          | Savings     |
          | Checking    |
          | Loan        |
          | Credit Card |
          | Brokerage   |

          @ColumnName
          Scenario Outline: All <Column> names
            And verify "<Column>" names
            Examples:
            |Column|
            |Date|
            |Description|
            |Deposit|
            |Withdrawal|
