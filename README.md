# Selenium Test Automation Framework - Tricentis Insurance Application

## Overview

This project is a **Selenium WebDriver automation framework** developed using **Java** to automate the **Tricentis Vehicle Insurance Application**.

The framework automates end-to-end insurance quote workflows for different vehicle categories:
- Automobile
- Truck
- Motorcycle
- Camper

The project follows the **Page Object Model (POM)** design pattern to create a clean, reusable, and maintainable automation framework.

Website Tested:
https://sampleapp.tricentis.com/101/

---

## Objectives

The main objectives of this automation framework are:

- Automate vehicle insurance quote workflows
- Reduce manual testing effort
- Create reusable page components
- Maintain clean separation between test logic and page elements
- Demonstrate scalable Selenium automation practices.

---

## Tech Stack 
- Java 
- Selenium WebDriver 4.39.0 
- TestNG 7.11.0 
- Maven 
- Eclipse IDE 
- Google Chrome

---

## Framework Architecture

The framework follows the Page Object Model (POM) design pattern.

Each webpage is represented by a separate Java class containing:

- Page locators
- Page actions
- Reusable methods

This keeps test cases clean and improves maintainability.

```

## 📂 Project Structure

```text
Selenium-Test-Automation-Tricentis-Insurance-Application
│
├── src
│   ├── base
│   │   └── BaseTest.java
│   │
│   ├── pages
│   │   ├── HomePage.java
│   │   ├── VehicleDataPage.java
│   │   ├── AutomobileVehicleDataPage.java
│   │   ├── TruckVehicleDataPage.java
│   │   ├── MotorcycleVehicleDataPage.java
│   │   ├── CamperVehicleDataPage.java
│   │   ├── InsurantDataPage.java
│   │   ├── ProductDataPage.java
│   │   ├── AutomobileProductDataPage.java
│   │   ├── PriceOptionPage.java
│   │   └── SendQuotePage.java
│   │
│   └── tests
│       ├── AutomobileTest.java
│       ├── TruckTest.java
│       ├── MotorcycleTest.java
│       └── CamperTest.java
│
└── README.md
```

---

## Key Features

- Selenium WebDriver automation
- Page Object Model architecture
- Reusable page classes
- Page inheritance implementation
- Common vehicle workflow handling
- Multiple vehicle insurance scenarios
- Automated form filling
- Insurance quote generation workflow
- Maintainable framework structure
- Easy extension for new test scenarios

---

## Framework Design
Page Object Model Implementation

The framework separates:

###  Base Layer

Responsible for:
- Browser setup
- WebDriver initialization
- Browser closing

### Page Layer

Responsible for:
- Locators
- Web element interaction
- Page functionality

### Test Layer

Responsible for:
- Test execution
- Workflow validation
- Calling page methods

 ---

## Automated Test Scenarios

The framework automates:

### Automobile Insurance
Test Class: AutomobileTest.java
Automates:
- Navigate to Automobile insurance
- Enter vehicle details
- Enter customer information
- Select insurance product
- Select price plan
- Submit quote

### Truck Insurance
Test Class: TruckTest.java
Automates:
- Truck selection
- Vehicle specification entry
- Customer details
- Insurance selection
- Quote submission

### Motorcycle Insurance
Test Class: MotorcycleTest.java
Automates:
- Motorcycle selection
- Model entry
- Engine capacity
- Seat selection
- Insurance workflow

### Camper Insurance
Test Class: CamperTest.java
Automates:
-Camper selection
- Vehicle details
- Payload details
- Weight details
- Quote submission

---

## 📄 Page Class Responsibilities

| Page Class | Responsibility |
|------------|----------------|
| `HomePage` | Vehicle category navigation |
| `VehicleDataPage` | Common vehicle information |
| `AutomobileVehicleDataPage` | Handles automobile-specific vehicle details |
| `TruckVehicleDataPage` | Handles truck-specific vehicle details |
| `MotorcycleVehicleDataPage` | Handles motorcycle-specific vehicle details |
| `CamperVehicleDataPage` | Handles camper-specific vehicle details |
| `InsurantDataPage` | Enters customer/insurant information |
| `ProductDataPage` | Selects insurance product details |
| `PriceOptionPage` | Selects the insurance price plan |
| `SendQuotePage` | Enters quote details and submits the quote |

---

## Setup Instructions

## Prerequisites

Before running the project, install:

- Java JDK 8 or above (Java 11 or later is recommended) 
- Maven 
- Google Chrome 
- Eclipse IDE or IntelliJ IDEA 
- Internet connection (for Selenium Manager to download the appropriate browser driver if needed)
  
---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/aakanksham9018-gihub/Selenium-Test-Automation-Tricentis-Insurance-Application.git 
```
2. Open the project in Eclipse or IntelliJ IDEA.
3. Ensure all project dependencies are available (if you later migrate to Maven, allow Maven to download them).
4. Make sure Google Chrome is installed on your system.
5. Run any of the following test classes as a Java Application:
- AutomobileTest.java
- TruckTest.java
- MotorcycleTest.java
- CamperTest.java
6. The automation will:
- Launch Chrome
- Open the Tricentis Vehicle Insurance application
- Complete the selected insurance workflow
- Submit the quote
- Close the browser

---

## Future Improvements

- Integrate TestNG reporting
- Implement WebDriverWait strategy
- Externalize test data
- Add CI/CD pipeline using GitHub Actions
- Enable parallel execution

---

## Author

**Aakanksha Mali**
Java | Selenium | Test Automation
