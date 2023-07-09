# Ecommerce UI Automation
***
This repository is the result of my independent project to train certain things in QA Automation UI.

I spent 1 day on the realization of setup this project and searching text scenario 

Side information: To use the application in a special environment the author accepts no responsibility if you cause damage to third parties

## Table of Contents
1. [A list of technologies used within the project](#a-list-of-technologies-used-within-the-project)
2. [Collaboration](#collaboration)
3. [Potential Bugs](#potential-bugs)
### A list of technologies used within the project
***
A list of technologies used within the project:
* [Windows 10 (OS)]([https://ubuntu.com/](https://www.microsoft.com/en-us/windows)): Windows 10 
* [Intellij idea](https://www.jetbrains.com/idea/): Version 2022.3.3 (Community Edition) Build #IC-223.8836.41, built on March 10, 2023
* [Java](https://www.java.com/en/): Version openjdk version "18.0.2-ea"
* [Selenium](https://www.selenium.dev/): Version 4.8.3 
* [TestNG](https://testng.org/doc/): Version 6.14.3
* [Webdriver Manager](https://bonigarcia.dev/webdrivermanager/): Version 5.3.2
* [Cucumber](https://cucumber.io/): Version 6.9.1
* [Allure](https://qameta.io/allure-report/): Version 2.13.8

Feel free to copy the project from this repository into your IDE and run the test, and make sure all the scenarios are automated.

## Collaboration
***
This is my personal project which I upgrade with new things and test scenarios from time to time and I do not accept any collaboration
> Please do not change the code. 
> I am available for any questions.

## Potential Bugs
***
As I haven't read the documentation for the app I performed tested, and I consider the following thing to be potential bugs in the search scenario:

* Got the wrong result on the search page.
   
   __Steps to reproduce__
   * go to this page "https://rs.extremeintimo.com/"
   * In the upper left corner enter an "aksesoari" keyword in the search field
   * press enter on your keyboard
   * observe the result you got on the search page
   
   __Actual Result__
  
  Currently, when the keyword "aksesoari" is entered, a page with the product Dress is obtained - https://rs.extremeintimo.com/kolekcija/zene/e21k-62e103-zenska-haljina
   
   __Expected result__
   
   It should return a search page with all products belonging to the category "aksesoari"

__I say once again that I haven't read the documentation, but in my opinion this is a serious bug.__
