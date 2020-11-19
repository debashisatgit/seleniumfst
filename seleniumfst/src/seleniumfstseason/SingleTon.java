package seleniumfstseason;

public class SingleTon {
	
	// a single ton class is class that can have only and only one obj or instance of the class at a time
	// how to design a single ton class 
	//1. constructor should be private
	//2. write a public static method(getInstance) that have return type of obj of this single ton class
	
	private static SingleTon singleton_instance = null;    // private the reference of that class
	
	public String str ;
	
	private SingleTon() {              // cunstructor of the class as private
		str = "value will be = "+"Using singleton class";
		
	}
	
	public static SingleTon getInstance() {
		if(singleton_instance == null) 
			singleton_instance = new SingleTon();
			
		return singleton_instance;
	}

	public static void main(String[] args) {
		
		SingleTon x = SingleTon.getInstance();
		SingleTon y = SingleTon.getInstance();
		SingleTon z = SingleTon.getInstance();
		
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		
		
		
		

	}

}
