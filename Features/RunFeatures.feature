Feature: form submition application

  Scenario: fill the form
    Given Load 1 row data from Excel
    And Fill the form
    And Submit the form
    Then verify the dropdown
       