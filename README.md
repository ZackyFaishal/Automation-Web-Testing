# Automation-Web-Testing
Automation Web Testing use Cucumber and Selenium in Java

## Deskripsi Program
  Repository ini berisi skrip yang dirancang untuk melakukan pengujian pada situs Swag Labs pada link (https://www.saucedemo.com/). Pengujian yang dilakukan berfokus pada fitur login dan logout pada Swag Labs. 

## Struktur Project
```
web-testing/
├── src/
│   └── test/
│       ├── java/
│       │   ├── stepdefinitions/
│       │   │   └── LoginSteps.java
│       │   ├── features/
│       │   │   └── Login.feature
│       │   ├── pages/
│       │   │   ├── HomePage.java
│       │   │   └── LoginPage.java
│       │   ├── runner/
│       │   │   └── TestRunner.java
│       │   └── utility/
│       │       ├── BrowserDriver.java
│       │       └── Hooks.java
│       ├── resources/
│       │   ├── drivers/
│       │   │   ├── LICENSE.chromedriver
│       │   │   └── chromedriver.exe
│       │   └── cucumber.properties
├── target/
│   ├── maven-status/
│   │   ├── compile/
│   │   │   └── default-compile/
│   │   └── testCompile/
│   │       └── default-testCompile/
│   ├── surefire-reports/
│   ├── test-classes/
│   │   ├── stepdefinitions/
│   │   │   └── LoginSteps.class
│   │   ├── drivers/
│   │   │   ├── LICENSE.chromedriver
│   │   │   └── chromedriver.exe
│   │   ├── pages/
│   │   │   ├── HomePage.class
│   │   │   └── LoginPage.class
│   │   ├── runner/
│   │   │   ├── RunCucumberTest.class
│   │   │   └── TestRunner.class
│   │   └── utility/
│   │       ├── BrowserDriver.class
│   │       └── Hooks.class
│   ├── cucumber-html.reports.html
│   ├── cucumber.properties
│   └── junit-platform.properties
├── .gitignore
├── cucumber-json
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```
### Penjelasan Struktur Project
- `src/test/java/stepdefinitions/` : Berisi file `LoginSteps.java` yang mendefinisikan langkah-langkah pengujian.
- `src/test/java/features/` : Berisi file `Login.feature` yang mendefinisikan skenario pengujian dalam format Gherkin.
- `src/test/java/pages/` : Berisi file `HomePage.java` dan `LoginPage.java` yang mendefinisikan halaman web yang akan diuji.
- `src/test/java/runner/` : Berisi file `TestRunner`.java yang mengatur eksekusi pengujian.
- `src/test/java/utility/` : Berisi file `BrowserDriver.java` dan `Hooks.java` yang menyediakan utilitas untuk pengujian.
- `src/test/resources/drivers/` : Berisi driver yang diperlukan untuk menjalankan pengujian, seperti `chromedriver.exe`.
- `src/test/resources/cucumber.properties` : Konfigurasi untuk Cucumber.
- `target/` : Berisi hasil kompilasi, laporan pengujian, dan artefak lainnya yang dihasilkan oleh Maven.

## Prequisites 
- **Programming Language** : Java
- **Build tools** : Apache Maven
- **Automation Tools** : Selenium, Cucumber
- **Web Driver** : ChromeDriver
- **Report Generate Tools** : SureFire Report

## Cara Running Project
1. Pastikan semua java dan apache maven sudah terinstall pada komputer. 
2. Clone Repository 
```
https://github.com/ZackyFaishal/Automation-Web-Testing.git
```
4. Buka project menggunakan Visual Studio Code atau Java IDE lainnya.

## Run Automation Test
1. Buka terminal dan jalankan perintah berikut :
```
mvn test
```
2. Untuk melihat hasil report testing, jalankan perintah berikut pada terminal :
```
mvn site
```
3. Buka hasil report pada file `\target\cucumber-html-reports.html` dalam browser.

# Authors 
- [@ZackyFaishal](https://github.com/ZackyFaishal) (Zacky Faishal Abror - 211524031) 
- [@MaolanaF](https://github.com/MaolanaF) (Maolana Firmansyah - 211524013)
- [@FadhilRa](https://github.com/FadhilRa) (Fadhil Radja A - 211524008)


