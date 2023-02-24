#USING DATA DRIVEN THROUGH EXCEL FILE 
@signIn
Feature:  DS ALGO Sign In
	@signIn
    Scenario Outline: user navigate to sign in  page
  	Given user launches login page 
  	When user login using username and password from given "<SheetName>" and <rownumber>    	
    Examples:
	|sheetName  |rownumber|
	|Sheet1		|0		  |
	|Sheet1		|1        |
	|Sheet1		|2		  |
	|Sheet1		|3        |
	|Sheet1		|4		  |
	|Sheet1		|5        |
	|Sheet1		|6        |
	|Sheet1		|7        |