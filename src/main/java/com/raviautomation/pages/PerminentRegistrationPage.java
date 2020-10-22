package com.raviautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.raviautomation.testbase.TestBase;

public class PerminentRegistrationPage extends TestBase {
	
	
	@FindBy(xpath = "//div[@class ='border']/h3/span")
	public WebElement permanentRegistrationBorderText;
	
	
	@FindBy(name = "PATIENT_CAT")
	public WebElement patientCategory;
	
	@FindBy(name = "RELATION")
	public WebElement relation;
	
	@FindBy(name = "TITLE")
	public WebElement title;
	
	
	@FindBy(name = "MOTHER_NAME")
	public WebElement motherMaidenName;
	
	
	@FindBy(name = "PNT_NAME")
	public WebElement firstName;
	
	
	@FindBy(name = "MIDDLE_NAME")
	public WebElement middleName;
	
	@FindBy(name = "LAST_NAME")
	public WebElement lastName;
	
	@FindBy(name = "DOB")
	public WebElement dob;
	
	@FindBy(name = "AGE")
	public WebElement age;
	
	@FindBy(name = "SEX")
	public WebElement gender;
	
	@FindBy(name = "MTRL_STATUS")
	public WebElement maritalStatus;
	
	@FindBy(name = "RELIGION")
	public WebElement religion;
	
	
	@FindBy(name = "PLANGUAGE")
	public WebElement primaryLanguage;
	
	
	@FindBy(name = "PAT_IDENTITY")
	public WebElement patientIdentifier;
	
	
	@FindBy(name = "PAT_IDENTITY_PROOF")
	public WebElement patIdentityProof;
	
	
	@FindBy(name = "NATIONALITY")
	public WebElement nationality;
	
	
	@FindBy(name = "IS_MLC")
	public WebElement vip;
	
	
	@FindBy(name = "EDUCATION")
	public WebElement education;
	
	
	@FindBy(name = "OCCUPATION")
	public WebElement occupation;
	
	
	@FindBy(name = "BLOOD_GRP_CODE")
	public WebElement bloodGroup;
	
	
	@FindBy(name = "CITIZENSHIP")
	public WebElement citizenship;
	
	@FindBy(name = "SC_PROOF")
	public WebElement seniorCitizenProofSubmited;
	
	
	@FindBy(name = "ADDRESS1")
	public WebElement address1;
	
	@FindBy(name = "ADDRESS2")
	public WebElement address2;
	
	@FindBy(name = "MOBILE_NO")
	public WebElement phone;
	
	@FindBy(name = "MOBILE_NO")
	public WebElement email;
	
	@FindBy(name = "COUNTRY_CODE")
	public WebElement country;	
	
	
	@FindBy(name = "ZIP")
	public WebElement pinOrZip;	
	
	
	
	@FindBy(name = "submit")
	public WebElement save;	
	
	
	@FindBy(xpath = "//td/input[@type='reset' and @value ='Clear']")
	public WebElement clear;	
	
	public PerminentRegistrationPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
}
