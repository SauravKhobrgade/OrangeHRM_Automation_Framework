# OrangeHRM_Automation_Framework
This project is a Test Automation Framework developed for the OrangeHRM demo application using Selenium WebDriver, TestNG, and Java.   The framework follows the Page Object Model (POM) design pattern for better maintainability, scalability, and reusability of test scripts.  It covers end-to-end test scenarios including Login, PIM module.

Tech Stack :
- Java
- Selenium WebDriver
- TestNG
- Maven
- Git & GitHub

  Folder Structure:
  src/main/java
├── base            --> Base classes (Driver setup, initialization)
├── pages           --> Page classes (POM design)
├── factory         --> DriverFactory
├── utils           --> Utility classes (Waits, ConfigReader)
├── listeners       --> TestNG listeners (reporting)
├── testdate        --> DateProvider

src/test/resources
├── testcases (all test code)

 src/test/resources
 ├── config.properties

 Features Implemented :
 - Page Object Model (POM) Design Pattern
 - Data-driven testing using TestNG DataProvider
 - Config file handling (no hardcoding)
 - Reusable utility methods
 - TestNG reporting

   How to Run the Project:
   1. Clone the repository:
                    git clone https://github.com/yourusername/OrangeHRM-Automation-Framework.git
  2. Open project in IntelliJ / Eclipse

  3. Run testng.xml file
OR 
 Using pom.xml file - using (SureFire plugin)

