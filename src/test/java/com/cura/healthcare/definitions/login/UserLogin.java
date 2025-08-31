package com.cura.healthcare.definitions.login;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cura.healthcare.definitions.providers.AuthProviders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class UserLogin extends AuthProviders {
    @Given("pengguna sudah berada di halaman home.")
    public void step01(){
        preTest();
        Hook.driver = this;
    }

    @When("pengguna masuk ke halaman login.")
    public void step02(){
        homePage().clickMenuToggle();
        homePage().clickLoginMenu();
    }

    @And("pengguna memasukkan username {string} dan password {string}.")
    public void step03(String username, String password){
        loginPage().performLogin(username, password);
    }

    @And("pengguna menekan tombol login.")
    public void step04(){
        loginPage().clickLoginButton();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("https://katalon-demo-cura.herokuapp.com/#appointment"));
    }

    @And("pengguna akan dibawa ke halaman appointment dengan url {string}.")
    public void step05(String url){
        Assert.assertEquals(url, driver.getCurrentUrl());
    }
}