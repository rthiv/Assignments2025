package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginBt = driver.findElement(By.xpath("//input[@value='Login']"));
		loginBt.click();
		Thread.sleep(2000);
		WebElement crmIcon = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crmIcon.click();
		Thread.sleep(2000);
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		WebElement createLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		createLead.click();
		Thread.sleep(1000);
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Compant Name test");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Aarthi");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("V");
		WebElement firstNamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNamelocal.sendKeys("rt");
		WebElement department = driver.findElement(By.id("createLeadForm_departmentName"));
		department.sendKeys("department test");
		WebElement description = driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("description test");
		WebElement phoneNumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phoneNumber.sendKeys("123456");
		WebElement email = driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("email@test.com");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvincedp = new Select(stateProvince);
		stateProvincedp.selectByVisibleText("Georgia");
		WebElement createLeadBt = driver.findElement(By.xpath("//input[@value='Create Lead']"));
		createLeadBt.click();
		Thread.sleep(2000);
		WebElement EditLead = driver.findElement(By.xpath("//a[text()='Edit']"));
		EditLead.click();
		WebElement updateDescription = driver.findElement(By.id("updateLeadForm_description"));
		updateDescription.sendKeys("update Description test");
		WebElement updateImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
		updateImportantNote.sendKeys("Update Important Note");
		WebElement updateBt = driver.findElement(By.xpath("//input[@value='Update']"));
		updateBt.click();
		Thread.sleep(2000);				
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
