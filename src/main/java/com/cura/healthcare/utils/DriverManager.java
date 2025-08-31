package com.cura.healthcare.utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {
  private WebDriver driver;

  public DriverManager() {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
  }
// public class DriverManager {
//     private WebDriver driver;

    

//     public DriverManager() {
//         ChromeOptions options = new ChromeOptions();

//         // Set preferences (allow camera & mic)
//         Map<String, Object> prefs = new HashMap<>();
//         prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
//         prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
//         options.setExperimentalOption("prefs", prefs);

//         // ⬇️ Ini kunci agar popup tidak muncul
//         options.addArguments("--use-fake-ui-for-media-stream");

//         driver = new ChromeDriver(options);
//         driver.manage().window().maximize();
//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//     }

    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }
}
