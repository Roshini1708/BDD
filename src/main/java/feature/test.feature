@borland
Feature: Demo Borland
@GMOonline 
Scenario Outline: Enter GMO online
Given I Launch Borland url
When I verify page title "Welcome to Green Mountain Outpost"
Then I Click on Enter GMO Online button
Then I Enter Order Quantity for "<Item number>" as "<Quantity>"
Then I Click on Place An Order button  
Then I verify page title "Place Order"

Examples:
	|Item number | Quantity|
	|1002 		 |	20	   |
	|1004		 |	30	   |

@AboutGMO
Scenario: Enter About the GMO site
Given I Launch Borland url
When I Click on About The GMO Site button 
Then I verify page title "About This Site"

@Entergmo
Scenario: Entergmo
Given I launch Borland URL
When I Click on Enter GMO online button in GMO online page
Then I Enter quantity as "10" in Onlinecatlog page

