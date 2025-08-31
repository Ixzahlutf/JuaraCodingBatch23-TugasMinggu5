# Automation Testing Framework - JuaraCoding Batch 23

![Selenium](https://img.shields.io/badge/Selenium-4.15.0-green.svg)
![Cucumber](https://img.shields.io/badge/Cucumber-7.15.0-brightgreen.svg)
![TestNG](https://img.shields.io/badge/TestNG-7.10.2-red.svg)
![Maven](https://img.shields.io/badge/Maven-3.9.1-blue.svg)

Framework automation testing untuk web application CURA Healthcare menggunakan Selenium WebDriver, Cucumber BDD, dan TestNG.

## 📋 Prerequisites

Sebelum menjalankan project, pastikan software berikut terinstall:

- **Java JDK 17+** (Recommend JDK 17)
- **Maven 3.6+**
- **Browser** (Chrome/Firefox)
- **Git**

## 🚀 Cara Menjalankan Test Secara Lokal

### 1. Clone Repository
```bash
git clone https://github.com/Ixzahlutf/JuaraCodingBatch23-TugasMinggu5.git
cd JuaraCodingBatch23-TugasMinggu5
```

### 2. Install Dependencies
```bash
mvn clean install
```

### 3. Menjalankan Tests

#### Menjalankan semua tests
```bash
mvn clean test
```

### 4. Generate Reports

Setelah test selesai, reports akan tersedia di:
- **Cucumber HTML Report**: `target/cucumber-reports/cucumber.html`
- **Extent Report**: `target/extent-reports/extent-report.html`
- **Surefire Report**: `target/site/surefire-report.html`

## Cara Konfigurasi Jenkins

### 1. Install Required Plugins

Buka **Jenkins > Manage Jenkins > Manage Plugins**, install:
- **Git Plugin**
- **Maven Integration Plugin** 
- **Cucumber Reports Plugin**
- **HTML Publisher Plugin**

### 2. Global Configuration

#### Configure JDK:
```
Jenkins > Manage Jenkins > Tools
- Name: JDK17
- JAVA_HOME: //directory of your JDK17
```

#### Configure Maven:
```
Jenkins > Manage Jenkins > Tools
- Name: MAVEN 3.9 
- MAVEN_HOME: //directory of your Maven
```

### 3. Create Jenkins Job

1. **General Settings**
   - Project name: `CURA-Automation-Tests`
   - Click on the `Maven project`, then click `OK`  
   - Description: `Automation tests for CURA Healthcare website`

2. **Source Code Management**
   - Git: `https://github.com/Ixzahlutf/JuaraCodingBatch23-TugasMinggu5.git`
   - Branches: `*/main`
   - Select Source Code Management as None if the project is locally present on the machine.
3. **Build Steps**
   - In the Root POM textbox, enter the full path to pom.xml
   - In the Goals and options section, enter `clean test`
   - click `Advanced` dropdown
   - checklist `use custom workspace` then fill with full path of the project in the directory.

4. **Select “Publish HTML reports” from “Post Build Actions”**
    - Scroll down to `Post Build Actions`
    - click on the `Add Post Build Actions` drop-down list. 
    - Select `Publish HTML reports`
    - Enter the HTML directory to archive: `Reports`, Index page[s]: `Spark.html`, and Report title: `Extent Report.`
5. **Click on the Apply and Save buttons**

### 4. Execute the tests
1. Execute it by clicking on the `Build Now` button.
2. Once the execution is completed, click on go `Back to Project`, and we can see a link to view the `Extent Report`.

Tip: If you don’t see the Report UI intact, then you need to configure a simple Groovy script. For that, go to Dashboard–>Manage Jenkins–>Script Console and add the script as:
```
System.setProperty("hudson.model.DirectoryBrowserSupport.CSP","")
```


## 🧪 Test Cases yang Tersedia

### Feature: Login
- ✅ Login at CURA Healthcare

### Feature: Appointment Scheduling  
- ✅ Schedule an appointment at CURA Healthcare
