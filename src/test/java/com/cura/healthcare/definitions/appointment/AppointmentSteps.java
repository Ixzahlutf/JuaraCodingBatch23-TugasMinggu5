package com.cura.healthcare.definitions.appointment;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cura.healthcare.definitions.login.Hook;
import com.cura.healthcare.definitions.providers.AuthProviders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppointmentSteps extends AuthProviders{
    @Given("pengguna sudah berada di halaman appointment")
    public void step01(){
        preAppointment();
        Hook.driver = this;
    }

    @When("pengguna memilih facility {string}")
    public void step02(String facility){
        Select select = new Select(appointmentPage().getFacilityDropdown());
        select.selectByValue(facility);
    }

    @And("pengguna memilih opsi {string} untuk apply hospital readmission")
    public void step03(String readmission){
        appointmentPage().clickHospitalReadmissionCheckbox();
    }

    @And("pengguna memilih {string} sebagai program kesehatan")
    public void step04(String healthcareProgram){
        appointmentPage().selectProgramByValue(healthcareProgram);
    }

    @And("pengguna memilih tanggal {int} bulan {string} tahun {string} untuk janji temu")
    public void step05(Integer date, String month, String year){
        appointmentPage().pilihAppointmentDate(date, month, year);
    }

    @And("pengguna menekan tombol buat janji")
    public void step06(){
        appointmentPage().clickBookAppointmentButton();
    }

    @Then("pengguna berhasil membuat janji kemudian dibawa ke halaman url {string}")
    public void step07(String confirmationURL){
        String currentURL = appointmentPage().getCurrentURL();
        Assert.assertEquals(confirmationURL, currentURL);
    }
}