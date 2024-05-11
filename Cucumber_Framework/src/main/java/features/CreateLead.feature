Feature: Create Lead in a Leaftabs Application

Background:
Given Load URL 'http://leaftaps.com/opentaps/control/main'
When Type Username as 'DemoSalesManager'
And Type Password as 'crmsfa'
And Click Login Button
And Verify Login is Successfull
And Click the link CRM SFA
And Click on Leads tab

Scenario Outline:  Create a new Lead with Mandatory Fields
And Click Create Lead
And Enter the Company Name as <cName>
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
Then Click the Submit Button
And Verify the lead is Created

Examples:
|cName|fName|lName|
|TestLeaf|Karthik|Palanisamy|
|TestL|Keyan|PK|