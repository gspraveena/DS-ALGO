#USING HARDCODED USERNAME AND PASSWORD AND DATA DRIVEN USING EXCEL FILE 
@linkedlist
Feature:  Linked List page
Scenario Outline: user navigate to Linked List page and works on Introduction on Linked List
	Given user login with username "Numphysdet94NN" and password "sdet94batchNN"
	Given user clicks "Get started"  in Linked List field  
    When  user click "Introduction" first link  in the list 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed          
    Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Creating Linked List	
	Given user is in Linked List homepage 
	When  user click "Creating Linked List" second link  in the Linked list
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed        
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Types of Linked Lists	
	Given user is in Linked List homepage 
	When  user click "Types of Linked Lists" third link in the Linked list 
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed    
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
Scenario Outline: user does Implement Linked List in Python	
	Given user is in Linked List homepage 
	When  user click "Implement Linked List in Python" fourth link in the Linked list
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
      
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
	Scenario Outline: user does Traversal	
	Given user is in Linked List homepage 
	When  user click "Traversal" fifth link in the Linked list
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
     
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
	Scenario Outline: user does Insertion	
	Given user is in Linked List homepage  
	When  user click "Insertion" sixth link in the Linked list
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
      
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	
	Scenario Outline: user does Deletion	
	Given user is in Linked List homepage  
	When  user click "Deletion" seventh link in the Linked list
    Then  user clicks "Try here"   
    Then  user enters code in tryEditor from "<sheetName>" and <rownumber>  then click run , output is printed 
    And   user navigate to homepage   
     Examples:  
	|sheetName      |rownumber|
	|pythonCode		|0 		  |
	