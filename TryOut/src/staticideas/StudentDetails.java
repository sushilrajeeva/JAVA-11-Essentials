package staticideas;


class StudentDetails{  
     String name;  
     
     //static variable
     static String department;  
     static int rollCount=0;  
     
     //static block is used to initialize static variable
     static{
    	 System.out.println("Inside Static Block");
    	 department="CS";
     }
     
     //static method to change the value of static variable  
     static void change(){
    	 rollCount++;
     }
          
     //constructor to initialize the variable  
     StudentDetails(String studentName){  
	     change();
	     name = studentName;  
     }  

     //method to display values  
     void display(){
    	 System.out.println(rollCount+" "+name+" "+department);
     }
     
}  

 
