package com.Upright;

public class InterviewQuestionAnswer {
 /*  1.	How do you decide which part you have to automate? Or which test cases are good for automation candidate?

            ●	Test cases from the stable part of the application
●	Test cases that are critical to the business
●	Test cases that need so much time to execute manually
●	Test cases that need huge effort to work manually
●	Test case executed with different sets of data.
            ●	Test case executed with different browsers.
            ●	Test case executed with different environments.
            ●	Test case executed with complex business logic
●	Test case involves a large amount of data
●	Test case has any dependency



2.	What is your first step when you go for automation?
    Before going to automation, we need to select the stable part of the story/feature and need to analyze what positive testing we can implement here. We create automation test data and select the validation point.



            3.	How to handle web-based popup (alert)
driver.switchto().Alert().accept();
 driver.switchto().Alert().gettext();
driver.switchto().Alert().dismiss();



4.	How many ways you can select the dropdown element?
            ●	SelectbyIndex()
●	SelectbyVisibletext()
●	SelectbyValue()



5.	When web element is not visible on the screen what do you then?

    I use isDisplayed() method to verify the presence of the webelment in the webpage.



            6.	What are the selenium navigation command?
            driver.navigate().to("https://uprightforum.tech");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();


7.	What are the differences between driver.get() vs driver.navigate()?


    Driver.get will wait until the page is loaded	Driver.navigate() won’t wait.
    Driver.get don’t have browser history	Driver.navigate will have browser history
    Driver.get don’t have back, forward command	Driver.navigate has back, forward, refresh command




8.	Difference between driver.close() and driver.quit().
            Driver.close() will close the current browser opened by Selenium Webdriver.

            Driver.quit() will close all the browsers opened by Selenium Webdriver as well as close the  driver from the background process.



9.	Difference between verifying vs assert?
    Verify is used to provide the condition using which we proceed.  Example -- Soft assert will throw a message and proceed. Also if-else statement does the same.

    Assert or Hard Assert will stop the execution. It will fail the test and will not process. That means it will stop the execution.


10.	Difference between driver.find element vs Driver.findElements().
            Driver.findElement() will return single webelement whereas Driver. findElements() will return a list of Webelements that matches the xpaths and can be speicified one webelement using index.

            11.	What kind of exceptions you may encounter from findelement and findelements?
    The findElement method throws a NoSuchElementException exception when the element is not available on the page.

    Whereas, the findElements method returns an empty list when the element is not available


12.	Difference between implicit vs explicit wait

    i. Implicitly wait -- Implicitly wait means that it will wait a certain period(lets say 20 sec)
    before throwing any exception whenever the class is extended.
    An implicit wait is a global setting that applies to all elements in a Selenium script. It waits a specified time before throwing an exception if the element is not found. We can set the wait once per session and can't change it later. The default value is 0
    Syntax : driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

    ii. explicitly wait
    a. WebDriver Wait --- explicitly wait (WebDriver Wait and Fluent wait) means that it will wait a certain period(lets say 20 sec) before throwing any exception only on a particular element. it will give a timeout exception where it tries for the expected conditions every 500 millisecond interval. this is called polling time.

    13.	Advantage of Selenium

A)	It’s a free software open-source testing tool.
B)	It supports multiple browsers and multiple languages
C)	Selenium provides high tester flexibility to write scripts for advanced and complex testcases.
D)	Supports test case execution on multiple operation systems.
E)	We get the latest updated versions as per the market needs
F)	Reusability and addons
G)	Easy to implement
H)	Selenium supports web, mobile.

14.	Disadvantage/challenges of selenium

●	Selenium doesn’t support automation of the desktop applications.
●	Selenium doesn’t support inbuilt reporting we need to import separate libraries to implement.
●	Doesn’t support captcha, OTP and images automation.
●	Doesn’t support upload functionality.
●	Support is not available since this is a free tool.
●	It takes more time to create scripts in selenium.
●	Sometimes becomes hard to handle dynamic element
●	We need to change the updated driver each time browser updated.

15.	What are the components of Selenium?

Selenium has four major components – Selenium IDE, Selenium RC, Selenium Web driver, Selenium GRID.

16.	Which version of Selenium you have used
Version 3.141.59

17.	What are the List of locators ?
o	Id
o	Name
o	Class
o	Linktext
o	Partial link text
o	Xpath
o	Css

18. Why use XPath?
●	if the elements are not found by the general locators like ID, class, name, etc., then XPath is used to find an element on the web page

  */

}
