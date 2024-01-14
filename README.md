# test_entrata
Framework created to handle automation for https://entrata.com which includes the BasePage, PageLayer and TestLayer using the maven project.

# Tools and technologies used:
# Eclipse
# JavaSE-1.8
# Selenium Webdriver
# Junit
# Maven
# Github
and its respective dependenies.

# Unit Tests:
These are the small tests which test individual functionality of application. Executed using the Junit test execution tool.

# POM.xml:
This is the main and core heart of our project in which all the required dependencies are included to run and support our maven project. The project architecture is based on POM.

# BasePage Package:
It consists of most comman and frequent requirement for our project like launch browser, close browser etc. Once we added in it no need to write it again and again. We can extend the BasePage to avail the services from the same.

# PageLayer Package:
It consists of pagewise layer for our application that we are covering for the automation. We can have the eye on pages as per the application navigation/behaviuor.

# TestLayer Package:
It consists of the all test cases, functionality/scenario and its execution using the test execution tool like Junit. Which provides the seamless access to the application using the written tests.






