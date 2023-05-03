# Selenium Test Framework

This is a Selenium-based test framework for testing web applications. It provides a set of tools and utilities for creating and running automated tests using the Selenium WebDriver API.
* Used website during test : the-internet.herokuapp.com

# Features

* Supports Chrome and Firefox web browsers
* Provides a base test class for setting up and tearing down the WebDriver instance
* Provides a home page object for navigating to the home page of the tested application
* Provides a WindowManager class for managing the browser window, such as resizing and maximizing
* Provides a method for taking screenshots on test failure
* Provides a FluentWait instance for waiting for elements to appear or disappear on the page
* Supports the Page Object Model for organizing tests

# Getting Started
To use this framework, you must have the following installed:

* Java Development Kit (JDK) version 8 or later
* Apache Maven
* Chrome or Firefox web browser
To build and run the tests, follow these steps:

* Clone this repository to your local machine.
* Open a terminal or command prompt and navigate to the project directory.
* Run the following command to build the project: mvn clean install
* Run the tests using the following command: mvn test

# Test Structure

* The tests are written using TestNG, a testing framework for Java. The tests are organized into classes that extend the BaseTests class, which provides the WebDriver instance and other utilities.

* The framework supports the Page Object Model for organizing tests. Each page of the tested application is represented by a page object class, which contains the methods and elements specific to that page. The page object classes are stored in the pages package.

* Each test class contains methods annotated with @Test, which are the individual test cases. In the test methods, the page object classes are instantiated and used to interact with the page under test.

* The home page object is created in the setUp() method of the BaseTests class, and is used in each test case to navigate to the home page of the tested application.

* The WindowManager class is used in the tests to manage the browser window, such as resizing and maximizing.

* When a test fails, a screenshot of the browser window is taken and saved to the resources/screenshots directory.

# Configuration

* The WebDriver instance is configured in the setUp() method of the BaseTests class. By default, the ChromeDriver is used, but you can switch to the FirefoxDriver by uncommenting the line //driver =new FirefoxDriver();.

* The getChromeOptions() method in the BaseTests class provides a set of ChromeOptions that are used when creating the ChromeDriver instance. By default, the options disable the infobar and maximize the browser window. You can modify these options to suit your needs.

# Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request. We welcome all contributions, including bug fixes, new features, and documentation improvements.


# Credits
This project was created by Kirolos Gamal.
