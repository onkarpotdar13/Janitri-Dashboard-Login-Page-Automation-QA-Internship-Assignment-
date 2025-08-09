Janitri Dashboard Login Page Automation (QA Internship Assignment)
This project is my QA Internship Assignment for automating the Login Page of the Janitri Dashboard using Java, Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern.

It includes manual and automated test cases for various login scenarios — without using valid credentials.

/src
 ├── main/java/com/pom
 │    └── LoginPage.java         # Page Object class with locators & actions
 ├── test/java/com/tests
 │    ├── BaseTest.java          # Browser setup & teardown
 │    └── LoginTest.java         # TestNG test methods
master.xml                       # TestNG suite file (runs all tests)
pom.xml                          # Maven dependencies



📌 Assignment Requirements Covered

Java + Selenium WebDriver for automation

Maven for dependency management

TestNG as the test runner

Page Object Model (POM) implemented

BaseTest class for browser setup/teardown

Permission handling for notifications

LoginPage.java includes locators for:

User ID input

Password input

Login button

Password visibility toggle (eye icon)

Test methods implemented:

testLoginButtonDisabledWhenFieldAreEmpty()

testPasswordMaskedButton()

testInvalidLoginShowErrorMsg()

Additional scenarios for UI and negative tests

📌 Automated Test Scenarios (Without Valid Credentials)

Attempt login with blank fields and verify UI behavior

Enter any random credentials and click login – capture and print the error message shown

Validate password masking/unmasking toggle

Validate presence of page elements (title, input fields, eye icon, logos, etc.)

| Test Method                                  | Result |
| -------------------------------------------- | ------ |
| `testPasswordMaskedButton()`                 | ✅ Pass |
| `testLoginButtonDisabledWhenFieldAreEmpty()` | ❌ Fail |
| `testInvalidLoginShowErrorMsg()`             | ❌ Fail |
| `testPasswordMaskingToggle()`                | ✅ Pass |
| `testLoginWithBlankFields()`                 | ❌ Fail |
| `testPresenceOfPageElements()`               | ✅ Pass |


**Creator Name:** Onkar Potdar  
**Date:** 09/08/2025  
**Tools & Technologies Used:** Java, Selenium WebDriver, Maven, TestNG, Page Object Model (POM), ChromeDriver, ChatGPT
