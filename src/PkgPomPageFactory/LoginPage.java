package PkgPomPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	//Declaration
	//Initialization
	//Usage
	
	//Declaration
	@FindBy(xpath="//img[@alt=\"Facebook\"]")private WebElement login_fblogo;
	@FindBy(xpath="//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]")private WebElement login_fbtagline;
	@FindBy(name="email")private WebElement username;
	@FindBy(name="pass")private WebElement password;
	@FindBy(xpath="//a[text()=\"Forgotten password?\"]")private WebElement forgot_password;
	@FindBy(name="login")private WebElement login_btn;
	@FindBy(xpath="//a[@data-testid=\"open-registration-form-button\"]")private WebElement createnew_account;
	@FindBy(xpath="//a[text()=\"Create a Page\"]")private WebElement createpage_link;
	@FindBys({ @FindBy(xpath="//*[@id=\"pageFooterChildren\"]/ul/li/a")})private List <WebElement> footer_links;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usages
	
	
	public void verifyFacebookLoginPageLogo()
	{
		Assert.assertTrue(login_fblogo.isDisplayed(),"Facebook Login Page Is Not Displyed");
	    Reporter.log("verifyFacebookLoginPageLogo",true);
	}
	public void verifyFacebookLoginPageTagline()
	{
		Assert.assertTrue(login_fblogo.isDisplayed(),"Facebook Login Page Is Not Displayed");
		Assert.assertEquals(login_fbtagline.getText(), null);
	    Reporter.log("VerifyFacebookLoginPage",true);
	}
	
	
//	public void verifyFacebookloginPageTitle()
//	{
//		Assert.assertTrue(login_fbtagline.isDisplayed(),"Facebook Login Page Tagline is not displayed");
//	    Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
//	    Reporter.log("verifyFacebookLoginPageTagline",true);
//	}
	public void verifyFacebookLoginPageForgotPasswordLink()
	{
		Assert.assertTrue(forgot_password.isDisplayed());
	    Assert.assertEquals(forgot_password.getText(), "\"Forgotten password?\"");
	    Reporter.log("verifyFacebookLoginPageForgotPasswordLink", true);
	}
	public void verifyFacebookLoginPageCreatePageLink()
	{
	 Assert.assertTrue(createpage_link.isDisplayed());
	  Reporter.log("verifyFacebookLoginPageCreatePageLink", true);
	}
	public void setFacebookLoginPageUsername()
	{
		username.sendKeys("Samanyu");
		Reporter.log("setFacebookLoginPageUserName",true);
	}
	public void setFacebookLoginPagePassword()
	{
		password.sendKeys("prajakta@gmail.com");
	    Reporter.log("setFacebookLoginPagePassword",true);
	}
	public void clickFacebookLoginPageLoginBtn()
	{
	  Assert.assertTrue(login_btn.isDisplayed());
	  Reporter.log("clickFacebookLoginCreateNewAccBtn",true);
	}
	public void verifyFacebookLoginFooterLinksSize()
	{
		Assert.assertEquals(footer_links.size(),30);
	    Reporter.log("verifyFacebookLoginPageFooterLinksSize", true);
	}
	
	
	

}
