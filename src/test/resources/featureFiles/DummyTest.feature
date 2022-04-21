Feature: Test Dummy Calculator

  @feature1scenario-group1
  Scenario: Test that this is working correctly
    Given user tries to enter value in calculator and it works

#  @feature1scenario-group2
#  Scenario: Sunday isn't Friday
#    Given I am asking wheather today is Sunday
#    When I ask whether it's Friday yet
#    Then I should be told "TGIF"

  @feature1scenario-group3
  Scenario Outline: Today is or is not Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |