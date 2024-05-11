Feature: Login to Leaftabs Application

Background:
Given Load URL 'http://leaftaps.com/opentaps/control/main'

Scenario Outline: Login Multiple Data

When Type Username as <username>
And Type Password as <password>
And Click Login Button
Then Verify Login is Successfull

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|

Scenario Outline: Login (Negative)

When Type Username as <username>
And Type Password as <password>
And Click Login Button
Then Verify Login Failed with error <Errormessage>

Examples:
|username|password|Errormessage|
||crmsfa|username was empty reenter|

Scenario Outline: Login (Negative 2)

When Type Username as <username>
And Type Password as <password>
And Click Login Button
Then Verify Login Failed with error <Errormessage>

Examples:
|username|password|Errormessage|
|DemoSalesManager||password was empty reenter|
