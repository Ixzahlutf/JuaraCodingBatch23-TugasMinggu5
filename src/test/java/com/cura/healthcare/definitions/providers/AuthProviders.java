package com.cura.healthcare.definitions.providers;

import org.openqa.selenium.WebDriver;

import com.cura.healthcare.pages.AppoinmentPage;
import com.cura.healthcare.pages.HomePage;
import com.cura.healthcare.pages.LoginPage;
import com.cura.healthcare.utils.DriverManager;

public class AuthProviders {
  private DriverManager driverManager;
  protected WebDriver driver;
  private HomePage homePage;
  private LoginPage loginPage;
  private AppoinmentPage appointmentPage;

  //inisiasi page
  public LoginPage loginPage() {
    loginPage = new LoginPage(driver);
    return loginPage;
  }

  public HomePage homePage() {
    homePage = new HomePage(driver);
    return homePage;
  }

  public AppoinmentPage appointmentPage() {
    appointmentPage = new AppoinmentPage(driver);
    return appointmentPage;
  }

  public void preTest() {
    driverManager = new DriverManager();
    driver = driverManager.getDriver();
    driver.get("https://katalon-demo-cura.herokuapp.com/");
  }

  public void preAppointment(){
    preTest();
    homePage().clickMenuToggle();
    homePage().clickLoginMenu();
    loginPage().performLogin();
  }

  public WebDriver getDriver() {
    return driverManager.getDriver();
  }


  public void close() {
    driverManager.quitDriver();
  }

  
    }