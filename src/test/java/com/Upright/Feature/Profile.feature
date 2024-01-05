Feature: Verifying the profile web application
#Feature , Background, given (precondition), when(action), then(Validation/test)
  Background:  The profile link is visible
    Given the profile link is loaded in the browser

    Scenario: TC-101-Verify that the title shows something meaningful
      When user take capture the title
      Then the title should be something meaningful

      Scenario:TC-102-Verify the url
        When user capture the url
        Then the url should be as expected

        Scenario:TC-103-Verify the input box
          When user can write in the input box
          Then the input box should be expected