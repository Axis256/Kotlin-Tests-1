package elements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import util.closeOuterPanel

class HelpMenu(private val driver: WebDriver) {

    @FindBy(id = "docs-help-menu")
    lateinit var helpMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-omnibox-parent docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val helpMenuItems: List<WebElement>
    val helpMenuItem: WebElement
    val learnMenuItem: WebElement
    val newsMenuItem: WebElement
    val reportProblemMenuItem: WebElement
    val reportViolationMenuItem: WebElement
    val hotkeysMenuItem: WebElement
    

    init {
        PageFactory.initElements(driver, this)
        driver.findElement(By.id("workspace-container")).click()
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(helpMenuButton)).click()
        helpMenuItems = menuPanel.findElements(By.xpath("./*"))
        helpMenuItem = helpMenuItems[2]
        learnMenuItem = helpMenuItems[3]
        newsMenuItem = helpMenuItems[4]
        reportProblemMenuItem = helpMenuItems[6]
        reportViolationMenuItem = helpMenuItems[7]
        hotkeysMenuItem = helpMenuItems[9]

        closeOuterPanel(driver)
    }
}