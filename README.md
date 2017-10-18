# WebDriver Cucumber-JVM POI


## WebDriver

WebDriver is a tool for automating web application testing, and in particular to verify that they work as expected. It aims to provide a friendly API that's easy to explore and understand, easier to use than the Selenium-RC (1.0) API, which will help to make your tests easier to read and maintain.API - https://www.w3.org/TR/webdriver/

## Apache-POI

Apache POI, a project run by the Apache Software Foundation, and previously a sub-project of the Jakarta Project, provides pure Java libraries for reading and writing files in Microsoft Office formats, such as Word, 
PowerPoint and Excel. Apache-POI API - https://poi.apache.org/apidocs/

## Cucumber-JVM

Cucumber-JVM is a Cucumber implementation for the most popular JVM languages.  This document is the reference for features that are specific to Cucumber-JVM.  Please see the general reference for features that are common to all Cucumber implementations.

![alt text](https://goo.gl/kC61fA)


## Story

Feature: There was a problem

###### Given I am on 'Driving and transport' page
###### When I click 'Get vehicle information from DVLA'
###### Then I am directed to 'Confirm Vehicle'
###### And Registration number is ''
###### And 'Make' is ''
###### And 'Colour' is


###### Feature: There was a problem

###### Given I am on 'Driving and transport' page
###### And I click 'Get vehicle information from DVLA'
###### And I Click 'Continue' 
###### Then I am shown 'There was a problem'
###### And I am shown 'Please amend the following details:'
###### And I am shown 'Select an option' link