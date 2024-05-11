Feature: Login to Leaftabs Application

@smoke
Scenario: Login (Positive)

Given Load URL 'http://leaftaps.com/opentaps/control/main'
And Type Username as 'DemoSalesManager'
And Type Password as 'crmsfa'
And Click Login Button
Then Verify Login is Successfull

Scenario: Login (Negative)
Given Load URL 'http://leaftaps.com/opentaps/control/main'
And Type Username as ''
And Type Password as 'crmsfa'
And Click Login Button
Then Verify Login Failed with error 'username was empty reenter'

Scenario: Login (Negative 2)
Given Load URL 'http://leaftaps.com/opentaps/control/main'
And Type Username as 'DemoSalesManager'
And Type Password as ''
And Click Login Button
Then Verify Login Failed with error 'password was empty reenter'