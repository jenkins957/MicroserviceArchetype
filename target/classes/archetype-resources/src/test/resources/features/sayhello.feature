@sayHello
Feature: Say Hello via the service API.

  @sayHello
  Scenario:
    Given I have a Person called Nemo
    When they say hello
    Then the service says hello back


