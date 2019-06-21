package pages

import util.*
import elements.*
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import java.util.concurrent.TimeUnit
import javax.swing.Action

class MainPage(private val driver: WebDriver) {

    @FindBy(id = "docs-edit-menu")
    private lateinit var editMenu: WebElement

    @FindBy(id = "docs-view-menu")
    private lateinit var viewMenu: WebElement

    @FindBy(id = "docs-insert-menu")
    private lateinit var insertMenu: WebElement

    @FindBy(id = "docs-format-menu")
    private lateinit var formatMenu: WebElement

    @FindBy(id = "punch-slide-menu")
    private lateinit var slideMenu: WebElement

    @FindBy(id = "sketchy-arrange-menu")
    private lateinit var arrangeMenu: WebElement

    @FindBy(id = "docs-tools-menu")
    private lateinit var toolsMenu: WebElement

    @FindBy(id = "docs-extensions-menu")
    private lateinit var extensionsMenu: WebElement

    @FindBy(id = "docs-help-menu")
    private lateinit var helpMenu: WebElement

    @FindBy(className = "docs-title-input")
    lateinit var titleInput: WebElement

    @FindBy(xpath = "/html/body/div[43]")
    lateinit var slideImportDialog: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]/div[3]")
    private lateinit var undoButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]/div[4]")
    private lateinit var redoButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]/div[11]")
    private lateinit var copyElementButton: WebElement

    @FindBy(xpath = "//div[@id='workspace-container']")
    lateinit var textField: WebElement

    @FindBy(xpath = "//*[@class='punch-filmstrip-thumbnail-background']")
    lateinit var firstSlide: WebElement

    init {
        PageFactory.initElements(driver, this)
    }
}