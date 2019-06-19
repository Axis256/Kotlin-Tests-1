import pages.MainPage
import pages.LoginPage
import testcases.EditMenuTestCase
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import testcases.FileMenuTestCase

fun main(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vlad\\AppData\\Local\\Temp\\75.0.3770.8\\chromedriver\\chromedriver.exe")
    val driver = ChromeDriver()
    printInfoMsg("Test execution started.")
    driver.get("https://docs.google.com/presentation/d/112xHqiKBP4qUnQzn5emclqBR3PtCA0Asq7RbsQvueIg/edit#slide=id.p")
    val loginPage = LoginPage(driver)
    loginPage.fillLogin()
    loginPage.fillPassword()
    val mainPage = MainPage(driver)
    val fileMenuTest = FileMenuTestCase(driver, mainPage)
    val editMenuTestCase = EditMenuTestCase(driver)
    //fileMenuTest.runAllTests()
    editMenuTestCase.runAllTests()
    printInfoMsg("Test execution finished.")
    driver.close()
}

fun printInfoMsg(msg: String?){
    println("\u001B[36m $msg  \u001B[0m")
}