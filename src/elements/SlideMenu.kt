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
import util.selectAll

class SlideMenu(private val driver: WebDriver) {

    @FindBy(id = "punch-slide-menu")
    lateinit var slideMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val slideMenuItems: List<WebElement>

    val newSlideMenuItem: WebElement
    val cloneSlideMenuItem: WebElement
    val deleteSlideMenuItem: WebElement
    val skipSlideMenuItem: WebElement
    val moveSlideMenuItem: WebElement

    val moveSlideItemsList: List<WebElement>

    val moveUpMenuItem: WebElement
    val moveDownMenuItem: WebElement
    val moveToHomeMenuItem: WebElement
    val moveToEndMenuItem: WebElement

    val changeBackgroundMenuItem: WebElement
    val transitionMenuItem: WebElement

    @FindBy(xpath = "//*[@class=\"docs-sidebar-gm-titlebar-icon-button docs-material docs-sidebar-gm-close-button punch-animation-sidebar-close\"]")
    lateinit var closeTransitionsButton: WebElement

    val changeTemplateMenuItem: WebElement

    @FindBy(xpath = "//*[@class=\"punch-masterstitlebar-close goog-flat-button goog-inline-block\"]")
    lateinit var closeTemplatesButton: WebElement

    val changeThemeMenuItem: WebElement

    @FindBy(xpath = "//*[@class=\"docs-sidebar-gm-titlebar-icon-button docs-material docs-sidebar-gm-close-button punch-theme-sidebar-close\"]")
    lateinit var closeThemesButton: WebElement

    init {
        PageFactory.initElements(driver, this)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(slideMenuButton)).click()
        slideMenuItems = menuPanel.findElements(By.xpath("./*"))
        newSlideMenuItem = slideMenuItems[0]
        cloneSlideMenuItem = slideMenuItems[1]
        deleteSlideMenuItem = slideMenuItems[2]
        skipSlideMenuItem = slideMenuItems[3]
        moveSlideMenuItem = slideMenuItems[4]
        changeBackgroundMenuItem = slideMenuItems[6]
        transitionMenuItem = slideMenuItems[8]
        changeTemplateMenuItem = slideMenuItems[10]
        changeThemeMenuItem = slideMenuItems[11]

        newSlideMenuItem.click()
        slideMenuButton.click()
        moveSlideMenuItem.click()
        moveSlideItemsList = getPanelItems(driver, 2)
        moveUpMenuItem = moveSlideItemsList[0]
        moveDownMenuItem = moveSlideItemsList[1]
        moveToHomeMenuItem = moveSlideItemsList[2]
        moveToEndMenuItem = moveSlideItemsList[3]

        deleteSlideMenuItem.click()
    }
}