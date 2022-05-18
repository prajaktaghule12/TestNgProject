package PkgPomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {
	//1.Declaration
	//2.Initialization-->initelements method
	//3.Usage
	
	//declaration
	@FindBy(xpath="//img[@alt=\"Facebook\"]")private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']")private WebElement already_acc;
	@FindBy(xpath="//a[text()='Sign Up']")private WebElement signuplink;
    @FindBy(name= "firstname")private WebElement firstname;
    @FindBy(name= "lastname")private WebElement surname;
    @FindBy(name="reg_email__")private WebElement mob_email;
    @FindBy(name="reg_passwd__")private WebElement passward;
    @FindBy(name="birthday_day")private WebElement birthday;
    @FindBy(name="birthday_month")private WebElement birthmonth;
    @FindBy(name="birthday_year")private WebElement birthyear;
    @FindBy(xpath="//input[@value=\"2\"]")private WebElement gender_male;
    @FindBy(xpath="//input[@value=\"-1\"]")private WebElement gender_female;
    @FindBy(name="websubmit")private WebElement submitbtn;
    
    
    //initialization--->declare class constructor with public access
    public RegistrationPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    //usage
    public void clickFacebookSignupLink()
    {
    	signuplink.click();
    	Reporter.log("Signup Successful");
    	
    }
    public void verifyRegistrationPageFblogo() {
    Assert.assertTrue(reg_fblogo.isDisplayed(),"The Facebook logo on Registration page is not displayed");
    Reporter.log("Registration Successful");  
    }
    public void verifyRegistrationPageAlreadyAccount()
    {
    	Assert.assertTrue(already_acc.isDisplayed(),"already have account is not displayed");
        Assert.assertEquals(already_acc.getText(),"Already have an account?");
        
    }
    public void setRegistrationPageFirstName()
    {
    	firstname.sendKeys("Samanyu");
    }
    public void setRegistrationPageLastName()
    {
    	surname.sendKeys("Dongare");
    }
    public void setRegistrationPageMobileEmail()
    {
    	mob_email.sendKeys("123456789");
    }
    public void setRegistrationPagePassward()
    {
    	passward.sendKeys("prajaktaghule12@123");
    }
    public void setRegistrationPageBirthday()
    {
    Assert.assertTrue(birthday.isDisplayed(), "Birthday Is Not Displayed");	
    Assert.assertFalse(birthday.isSelected());
    Select bday=new Select(birthday);
    bday.selectByVisibleText("10");
    
  }
    public void setRegistrationPageBirthMonth()
    {
    	Assert.assertTrue(birthmonth.isDisplayed(), "birthmonth Is Not Displayed");	
        Assert.assertFalse(birthmonth.isSelected());
        Select bday=new Select(birthmonth);
        bday.selectByVisibleText("Jun");
    }
    public void setRegistrationPageBirthYear()
    {
    	Assert.assertTrue(birthyear.isDisplayed(), "birthyear Is Not Displayed");	
        Assert.assertFalse(birthyear.isSelected());
        Select bday=new Select(birthyear);
        bday.selectByVisibleText("2014");
    }
    public void setRegistrationPageGender(String gender)
    {
    	if(gender.equalsIgnoreCase("male"))
    	{
    		gender_male.click();
    	}
    	else if(gender.equalsIgnoreCase("Female"))
    	{
    	gender_female.click();	
    	}
//    	else
//    	{
//    		System.out.println("Invalid Gender");
//    	}
    }
    public void clickRegistrationPageSubmitBtn()
    {
    	submitbtn.click();
    }
    
    
    
    
    




}