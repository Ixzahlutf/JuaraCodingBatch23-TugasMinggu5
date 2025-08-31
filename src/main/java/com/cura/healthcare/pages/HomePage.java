package com.cura.healthcare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  private WebDriver driver;

  @FindBy(xpath = "(//a[@id='menu-toggle'])[1]")
  private WebElement menuToggle;
  @FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
  private WebElement loginMenu;

  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
  
  public String getCurrentURL() {
    return driver.getCurrentUrl();
  }

  public void clickMenuToggle() {
    menuToggle.click();
  }

  public void clickLoginMenu() {
    loginMenu.click();
  }

}