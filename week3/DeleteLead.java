package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		WebElement findLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead.click();
		WebElement phone = driver.findElement(By.xpath("//span[text()='Phone']"));
		phone.click();
		WebElement phoneNum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		phoneNum.sendKeys("123456");
		WebElement findLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads.click();
		Thread.sleep(2000);
		WebElement firstLead = driver.findElement(By.xpath("((//div[text()='Phone Number']//ancestor::tr)/following::tr/td[1]/div/a)[1]"));
		String leadID = firstLead.getText();
		firstLead.click();
		WebElement deleteBt = driver.findElement(By.xpath("//a[text()='Delete']"));
		deleteBt.click();
		Thread.sleep(2000);
		WebElement findLead2 = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		findLead2.click();
		WebElement leadID_search = driver.findElement(By.xpath("//input[@name='id']"));
		leadID_search.sendKeys(leadID);
		WebElement findLeads2 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads2.click();
		Thread.sleep(2000);
		WebElement getMsg = driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println("No records to display msg is shown : " + getMsg.isDisplayed()); 
		driver.close();
	}

}
