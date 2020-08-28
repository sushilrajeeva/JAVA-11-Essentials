package ideastoexplore;

public class B {
	
	String name;
	
	B(){
		this.name = "Default";
		System.out.println("Parameterless / default parameter");
	};
	
	B(String name){
		//this();
		this.name = name;
		System.out.println("Parameterized constructor");
		System.out.println(name);
		
	}

}