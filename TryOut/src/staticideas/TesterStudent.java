package staticideas;

//Test class to create and display the values of object  
class TesterStudent{
	
  public static void main(String args[]){  
  	   
		    StudentDetails student1 = new StudentDetails("Tom");  
		    student1.display();
		    StudentDetails student2 = new StudentDetails("Chris");  
		    student2.display();  
		    StudentDetails student3 = new StudentDetails("Morris");  
		    student3.display(); 
		    
		     
		   	    
		    //We can change the value of static variable department as shown below
		    //Display student4 object with ECE department 
		    //Uncomment the code given below to perform the task
		      StudentDetails student4 = new StudentDetails("Cherry");  
		      StudentDetails.department="ECE";
		      student4.display();
  }  
} 