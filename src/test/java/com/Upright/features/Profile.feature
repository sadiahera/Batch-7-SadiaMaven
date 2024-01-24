Feature: Verifying the profile web application
#Feature , Background, given (precondition), when(action), then(Validation/test)
  Background:  The profile link is visible
    Given the profile link is loaded in the browser

    Scenario: TC-101-Verify that the title shows something meaningful
      When user take capture the title
      Then the title should be Sadia's Profile

      Scenario:TC-102-Verify the url
        When user capture the url
        Then the url should be with http and the name

        Scenario:TC-103-Inserting Project Management Tools
          When user get the input box
          Then the user  should be able to type the tool name

