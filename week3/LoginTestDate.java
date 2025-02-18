package week3;

public class LoginTestDate extends TestData {
	public void enterUserName() {
		System.out.println("Enter User Name");
	}
	public void enterPassword() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestDate ltd = new LoginTestDate();
		ltd.enterCredentials();
		ltd.enterUserName();
		ltd.enterPassword();
		ltd.navigateToHomePage();
	}

}
