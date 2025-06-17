
# 🧪 HomePage Links Automation – README

This project is a **Selenium TestNG** based automation test suite designed to validate navigation links on the [https://www.wondrx.com](https://www.wondrx.com) homepage.

---

## 📁 Project Structure

```
ProjectRoot/
│
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── PomPack/            → Page Object Model classes (e.g., AboutPage.java)
│   │       ├── TestPack/
│   │       │   ├── BaseClass/      → Base setup class (e.g., BaseClass.java)
│   │       │   ├── Util/           → Utility classes (e.g., Utility_Class.java)
│   │       │   └── HomePage_Links.java ← Test class
│   │
│   └── test/
│       └── java/
│           └── (Optional Test Resources)
├── config.properties
```

---

## 🛠 Prerequisites

Make sure the following are installed and configured:

- Java JDK 8+ (You are using JDK 23, which is fine)
- Maven (v3.6 or later)
- Chrome browser
- ChromeDriver (compatible with your Chrome version)
- IDE (e.g., IntelliJ IDEA, Eclipse)

---

## 📦 Dependencies (in `pom.xml`)

Ensure your `pom.xml` includes:

```xml
<dependencies>
  <!-- Selenium -->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.27.0</version>
  </dependency>

  <!-- TestNG -->
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.9.0</version>
    <scope>test</scope>
  </dependency>
</dependencies>
```

---

## 🧾 Configuration File

Create a `config.properties` file (if not already present) in your project root or resource directory with:

```properties
URL=https://www.wondrx.com/about
```

Update `Utility_Class.getPropertiesData("URL")` to load this value from the right location.

---

## ▶️ How to Run the Tests

### ✅ Option 1: Run via IDE (IntelliJ/Eclipse)

1. Open the project.
2. Right-click on `HomePage_Links.java`.
3. Select **Run 'HomePage_Links'**.

### ✅ Option 2: Run via Maven Command Line

1. Open terminal/command prompt.
2. Navigate to your project root.
3. Run the following command:

```bash
mvn clean test
```

Ensure that your test class is included in the `testng.xml` or is annotated properly with `@Test`.

---

## 🧪 testng.xml (Optional)

You can create a `testng.xml` to control test execution:

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Wondrx Home Page Link Tests">
  <test name="HomePage Link Test">
    <classes>
      <class name="TestPack.HomePage_Links" />
    </classes>
  </test>
</suite>
```

Then run:

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 💡 Notes

- Make sure the ChromeDriver path is correctly set if you're not using WebDriverManager.
- If you're facing `NoSuchSessionException`, ensure each test case runs in a fresh browser session or add `driver.quit()` in `@AfterClass`.
