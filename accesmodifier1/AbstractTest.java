package accesmodifier1;

public class AbstractTest extends Abstarct {
	
	//calling of abstract method then extends required

	
	
	public static void main(String[] args) {
		
		AbstractTest t1 = new AbstractTest();
		
		t1.editInformation();
		t1.uploadImage();
		t1.loginPage();
		t1.homePage();
	}

	
	public void editInformation() {
		System.out.println("print edit information method");
		
	}

	
	public void uploadImage() {
		System.out.println("print upload image method");
		
	}



}
