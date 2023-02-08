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
@tag
Feature:  sign in page

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
	
	@array
	Scenario Outline: user navigate to array page
 	Given user clicks "Get started"  in Array field  
    When  user click "Arrays in Python" 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed    
    And   user navigate to homepage
    
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|2 		  |
	|pythonCode	    |3        |
     

	
	
		
   