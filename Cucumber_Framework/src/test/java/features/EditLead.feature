Feature: Edit Lead in a Leaftabs Application

Background:
Given Load URL 'http://leaftaps.com/opentaps/control/main'
When Type Username as 'DemoSalesManager'
And Type Password as 'crmsfa'
And Click Login Button
And Verify Login is Successfull
And Click the link CRM SFA
And Click on Leads tab

Scenario Outline:  Edit Lead by Phone Number
When Click Find Lead
And Click Phone Tab
And Type Phone Number as <phoneNumber>
And Click FindLeads Button
And Click FirstMatching Result

Examples:
|phoneNumber|
|9|
|99|