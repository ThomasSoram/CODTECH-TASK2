# CODTECH-TASK2
/OUTPUT/Edge/
![Screenshot (107)](https://github.com/ThomasSoram/CODTECH-TASK2/assets/171699330/b9378842-25b4-4489-8b19-bc961092ee3e)
/OUTPUT/Chrome/
![Screenshot (110)](https://github.com/ThomasSoram/CODTECH-TASK2/assets/171699330/51b79778-72b3-452e-baa9-d5c208d0605b)

# Project Description
This project demonstrates how to automate the login process for the OrangeHRM application using Selenium WebDriver with Java. The script is designed to open the OrangeHRM login page, enter the credentials, and verify the page title to ensure the login was successful.

# Features
Uses Selenium WebDriver for browser automation.
Written in Java, leveraging the ChromeDriver for testing on the Chrome browser.
Implements implicit waits for smoother automation.
Maximizes the browser window for better visibility during the automation process.
Verifies the login by checking the page title.

# Prerequisites
1. JDK installed (Java Development Kit)
2. Selenium WebDriver library
3. ChromeDriver executable
4. IDE for Java development (Eclipse)
5. Setup Instructions



# Set up WebDriver
Download the ChromeDriver from the official website and place it in a known location.

# Modify the WebDriver path
#Update the path to the chromedriver executable in the code
 - System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");

# Run the script:
Execute the given class from your IDE or command line to see the automation in action.

# Code Overview
#The script performs the following steps

1. Sets up the WebDriver for Chrome.
2. Maximizes the browser window and sets an implicit wait.
3. Opens the OrangeHRM login page.
4. Enters the username and password.
5. Clicks the submit button.
6. Verifies the page title to ensure successful login.
7. Print the result of the test.
8. Closes the browser.

# License
This project is licensed under the MIT License - see the LICENSE file for details.

# Acknowledgements
 - Selenium
 - OrangeHRM.
#Feel free to contribute or raise issues if you encounter any problems!#
