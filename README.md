## ℹ️ About Project

This is a mobile test automation project for Appium with Java. Used Airbnb.apk file which is downloaded from: 

    https://download.apkcombo.com/com.airbnb.android/Airbnb_22.13.1_apkcombo.com.apk?ecp=Y29tLmFpcmJuYi5hbmRyb2lkLzIyLjEzLjEvMjYwMDA4ODQuNWY5NmM5NGQ1MzI3NWI3OTQ5ZjhiOTQ1Nzc1OWM4MWU4MzIxNzAzZi5hcGs=&iat=1648955433&sig=083aa1fa747746f979450e5e167bc18f&size=158265515&from=cf&version=latest&lang=en&fp=998d36b338e7ab5fa75a01fd87feff56&ip=176.233.97.116

There are 4 test scenarios.

    1) Login 2) Adding Favourite Place to Stay 3) Deleting favourite place 4) Logout

## Using Technologies

- Java 11
- Maven
- TestNG
- Log4J

## 🚀 How to use

- First of all, Appium Server GUI can be started.
- Then, Android emulator or real device can be connected with server. I used Nexus 6 Android Emulator.
- If you completed, these 2 steps, run `testng.xml` file or run maven command below: 

  - mvn clean install

## 🗒️ Additional Informations

This is a basic idea of mobile test automation for example of Airbnb application. Extra reporting tools can be implemented for this project.
If you increase your emulators, or real devices, you can run your tests in parallel execution to modify testng.xml.