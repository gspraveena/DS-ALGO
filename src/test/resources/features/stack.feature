@stack
Feature:  Stack page
Scenario Outline: user navigate to Stack page and works on Operations in Stack
	Given user login with username "Numphysdet94NN" and password "sdet94batchNN"
	Given user clicks "Get started"  in Stack field  
    When  user click "Operations in Stack" first link  in the Stack
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
            
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Implementation Stack	
	Given user is in Stack homepage 
	When  user click "Implementation Stack" second link  in the Stack
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
        
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Applications	
	Given user is in Stack homepage 
	When  user click "Applications" third link in the Stack 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed  
    And   user navigate to homepage  
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |