package ideastoexplore;

public class A {
	
	String name;
	
	A(){
		System.out.println("Parameterless / default parameter");
	};
	
	A(String name){
		this();
		this.name = name;
		System.out.println("Parameterized constructor");
		System.out.println(name);
	}

}
