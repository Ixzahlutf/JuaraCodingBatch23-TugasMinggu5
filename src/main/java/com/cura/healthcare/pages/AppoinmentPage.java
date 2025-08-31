package com.cura.healthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.sl.In;

public class AppoinmentPage {
    private WebDriver driver;

    @FindBy(xpath = "(//select[@id='combo_facility'])[1]")
    private WebElement facilityDropdown;

    @FindBy(xpath = "(//input[@id='chk_hospotal_readmission'])[1]")
    private WebElement hospitalReadmissionCheckbox;

    @FindBy(xpath = "(//span[@class='glyphicon glyphicon-calendar'])[1]")
    private WebElement appointmentDateButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/table[1]/thead[1]/tr[2]/th[2]")
    private WebElement appointmentYearMonthButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/table[1]/thead[1]/tr[2]/th[2]")
    private WebElement chooseYearButton;

    @FindBy(xpath = "(//button[normalize-space()='Book Appointment'])[1]")
    private WebElement bookAppointmentButton;

    public AppoinmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
  
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public WebElement getFacilityDropdown() {
        return facilityDropdown;
    }

    public void clickHospitalReadmissionCheckbox() {
        hospitalReadmissionCheckbox.click();
    }

    public void selectProgramByValue(String value) {
    WebElement programLabel = driver.findElement(By.xpath("//label[input[@name='programs' and @value='" + value + "']]"));
    programLabel.click();
    }

    public void pilihAppointmentDate(Integer date, String month, String year) {
        appointmentDateButton.click();
        appointmentYearMonthButton.click();

        chooseYearButton.click();
        WebElement yearElement = driver.findElement(
        By.xpath("(//span[normalize-space()='" + year + "'])[1]")
        );
        yearElement.click();

        WebElement monthElement = driver.findElement(
        By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/span[" + month + "]")
        );
        monthElement.click();

        WebElement dateElement = driver.findElement(
            By.xpath("//td[contains(@class, 'day') and normalize-space()='" + date + "']")
        );
        dateElement.click();
    }

    public void clickBookAppointmentButton() {
        bookAppointmentButton.click();
    }
}
