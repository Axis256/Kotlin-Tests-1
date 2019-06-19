package pages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class LoginPage(private val driver: WebDriver) {

    @FindBy(id="identifierId")
    private lateinit var loginField: WebElement

    @FindBy(id="identifierNext")
    private lateinit var idNext: WebElement

    @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private lateinit var passwordField: WebElement

    @FindBy(id = "passwordNext")
    private lateinit var passwordNext: WebElement

    init {
        PageFactory.initElements(driver, this)
    }

    fun fillLogin(){
        loginField.clear()
        loginField.sendKeys("vladlavr99@gmail.com")
        idNext.click()
    }

    fun fillPassword(){
        val wait = WebDriverWait(driver, 5)
        wait.until<WebElement>(ExpectedConditions.elementToBeClickable(passwordField)).click()
        passwordField.sendKeys("")
        passwordNext.click()
    }
}