package testCases;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonFunctions.CommonFunctions;
import pageObjects.ManageFaculty_List_Page_Objects;
import pageObjects.ProblemBank_List_Page_Objects;

public class ProblemBank_List extends CommonFunctions{
	
	static Logger logger = Logger.getLogger(ProblemBank_List.class);
	
	@Test(priority = 0)
	public void ProblemBankMenu() throws InterruptedException, IOException
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank List Page");
		PageFactory.initElements(driver, ProblemBank_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Problem Bank List");
		ProblemBank_List_Page_Objects.PBMenu.click();
		Thread.sleep(2000);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ProblemBankList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ProblemBankList.png");
	}
	
	@Test(priority = 1)
	public void Verifysort() throws InterruptedException
	{
		extenttestCase.log(Status.INFO,"Verifying Sorting Functionality in Problem Bank List");

		ProblemBank_List_Page_Objects.SortSName.click();
		Thread.sleep(1000);
		ProblemBank_List_Page_Objects.SortSCity.click();
		Thread.sleep(1000);
		ProblemBank_List_Page_Objects.SortBDomain.click();
		Thread.sleep(1000);

	}
	
	@Test(priority = 2)
	public void VerifyInvalidSearch() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Invalid Search in Problem Bank List");

		ProblemBank_List_Page_Objects.SearchField.sendKeys(getExcelData("PBankList", 1, 1));
		Thread.sleep(2000);

		String ListWarn =  ProblemBank_List_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Invalid Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Invalid Search Validation Failed");
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);

	}
	
	@Test(priority = 3)
	public void VerifyValidSearchStation() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Station Name Search in Problem Bank List");
		
		ProblemBank_List_Page_Objects.SearchSelect.sendKeys(getExcelData("PBankList", 2, 0));
		Thread.sleep(2000);

		ProblemBank_List_Page_Objects.SearchField.sendKeys(getExcelData("PBankList", 2, 1));
		Thread.sleep(2000);
		
		ProblemBank_List_Page_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 2, 2));
		Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 2, 4));
		//Thread.sleep(2000);

		String SNameResult = ProblemBank_List_Page_Objects.SNameResult.getText();
		System.out.println(SNameResult);
		
		
		Thread.sleep(2000);
		if(SNameResult.contentEquals(getExcelData("PBankList", 2, 1)))
		{
			extenttestCase.log(Status.PASS, "Station Name Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Station Name Search Validation Failed");
		}
		Thread.sleep(2000);
		ProblemBank_List_Page_Objects.SearchField.clear();
	}
	
	@Test(priority = 4)
	public void VerifyCity() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying City Search in Problem Bank List");
		Thread.sleep(2000);
		ProblemBank_List_Page_Objects.SearchSelect.sendKeys(getExcelData("PBankList", 3, 0));
		Thread.sleep(2000);

		ProblemBank_List_Page_Objects.SearchField.sendKeys(getExcelData("PBankList", 3, 1));
		Thread.sleep(2000);
		
		ProblemBank_List_Page_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 3, 3));
		Thread.sleep(2000);
		
		ProblemBank_List_Page_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 3, 2));
		Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 3, 5));
		//Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 3, 4));
		//Thread.sleep(2000);

		String CityResult = ProblemBank_List_Page_Objects.CityResult.getText();
		System.out.println(CityResult);
		
		Thread.sleep(2000);
		if(CityResult.contentEquals(getExcelData("PBankList", 3, 1)))
		{
			extenttestCase.log(Status.PASS, "City Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "City Search Validation Failed");
		}
		Thread.sleep(2000);
		ProblemBank_List_Page_Objects.SearchField.clear();
	}

	@Test(priority = 5)
	public void VerifyBDomain() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Verifying Business Domain Search in Problem Bank List");
		Thread.sleep(2000);
		ProblemBank_List_Page_Objects.SearchSelect.sendKeys(getExcelData("PBankList", 4, 0));
		Thread.sleep(2000);

		ProblemBank_List_Page_Objects.SearchField.sendKeys(getExcelData("PBankList", 4, 1));
		Thread.sleep(2000);
		
		ProblemBank_List_Page_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 4, 3));
		Thread.sleep(2000);
		
		ProblemBank_List_Page_Objects.SearchPSType.sendKeys(getExcelData("PBankList", 4, 2));
		Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 4, 5));
		//Thread.sleep(2000);
		
		//ProblemBank_List_Page_Objects.SearchPSBatch.sendKeys(getExcelData("PBankList", 4, 4));
		//Thread.sleep(2000);

		String BDResult = ProblemBank_List_Page_Objects.BDResult.getText();
		System.out.println(BDResult);
		
		Thread.sleep(2000);
		if(BDResult.contentEquals(getExcelData("PBankList", 4, 1)))
		{
			extenttestCase.log(Status.PASS, "Business Domain Search Validation Done Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Business Domain Search Validation Failed");
		}
		Thread.sleep(2000);
		ProblemBank_List_Page_Objects.SearchField.clear();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
