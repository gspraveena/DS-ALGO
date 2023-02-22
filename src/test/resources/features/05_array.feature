#USING DATA DRIVEN THROUGH EXCEL FILE  AND HARDCODED USERNAME AND PASSSOWRD
@array
Feature:  Array page
Scenario Outline: user navigate to array page and works on Arrays in Python
	Given user login with username "Numphysdet94NN" and password "sdet94batchNN"
	Given user clicks "Get started"  in Array field  
    When  user click "Arrays in Python" first link  in the Array list 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed          
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	|pythonCode	    |1        |
Scenario Outline: user does Arrays Using List	
	Given user is in Array homepage 
	When  user click "Arrays Using List" second link  in the Array list 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed        
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	|pythonCode	    |1        |
Scenario Outline: user does Basic operations in Lists	
	Given user is in Array homepage 
	When  user click "Basic Operations in Lists" third link in the Array list 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed    
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	|pythonCode	    |1        |
Scenario Outline: user does Applications of Array	
	Given user is in Array homepage 
	When  user click "Applications of Array" fourth link in the Array list
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
    And   user navigate to homepage   
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	|pythonCode	    |1        |