# Heroku App Automation

## Description
This project demonstrates the automation of a login and logout process using Selenium WebDriver for testing a login form on the **Herokuapp** website. The script performs the following tasks:

1. Navigates to the login page.
2. Enters login credentials (username and password).
3. Clicks the login button and verifies successful login.
4. Logs out from the account and verifies successful logout.
5. Prints the success messages after login and logout.

---

## Features
- **Automated Login**: The script inputs predefined credentials into the login form and submits them.
- **Login Verification**: After login, the script verifies if the login is successful by checking for the success message.
- **Automated Logout**: After login, the script performs a logout operation.
- **Logout Verification**: Verifies if the logout operation is successful by checking for the logout message.
- **Selenium WebDriver**: Uses Selenium WebDriver to interact with web elements and simulate user actions.
- **Dynamic Waits**: Utilizes `WebDriverWait` to handle dynamic page content loading, ensuring that elements are present before interacting with them.
  
---

## Prerequisites
To run this project, ensure you have the following installed:

- **Java**: Version 8 or above (Required for running the Selenium WebDriver code)
- **Selenium WebDriver**: The WebDriver library is needed to automate web interactions.
- **ChromeDriver**: Ensure the [ChromeDriver](https://sites.google.com/chromium.org/driver/) is installed and is compatible with your version of Chrome.
- **IDE**: Any Java IDE like IntelliJ IDEA or Eclipse for running the project.

---

## Technologies Used
- **Java**: Programming language used for writing the test automation script.
- **Selenium WebDriver**: Library used for automating web browser interaction.
- **ChromeDriver**: WebDriver for automating interactions with the Chrome browser.
