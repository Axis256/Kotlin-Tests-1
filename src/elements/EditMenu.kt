package elements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import util.closeOuterPanel

class EditMenu(private val driver: WebDriver) {

    @FindBy(id = "docs-edit-menu")
    lateinit var editMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val editMenuItems: List<WebElement>

    val undoMenuItem: WebElement

    val redoMenuItem: WebElement

    val cutMenuItem: WebElement

    val copyMenuItem: WebElement

    val pasteMenuItem: WebElement

    val pasteWithoutFormatingMenuItem: WebElement

    val deleteMenuItem: WebElement

    val createCopyMenuItem: WebElement

    val selectAllMenuItem: WebElement

    val findAndReplaceMenuItem: WebElement

    init {
        PageFactory.initElements(driver, this)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(editMenuButton)).click()
        editMenuItems = menuPanel.findElements(By.xpath("./*"))
        undoMenuItem = editMenuItems[2]
        redoMenuItem = editMenuItems[3]
        cutMenuItem= editMenuItems[5]
        copyMenuItem = editMenuItems[6]
        pasteMenuItem = editMenuItems[7]
        pasteWithoutFormatingMenuItem = editMenuItems[8]
        deleteMenuItem = editMenuItems[9]
        createCopyMenuItem = editMenuItems[10]
        selectAllMenuItem = editMenuItems[11]
        findAndReplaceMenuItem = editMenuItems[13]
        closeOuterPanel(driver)
    }
}
