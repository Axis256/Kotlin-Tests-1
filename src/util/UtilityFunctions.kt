package util

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.JavascriptExecutor;

fun printSuccessMsg(testName: String){
    println("\u001B[32m $testName was SUCCESSFUL \u001B[0m ")
}

fun printErrorMsg(testName: String, msg: String?){
    println("\u001B[41m $testName FAILED due to \u001B[0m \n\t $msg \n")
}

fun printInfoMsg(msg: String?){
    println("\u001B[36m $msg  \u001B[0m")
}

fun pressEscKey(driver: WebDriver){
    val action = Actions(driver)
    action.sendKeys(Keys.ESCAPE).perform()
}

fun waitForPresence(driver: WebDriver, time: Long, element: String){
    val wait = WebDriverWait(driver, time)
    wait.until<WebElement>(ExpectedConditions.presenceOfElementLocated(By.className(element)))
}

fun GuarantiedClick(driver: WebDriver, time: Long, element: WebElement){
    val wait = WebDriverWait(driver, time)
    wait.until<WebElement>(ExpectedConditions.elementToBeClickable(element)).click()
}

fun waitForURLChange(driver: WebDriver, time: Long, url: String){
    val wait = WebDriverWait(driver, time)
    wait.until(ExpectedConditions.urlToBe(url))
}

fun getPanelItems(driver: WebDriver, type: Int): List<WebElement>
{
    val typeMap = mapOf(
        1 to "//div[@class=\"goog-menu goog-menu-vertical docs-material goog-menu-noaccel\"]",
        2 to "//div[@class=\"goog-menu goog-menu-vertical docs-material\"]",
        3 to "//div[@class=\"goog-menu goog-menu-vertical docs-material goog-menu-noaccel docs-menu-overflow\"]")

    return driver.findElements(By.xpath(typeMap[type])).last().findElements((By.xpath("./*")))
}

fun closeNewTab(driver: WebDriver){
    driver.switchTo().window(driver.windowHandles.elementAt(1))
    driver.close()
    driver.switchTo().window(driver.windowHandles.elementAt(0))
}