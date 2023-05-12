package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {



    //Object repository or page factory for registration page
    By registerLink=By.xpath ("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");


    //By registerLink =By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By gender = By.id("gender-female");
    By firstName =By.id("FirstName");
    By lastName =By.id("LastName");
    By dateOfBirthDay = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.name("DateOfBirthMonth");
    By dateOfBirthYear =By.name("DateOfBirthYear");
    By emailId=By.name("Email");
    By companyName=By.id("Company");
    By newsletter=By.id("Newsletter");
    By password=By.id("Password");
    By confirmPassword=By.id("ConfirmPassword");
    By register_button=By.xpath("//*[@id=\"register-button\"]");

    public String validateRegisterPageTitle(){
        return driver.getTitle();
    }

    public void clickOnRegisterLink(){
        driver.findElement(registerLink).click();
    }

    public void doRegister(String F_Name,String L_Name,String Email,String day,String month,
                           String year,String comp,String pwd,String c_pwd){
        driver.findElement(gender).click();
        driver.findElement(firstName).sendKeys(F_Name);
        driver.findElement(lastName).sendKeys(L_Name);
        driver.findElement(emailId).sendKeys(Email);
        driver.findElement(dateOfBirthDay).sendKeys(day);
        driver.findElement(dateOfBirthMonth).sendKeys(month);
        driver.findElement(dateOfBirthYear).sendKeys(year);
        driver.findElement(companyName).sendKeys(comp);
        driver.findElement(newsletter).click();
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(confirmPassword).sendKeys(c_pwd);
        driver.findElement((register_button)).click();

    }

}
