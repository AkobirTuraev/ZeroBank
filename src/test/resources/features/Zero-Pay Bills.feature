@PayBills
  Feature: Pay Bills page

Background: : Logging in
  Given User is in Login page
  When User enters "username" in username and "password" in password
  And User clicks on "Pay Bills" tab

      @PayTitle
      Scenario: Title of Pay Bills
        Then verify title is "Zero - Pay Bills"

        @PaymentsWithInfo
        Scenario: Successful Payment
          When user clicks "Bank of America" as Payee, "Savings" as Account
          And user enters "20954" for amount, "2020-01-28" as Date
          And user clicks Pay button
          Then verify message "The payment was successfully submitted." is displayed


          @PaymentNoInfo
          Scenario: Unsuccessful payment
            When user clicks "Wells Fargo" as Payee, "Credit Card" as Account
            And user clicks Pay button
            Then the message "Please fill out this field." is displayed

            @InvalidCharacters
            Scenario: Invalid Characters
              When user enters "ABC" in amount or enters "ABC" in Date
              And user clicks on "Pay"
              Then Application should not accept payment
