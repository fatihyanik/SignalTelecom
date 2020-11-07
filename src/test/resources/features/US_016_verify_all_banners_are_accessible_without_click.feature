@banners2
Feature: US_015_verify_all_banners_are_accessible_without_click

  Background: User go to home page
    Given User is signal-telecom homepage

  Scenario: TC_01 User wait all banners and click the LEARN MORE button
    When the user click on LEARN MORE button on 2th banner
    Then verify the pages that open match the 2th banner
    And the user back to first page

    When the user click on LEARN MORE button on 3th banner
    Then verify the pages that open match the 3th banner
    And the user back to first page

    When the user click on LEARN MORE button on 4th banner
    Then verify the pages that open match the 4th banner
    And the user back to first page

    When the user click on LEARN MORE button on 5th banner
    Then verify the pages that open match the 5th banner

