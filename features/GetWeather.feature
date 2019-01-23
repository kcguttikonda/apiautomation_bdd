Feature: Get Current Weather of any given place

Scenario Outline: Get Current Weather of any given place using city
    Given I have a valid "<apikey>" and "<parameter>"
    When I hit getWeather API
    Then I should see current tweather for the entered location
  Examples:
      | apikey                           | parameter     |
      | df75744c36761e9ee5797ed2c5261a2b | q=Zaragoza,ES |
      | df75744c36761e9ee5797ed2c5261a2b | id=2172797    |
      | df75744c36761e9ee5797ed2c5261a2b | zip=94040,us  |
      | df75744c36761e9ee5797ed2c5261a2b | lat=35&lon=139|
      | df75744c36761e9ee5797ed2c5261a2b | q=Zoza,ES |
      | df75744c36761e9ee5797ed2c5261a2b | id=2797    |
      | df75744c36761e9ee5797ed2c5261a2b | zip=40,us  |
      | df75744c36761e9ee5797ed2c5261a2b | lat=0&lon=0|