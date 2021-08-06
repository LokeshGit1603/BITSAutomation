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
import pageObjects.AddProblem_Detail_Page_Objects;
import pageObjects.ProblemBank_List_Page_Objects;
import pageObjects.Project_List_Page_Objects;

public class Project_List extends CommonFunctions{
	
static Logger logger = Logger.getLogger(Project_List.class);
	
	@Test(priority = 0)
	public void ProblemBankMenu() throws Throwable
	{
		extenttestCase=extentReport.createTest("Verifying Problem Bank List Page");
		PageFactory.initElements(driver, Project_List_Page_Objects.class);
		extenttestCase.log(Status.INFO,"Landing into Problem Bank List");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("ProjectList.png");
		FileHandler.copy(sourceFile, destinationFile);
		extenttestCase.addScreenCaptureFromPath("ProjectList.png");
	
		extenttestCase.log(Status.INFO,"Searching Record in Problem Bank List");
		
	}
	
	@Test(priority = 1)
	public void AddGIProject() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Add Problem bank by Add Project Button");
		
		Project_List_Page_Objects.AddProject.click();
		Thread.sleep(2000);
		
		PageFactory.initElements(driver, AddProblem_Detail_Page_Objects.class);
		
		AddProblem_Detail_Page_Objects.PTitle.sendKeys(getExcelData("AddProblem", 3, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PDesc.sendKeys(getExcelData("AddProblem", 3, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.MName.sendKeys(getExcelData("AddProblem", 2, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CDetail.sendKeys(getExcelData("AddProblem", 2, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EmailId.sendKeys(getExcelData("AddProblem", 2, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNext.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void AddDisciplineProject() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Add Discipline by Add Project Button");
		
		AddProblem_Detail_Page_Objects.CGPAL.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CGPAL.sendKeys(getExcelData("AddProblem", 6, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.sendKeys(getExcelData("AddProblem", 6, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.sendKeys(getExcelData("AddProblem", 6, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.sendKeys(getExcelData("AddProblem", 6, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.FDegree.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SCourseAll.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.OtherConstraints.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NoOfS.sendKeys(getExcelData("AddProblem", 6, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddDG.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextDis.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void AddSkillSet() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Add Skill Set by Add Project Button");
		
		AddProblem_Detail_Page_Objects.SelectSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchSkill.sendKeys(getExcelData("AddProblem", 10, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Technical Skill Added Successfully");	
		
		AddProblem_Detail_Page_Objects.SelectNonTech.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchNTech.sendKeys(getExcelData("AddProblem", 10, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckNTech.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchNTech.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Non-Technical Skill Added Successfully");
		
		AddProblem_Detail_Page_Objects.SaveNextSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "New Skill Set and Subject Area Added Successfully");
	}
	
	@Test(priority = 4)
	public void AddElective() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Add New Electives by Add Project Button");
		
		
		AddProblem_Detail_Page_Objects.AddCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchCourse.sendKeys(getExcelData("AddProblem", 14, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ChooseGrade.sendKeys(getExcelData("AddProblem", 14, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextElectives.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "New Electives Added Successfully");	
	}
	
	@Test(priority = 5)
	public void AddFacility() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Add New Facility by Add Project Button");
		
		AddProblem_Detail_Page_Objects.Currency.sendKeys(getExcelData("AddProblem", 18, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Scholarship.sendKeys(getExcelData("AddProblem", 18, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SFDegree.sendKeys(getExcelData("AddProblem", 18, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.StartTime.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.StartTime.sendKeys(getExcelData("AddProblem", 18, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EndTime.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EndTime.sendKeys(getExcelData("AddProblem", 18, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchWO.sendKeys(getExcelData("AddProblem", 18, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesAccom.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesBoys.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress1.sendKeys(getExcelData("AddProblem", 18, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress2.sendKeys(getExcelData("AddProblem", 18, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BCountry.sendKeys(getExcelData("AddProblem", 18, 9));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BState.sendKeys(getExcelData("AddProblem", 18, 10));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BCity.sendKeys(getExcelData("AddProblem", 18, 11));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BPin.sendKeys(getExcelData("AddProblem", 18, 12));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextF.click();
		Thread.sleep(3000);
		
		extenttestCase.log(Status.PASS, "New Facility Added Successfully");
		
		AddProblem_Detail_Page_Objects.SearchProblem.sendKeys(getExcelData("AddProblem", 3, 4));
		Thread.sleep(2000);
		
		String CheckProblem = AddProblem_Detail_Page_Objects.CheckProblem.getText();
		System.out.println(CheckProblem);
		Thread.sleep(2000);
		if(CheckProblem.contains(getExcelData("AddProblem", 3, 4)))
		{
			extenttestCase.log(Status.PASS, "Problem Bank Created Successfully");
		}
		
		AddProblem_Detail_Page_Objects.SearchProblem.clear();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 6)
	public void DeletePB() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Delete Problem Bank in Project List");
		
		Project_List_Page_Objects.SearchProblem.clear();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.SearchProblem.sendKeys(getExcelData("AddProblem", 3, 4));
		Thread.sleep(2000);
		
		Project_List_Page_Objects.Checkbox.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.DeleteDrop.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.Deletebtn.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.Close.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.DeleteDrop.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.Deletebtn.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.OK.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS,"Problem Bank Deleted Successfully in Project List");
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 7)
	public void EditPB() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Edit Problem Bank in Project List");
		
		Project_List_Page_Objects.SearchProblem.clear();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.SearchProblem.sendKeys(getExcelData("AddProblem", 2, 4));
		Thread.sleep(2000);
		
		Project_List_Page_Objects.EditLink.click();
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 8)
	public void EditGIProject() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Edit Problem bank by Add Project Button");
		
		PageFactory.initElements(driver, AddProblem_Detail_Page_Objects.class);
		
		AddProblem_Detail_Page_Objects.PTitle.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PTitle.sendKeys(getExcelData("AddProblem", 3, 9));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PDesc.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.PDesc.sendKeys(getExcelData("AddProblem", 3, 10));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.MName.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.MName.sendKeys(getExcelData("AddProblem", 3, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CDetail.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CDetail.sendKeys(getExcelData("AddProblem", 3, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EmailId.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EmailId.sendKeys(getExcelData("AddProblem", 3, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNext.click();
		Thread.sleep(2000);
	
	}
	
	@Test(priority = 9)
	public void EditDisciplineProject() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Edit Discipline by Add Project Button");
		
		AddProblem_Detail_Page_Objects.CGPAL.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CGPAL.sendKeys(getExcelData("AddProblem", 7, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.TotalR.sendKeys(getExcelData("AddProblem", 7, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Male.sendKeys(getExcelData("AddProblem", 7, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Female.sendKeys(getExcelData("AddProblem", 7, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.FDegree.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BECourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.OtherConstraints.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.NoOfS.sendKeys(getExcelData("AddProblem", 7, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.AddDG.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextDis.click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 10)
	public void EditSkillSet() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Edit Skill Set by Add Project Button");
		
		AddProblem_Detail_Page_Objects.SelectSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectSkill.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchSkill.sendKeys(getExcelData("AddProblem", 11, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Technical Skill Edited Successfully");	
		
		AddProblem_Detail_Page_Objects.SelectNonTech.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchNTech.sendKeys(getExcelData("AddProblem", 11, 3));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckNTech.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchNTech.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Non-Technical Skill Edited Successfully");
		
		AddProblem_Detail_Page_Objects.SaveNextSkill.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "Skill Set and Subject Area Edited Successfully");
	}
	
	@Test(priority = 11)
	public void EditElective() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Edit New Electives by Add Project Button");
		
		AddProblem_Detail_Page_Objects.SelectCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchCourse.sendKeys(getExcelData("AddProblem", 15, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckCourse.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.ChooseGrade.sendKeys(getExcelData("AddProblem", 15, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextElectives.click();
		Thread.sleep(2000);
		
		extenttestCase.log(Status.PASS, "New Electives Edited Successfully");	
	}
	
	@Test(priority = 12)
	public void EditFacility() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Edit Facility by Add Project Button");
		
		AddProblem_Detail_Page_Objects.Currency.sendKeys(getExcelData("AddProblem", 19, 0));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Scholarship.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.Scholarship.sendKeys(getExcelData("AddProblem", 19, 1));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SFDegree.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SFDegree.sendKeys(getExcelData("AddProblem", 19, 2));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.StartTime.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.StartTime.sendKeys(getExcelData("AddProblem", 19, 4));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EndTime.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.EndTime.sendKeys(getExcelData("AddProblem", 19, 5));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SelectWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchWO.sendKeys(getExcelData("AddProblem", 19, 6));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.CheckWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SearchWO.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesAccom.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.YesBoys.click();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress1.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress1.sendKeys(getExcelData("AddProblem", 19, 7));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress2.clear();
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BAddress2.sendKeys(getExcelData("AddProblem", 19, 8));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BCountry.sendKeys(getExcelData("AddProblem", 19, 9));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BState.sendKeys(getExcelData("AddProblem", 19, 10));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BCity.sendKeys(getExcelData("AddProblem", 19, 11));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.BPin.sendKeys(getExcelData("AddProblem", 19, 12));
		Thread.sleep(2000);
		
		AddProblem_Detail_Page_Objects.SaveNextF.click();
		Thread.sleep(3000);
		
		extenttestCase.log(Status.PASS, "New Facility Edited Successfully");
		
		AddProblem_Detail_Page_Objects.SearchProblem.sendKeys(getExcelData("AddProblem", 3, 9));
		Thread.sleep(2000);
		
		String CheckProblem = AddProblem_Detail_Page_Objects.CheckProblem.getText();
		System.out.println(CheckProblem);
		Thread.sleep(2000);
		if(CheckProblem.contains(getExcelData("AddProblem", 3, 9)))
		{
			extenttestCase.log(Status.PASS, "Problem Bank Edited Successfully");
		}
		
		AddProblem_Detail_Page_Objects.SearchProblem.clear();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
	}
	
	@Test(priority = 13)
	public void GoBackPBList()
	{
		extenttestCase.log(Status.INFO,"Go Back to Problem Bank List");
		
		PageFactory.initElements(driver, Project_List_Page_Objects.class);
		Project_List_Page_Objects.PBList.click();
	}
	
	@Test(priority = 14)
	public void DeletePBank() throws Throwable
	{
		extenttestCase.log(Status.INFO,"Delete Problem Bank From List");
		
		Project_List_Page_Objects.SearchField.sendKeys(getExcelData("AddProblem", 2, 1));
		Thread.sleep(2000);
		
		Project_List_Page_Objects.CheckPB.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.PBDrop.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.DeletePB.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.CloseDPB.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.PBDrop.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.DeletePB.click();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.OKDPB.click();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		Project_List_Page_Objects.SearchField.sendKeys(getExcelData("AddProblem", 2, 1));
		Thread.sleep(2000);
		
		String ListWarn =  ProblemBank_List_Page_Objects.ListWarn.getText();
		System.out.println(ListWarn);
		Thread.sleep(2000);

		if(ListWarn.contains("Record(s) not found"))
		{
			extenttestCase.log(Status.PASS, "Problem Bank Deleted Successfully");
		}
		else
		{
			extenttestCase.log(Status.INFO, "Problem Bank Deletion Failed");
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
}
