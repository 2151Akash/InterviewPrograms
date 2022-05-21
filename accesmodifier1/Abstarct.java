package accesmodifier1;

public abstract class Abstarct

    {
	
	//int abstract a=10;  we can not define variable as abstract

	// when abstract method present in class then must be class name give as abstract
	
	public void loginPage()
	{
		System.out.println("Login method from abstract class");
	}
	
	public void homePage()
	{
		System.out.println("home page method from abstract class");
	}
	
	public abstract void editInformation();
		
		//incomplete method thats why we give abstract key world
		
	
	
	public abstract void uploadImage();
		
		//incomplete method
		
	//abstrCT Concept not applicable to variable
	//and we can not take static method as abstract in abstract class because static method cannot follow overriding 
	
	

}






