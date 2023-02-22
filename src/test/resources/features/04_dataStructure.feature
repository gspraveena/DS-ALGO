@dataStructure
Feature: DataStructure page
# USING CONFIG READER TO READ USERNAME AND PASSWORD FROM CONFIG.PROPERTIES,CONSTANTS    ,DATADRIVEN USING EXCEL FILE 
	@dataStructure
	Scenario Outline: user navigate to datastructure page
	Given user login with username "USERNAME" and password "PASSWORD" given through config
 	Given user launch datastructure page  
    When  click on timecomplexity ,tryHere and tryEditor assessment page is open 
    Then  user enters code from <sheetNumber> and <rownumber> then click run , code is printed    
    Then  user navigate to homepage
    Examples:
    |sheetNumber  |rownumber|
	|1 	          |0		|
	|1	          |1        |
   				 
      
	