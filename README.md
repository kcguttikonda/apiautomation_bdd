# apiautomation

Coding Challenge: Open Weather API test automation challenge
Goal Description:
Challenge is to automate a process to get current weather using OpenWeatherAPI. The
API returns the current weather of any given place. The place can be provided in different ways
like “city name” , “Zipcode”, “Coordinates” and “CityID”

Tools / Frameworks used :
Language : JAVA
IDE: intelliJ Community Edition 2018.2
Selenium : 3.14
Maven : Apache Maven 3.5.4
Frameworks: Cucumber and RestAssured





In this approach i  used Cucumber to write Feature Files, RestAssured to test APIs and Maven to manage dependencies
Following is the flow how framework runs:
The project contains 4 folders as following:
Features: Contains GetWeather.feature which will have parameterized Scenario written in Gherkin script
Runner: Contains TestRunner.java file which contains code for cucumber / junit test runner
Source: Contains GetWeather.java file which contains a method to test api’s using RestAssured
stepDefinitions: Contains ApiTests.java which will have cucumber step definitions for the code generated from featurefile.
For every run below is the ApiTests.java will contain three methods which will do following respectively:
@Given : constructs the apiuri to hit using parameterization of apikey and location
@When : Calls invokeAPI method from TestRunner class to hit api and get response
@Then : Validates the response received from invokeAPI

