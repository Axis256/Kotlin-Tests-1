package elements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait
import pages.MainPage
import util.closeOuterPanel
import util.getPanelItems
import util.selectAll

class ArrangeMenu(private val driver: WebDriver) {

    @FindBy(id = "sketchy-arrange-menu")
    lateinit var arrangeMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val arrangeMenuItems: List<WebElement>

    val alignMenuItem: WebElement

    val alignItemsList: List<WebElement>

    val leftEdgeMenuItem: WebElement
    val centreMenuItem: WebElement
    val rightEdgeMenuItem: WebElement
    val upperEdgeMenuItem: WebElement
    val middleMenuItem: WebElement
    val lowerEdgeMenuItem: WebElement

    val centerMenuItem: WebElement

    val centerItemsList: List<WebElement>

    val horCenterMenuItem: WebElement
    val vertCenterMenuItem: WebElement

    val turnMenuItem: WebElement

    val turnItemsList: List<WebElement>

    val turnClockwiseenuItem: WebElement
    val turnCounterClockwiseenuItem: WebElement
    val turnHorenuItem: WebElement
    val turnVertenuItem: WebElement

    init {
        PageFactory.initElements(driver, this)
        selectAll(driver)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(arrangeMenuButton)).click()
        arrangeMenuItems = menuPanel.findElements(By.xpath("./*"))
        alignMenuItem = arrangeMenuItems[2]
        centerMenuItem = arrangeMenuItems[4]
        turnMenuItem = arrangeMenuItems[6]

        alignMenuItem.click()
        alignItemsList = getPanelItems(driver, 1)
        leftEdgeMenuItem = alignItemsList[0]
        centreMenuItem = alignItemsList[1]
        rightEdgeMenuItem = alignItemsList[2]
        upperEdgeMenuItem = alignItemsList[4]
        middleMenuItem = alignItemsList[5]
        lowerEdgeMenuItem = alignItemsList[6]

        centerMenuItem.click()
        centerItemsList = getPanelItems(driver, 1)
        horCenterMenuItem = centerItemsList[0]
        vertCenterMenuItem = centerItemsList[1]

        turnMenuItem.click()
        turnItemsList = getPanelItems(driver, 1)
        turnClockwiseenuItem = turnItemsList[0]
        turnCounterClockwiseenuItem = turnItemsList[1]
        turnHorenuItem = turnItemsList[2]
        turnVertenuItem = turnItemsList[3]

        closeOuterPanel(driver)
    }
}