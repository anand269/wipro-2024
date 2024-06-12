Feature: Login to HRM Application

Scenario Outline: Login with valid credentials
   Given User is on HRMLogin page
   When User enters username as "<username>" and "<password>"
   Then User should be able to login successfully and home page is displayed
   
 Examples: 
     | username | password |
     | test     | test123  | 
     | Admin    |admin123  |  