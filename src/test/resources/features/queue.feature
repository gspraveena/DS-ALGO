@queue
Feature:  Queue page
Scenario Outline: user navigate to Queue page and works on Implementation Queue in Python
	Given user login with username "Numphysdet94NN" and password "sdet94batchNN"
	Given user clicks "Get started"  in Queue field  
    When  user click "Implementation Queue in Python" first link  in the Queue
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
            
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Implementation Using Collection.deque	
	Given user is in Queue homepage 
	When  user click "Implementation Using Collection.deque" second link  in the Queue
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
        
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Implementation Using Array	
	Given user is in Queue homepage 
	When  user click "Implementation Using Array" third link in the Queue 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed  
    And   user navigate to homepage  
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Queue Operations	
	Given user is in Queue homepage 
	When  user click "Queue Operations" fourth link in the Queue 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed  
    And   user navigate to homepage  
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |