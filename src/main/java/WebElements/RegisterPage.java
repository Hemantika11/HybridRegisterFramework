package WebElements;

import CommonPages.LoadProperty;
import CommonPages.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils
{
    LoadProperty loadProperty= new LoadProperty();

    private By _Gender = By.id("gender-female");
    private  By _Firstname= By.id("FirstName");
    private By _Lastname= By.id("LastName");
    private By _Day=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    private By _Month=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    private By _Year= By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    private By _Email=By.id("Email");
    private By _Companyname=By.id("Company");
    private By _Password=By.id("Password");
    private By _Confirmpassword= By.id("ConfirmPassword");
    private By _Registerbutton= By.xpath("//*[@id=\"register-button\"]");

 public void doRegister()
 {
     enterText(_Gender, loadProperty.getProperty("female"));
     enterText(_Firstname, loadProperty.getProperty("Mr P"));
     enterText(_Lastname, loadProperty.getProperty("Jain"));
     enterText(_Day, loadProperty.getProperty("7"));
     enterText(_Month, loadProperty.getProperty("August"));
     enterText(_Year, loadProperty.getProperty("1982"));
     enterText(_Email, loadProperty.getProperty("Teater123@gmaol.com"));
     enterText(_Companyname, loadProperty.getProperty("Unify"));
     enterText(_Password, loadProperty.getProperty("Tester234"));
     enterText(_Confirmpassword, loadProperty.getProperty("Tester234"));
     clickOnElement(_Registerbutton);
 }
}
