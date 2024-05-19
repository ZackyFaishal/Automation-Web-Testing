Feature: Logout

    Scenario: Logout from App
        Given I am on the dashboard page
        When I clicked the sidebar menu button
        And I clicked the logout button
        Then I should be logged out successfully