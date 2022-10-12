@smoke
Feature: User can Follow the website pages on social media
  #Test Scenario
  Scenario: user opens facebook link
    When User click on facebook link
    Then "facebook" is opened in new tab

  Scenario: user opens twitter link
    When User click on twitter link
    Then "twitter" is opened in new tab

  Scenario: user opens rss link
    When User click on rss link
    Then "rss" is opened in new tab

  Scenario: user opens youtube link
    When User click on youtube link
    Then "youtube" is opened in new tab
