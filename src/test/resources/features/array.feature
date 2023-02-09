@tag
Feature:  Array page
Scenario Outline: user navigate to array page
	Given user login with username "Numphysdet94NN" and password "sdet94batchNN"
	Given user clicks "Get started"  in Array field  
    When  user click "Arrays in Python" 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed    
    And   user navigate to homepage
    
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	|pythonCode	    |1        |