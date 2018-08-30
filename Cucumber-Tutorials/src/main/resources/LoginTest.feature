Feature: User Login
  	User should be able to login with valid credentials
  
  @tag1
  Scenario: Testing login with Valid Credentials
    Given I am on Login Page
    And Provide Username and Password
    When I Enter as UserName as "jsmith" and Pwd as "Demo1234"
    And I submit login Page
    Then I redirect to homePage
 
 