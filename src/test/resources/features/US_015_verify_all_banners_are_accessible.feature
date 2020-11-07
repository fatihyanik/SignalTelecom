@banners
Feature: US_015_verify_all_banners_are_accessible

  Background: User go to home page
    Given User is signal-telecom homepage

  Scenario: TC_01 User select 2th banner
    And the user select 2th banner
    And the user click on LEARN MORE button on 2th banner
    Then verify the pages that open match the 2th banner

  Scenario: TC_02 User select 3th banner
    And the user select 3th banner
    And the user click on LEARN MORE button on 3th banner
    Then verify the pages that open match the 3th banner

  Scenario: TC_03 User select 4th banner
    And the user select 4th banner
    And the user click on LEARN MORE button on 4th banner
    Then verify the pages that open match the 4th banner

  Scenario: TC_04 User select 5th banner
    And the user select 5th banner
    And the user click on LEARN MORE button on 5th banner
    Then verify the pages that open match the 5th banner



