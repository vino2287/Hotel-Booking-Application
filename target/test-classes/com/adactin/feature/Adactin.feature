Feature: Hotel Booking Functionality 

Background: User want to login the application 
	Given User launch the adactin application 
	When User enter the "vinovicky" valid username 
	And User enter the "GMN630" valid password 
	Then User validate the username and password 
	
	
Scenario Outline: User want to login the application 
	Given User launch the adactin application 
	When User enter the "<Username>" valid username 
	And User enter the "<Password>" valid password 
	Then User validate the username and password 
	
	Examples: 
		|Username|Password|
		|AAA|111|
		|BBB|222|
		|CCC|333|
		
@Login 
Scenario: User want to login the application 
	Given User launch the adactin application 
	When User enter the "vinovicky" valid username 
	And User enter the "GMN630" valid password 
	Then User validate the username and password