package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SubmitElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcases
{
	@Test
	public void verifylogin() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\Desktop\\yadav.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		pom po=new pom(driver);
		po.loginpage("admin", "admin");
	}
		/*@DataProvider(name = "PAVAN" )
		public Object[][] getData()
		{
				ExcelDataProvider config= new ExcelDataProvider("C:\\Users\\new\\Desktop\\PAVAN.xlsx");
		
		int row=config.getRows("PAVAN");
		Object[][]data=new Object[row][2];
		for (int i = 0; i<row; i++)
		{
		   data[i][0]=config.getStringData("PAVAN", i,0);
		   data[i][1]=config.getStringData("PAVAN", i, 1);
		   }
				return data;
		}		*/
}

