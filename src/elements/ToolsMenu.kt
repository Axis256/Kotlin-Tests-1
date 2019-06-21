package elements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import util.closeOuterPanel
import util.getPanelItems

class ToolsMenu(private val driver: WebDriver) {

    @FindBy(id = "docs-tools-menu")
    lateinit var toolsMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val toolsMenuItems: List<WebElement>

    val spellingMenuItem: WebElement

    val spellingItemsList: List<WebElement>
    val spellingCheckMenuItem: WebElement
    val underlineErrorsMenuItem: WebElement
    val personalDictionary: WebElement

    val extendedSearchMenuItem: WebElement
    val connectedObjectsMenuItem: WebElement
    val dictionaryMenuItem: WebElement
    val questionHistoryMenuItem: WebElement
    val dictateMenuItem: WebElement

    @FindBy(xpath = "//*[@class=\"docs-palette-close goog-inline-block\"]")
    lateinit var dictateCloseButton: WebElement

    val scriptEditorMenuItem: WebElement
    val settingsMenuItem: WebElement
    val accessabilityMenuItem: WebElement

    init {
        PageFactory.initElements(driver, this)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(toolsMenuButton)).click()
        toolsMenuItems = menuPanel.findElements(By.xpath("./*"))
        spellingMenuItem = toolsMenuItems[0]
        extendedSearchMenuItem = toolsMenuItems[2]
        connectedObjectsMenuItem = toolsMenuItems[3]
        dictionaryMenuItem = toolsMenuItems[4]
        questionHistoryMenuItem = toolsMenuItems[5]
        dictateMenuItem = toolsMenuItems[7]
        scriptEditorMenuItem = toolsMenuItems[8]
        settingsMenuItem = toolsMenuItems[10]
        accessabilityMenuItem = toolsMenuItems[11]
        
        spellingMenuItem.click()
        spellingItemsList = getPanelItems(driver, 1)
        spellingCheckMenuItem = spellingItemsList[0]
        underlineErrorsMenuItem = spellingItemsList[1]
        personalDictionary = spellingItemsList[2]

        closeOuterPanel(driver)
    }
}