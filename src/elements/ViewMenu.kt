package elements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import util.getPanelItems
import util.pressEscKey

class ViewMenu(private val driver: WebDriver) {

    @FindBy(id = "docs-view-menu")
    lateinit var viewMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val viewMenuItems: List<WebElement>

    val watchMenuItem: WebElement

    val animationMenuItem: WebElement

    val masterMenuItem: WebElement

    val netViewMenuItem: WebElement

    val scaleMenuItem: WebElement

    val scaleItemsList: List<WebElement>

    val fiftypercentMenuItem: WebElement

    val hundredpercentMenuItem: WebElement

    val twohundredpercentMenuItem: WebElement

    val scaleUpMenuItem: WebElement

    val scaleDownMenuItem: WebElement

    val showRulerMenuItem: WebElement

    val guidelineMenuItem: WebElement

    val guidelineItemsList: List<WebElement>

    val showMenuItem: WebElement

    val addVertMenuItem: WebElement

    val addHorMenuItem: WebElement

    val changeGuidelines: WebElement

    val hideGuidelines: WebElement

    val bindingMenuItem: WebElement

    val bindingItemsList: List<WebElement>

    val bindToRulerMenuItem: WebElement

    val bindtoGuidelinesMenuItem: WebElement

    val showNotesMenuItem: WebElement

    val fullscreeMenuItem: WebElement

    init {
        PageFactory.initElements(driver, this)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(viewMenuButton)).click()
        viewMenuItems = menuPanel.findElements(By.xpath("./*"))
        watchMenuItem = viewMenuItems[0]
        animationMenuItem = viewMenuItems[2]
        masterMenuItem = viewMenuItems[4]
        netViewMenuItem = viewMenuItems[5]
        scaleMenuItem = viewMenuItems[7]
        showRulerMenuItem = viewMenuItems[8]
        guidelineMenuItem = viewMenuItems[9]
        bindingMenuItem = viewMenuItems[10]
        showNotesMenuItem = viewMenuItems[12]
        fullscreeMenuItem = viewMenuItems[14]
        scaleMenuItem.click()
        scaleItemsList = getPanelItems(driver, 2)
        fiftypercentMenuItem = scaleItemsList[1]
        hundredpercentMenuItem = scaleItemsList[2]
        twohundredpercentMenuItem = scaleItemsList[3]
        scaleUpMenuItem = scaleItemsList[5]
        scaleDownMenuItem = scaleItemsList[6]
        guidelineMenuItem.click()
        guidelineItemsList = getPanelItems(driver, 2)
        showMenuItem = guidelineItemsList[0]
        addVertMenuItem = guidelineItemsList[2]
        addHorMenuItem = guidelineItemsList[3]
        changeGuidelines = guidelineItemsList[5]
        hideGuidelines = guidelineItemsList[7]
        bindingMenuItem.click()
        bindingItemsList = getPanelItems(driver, 1)
        bindToRulerMenuItem = bindingItemsList[0]
        bindtoGuidelinesMenuItem = bindingItemsList[1]
        pressEscKey(driver)
    }
}