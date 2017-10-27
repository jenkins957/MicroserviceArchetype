@resource
Feature: Application Health Check

  @hello
  Scenario:
    Given The app is running
    When I check call say hello
    Then hello is returned


