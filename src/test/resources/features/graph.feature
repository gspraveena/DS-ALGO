@graph
Feature:  Graph page
Scenario Outline: user navigate to Graph page and works on  Graph 
	Given user login with username "Numphysdet94NN" and password "sdet94batchNN"
	Given user clicks "Get started"  in Graph field  
    When  user click "Graph" first link  in the Graph
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
            
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Graph Representations	
	Given user is in Graph homepage 
	When  user click "Graph Representations" second link  in the Graph
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
    And   user navigate to homepage   
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |