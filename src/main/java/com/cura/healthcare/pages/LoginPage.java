package com.cura.healthcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  private WebDriver driver;

  @FindBy(xpath = "(//input[@id='txt-username'])[1]")
  private WebElement usernameInput;

  @FindBy(xpath = "(//input[@id='txt-password'])[1]")
  private WebElement passwordInput;

  @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
  private WebElement loginButton;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(this.driver, this);
  }

  public void setUsernameLogin(String username) {
    usernameInput.sendKeys(username);
  }

  public void setPasswordLogin(String password) {
    passwordInput.sendKeys(password);
  }

  public void clickLoginButton() {
    loginButton.click();
  }


  public void performLogin() {
    setUsernameLogin("John Doe");
    setPasswordLogin("ThisIsNotAPassword");
    clickLoginButton();
  }

  public void performLogin(String username, String password) {
    setUsernameLogin(username);
    setPasswordLogin(password);
  }




  // }
}
