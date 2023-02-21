#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#@tag2
#	Scenario Outline: user navigate to datastructure page
## (Comments)
#Sample Feature Definition Template
@page
Feature:  DS ALGO Collections Project

    @homePage
 	 Scenario: Opeing DS Algo portal link 
    Given  The user opens DS Algo portal link
    When   user clicks "Get Started" button
    Then   user should be redirected to the homepage and see 6 different collections
    Then   user click on the "Data Structures" dropdown arrow and sees 6 different collections
    And    user clicks any one collection from dropdown 
    And    user get alert message "you are not logged in"
    Then   user click on Data Structure "getstarted" button 
    And    user get alert message "you are not logged in"
    When   user clicks "Sign In" in homePage 
    Then  user is redirected to Sign In page 
   # Then  user click on register 

	@signIn
    Scenario Outline: user navigate to sign in  page
  	Given user launches login page 
  	When user login using username and password from given "<SheetName>" and <rownumber>    	
    Examples:
	|sheetName  |rownumber|
	|Sheet1		|0		  |
	|Sheet1		|1        |
	
	@dataStructure
	Scenario Outline: user navigate to datastructure page
 	Given user launch datastructure page  
    When  click on timecomplexity ,tryHere and tryEditor assessment page is open 
    Then  user enters code from <sheetNumber> and <rownumber> then click run , code is printed    
    Then  user navigate to homepage
    Examples:
    |sheetNumber  |rownumber|
	|1 	          |0		|
	|1	          |1        |
	
	
		
     

	
	
		
   