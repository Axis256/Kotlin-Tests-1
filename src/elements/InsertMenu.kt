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

class InsertMenu(private val driver: WebDriver) {

    @FindBy(id = "docs-insert-menu")
    lateinit var insertMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val insertMenuItems: List<WebElement>

    val imageMenuItem: WebElement
    
    val imageItemsList: List<WebElement>
    
    val searchInternetMenuItem: WebElement
    
    val addFromGoogleDiskMenuItem: WebElement
    
    val addFromGooglePhotoMenuItem: WebElement
    
    val pasteURLMenuItem: WebElement
    
    val cameraShotMenuItem: WebElement

    val textfieldMenuItem: WebElement

    val audioMenuItem: WebElement

    val videoMenuItem: WebElement

    val figureMenuItem: WebElement

    val figureItemsList: List<WebElement>

    val figuresMenuItem: WebElement

    val arrowsMenuItem: WebElement

    val referenceMenuItem: WebElement

    val formulaMenuItem: WebElement

    @FindBy(xpath = "//*[@aria-label=\"Прямоугольник\"]")
    lateinit var figureElement: WebElement

    @FindBy(xpath = "//*[@aria-label=\"Стрелка вправо\"]")
    lateinit var arrowElement: WebElement

    @FindBy(xpath = "//*[@aria-label=\"Взрыв 1\"]")
    lateinit var referenceElement: WebElement

    @FindBy(xpath = "//*[@aria-label=\"Плюс\"]")
    lateinit var formulaElement: WebElement

    val tableMenuItem: WebElement

    val tableCell: WebElement

    val diagramMenuItem: WebElement

    val diagramItemsList: List<WebElement>

    val linearMenuItem: WebElement

    val columnarMenuItem: WebElement

    val plotMenuItem: WebElement

    val circularMenuItem: WebElement

    val fromTablesMenuItem: WebElement

    val wordartMenuItem: WebElement

    val lineMenuItem: WebElement

    val lineItemsList: List<WebElement>

    val firstLineMenuItem: WebElement

    val animationMenuItem: WebElement

    @FindBy(xpath = "//*[@class=\"docs-sidebar-gm-titlebar-icon-button docs-material docs-sidebar-gm-close-button punch-animation-sidebar-close\"]")
    lateinit var closeAnimationsButton: WebElement

    val leaveCommentMenuItem: WebElement

    val newSlideMenuItem: WebElement

    val slideNumbersMenuItem: WebElement
    
    init {
        PageFactory.initElements(driver, this)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(insertMenuButton)).click()
        insertMenuItems = menuPanel.findElements(By.xpath("./*"))

        imageMenuItem = insertMenuItems[0]
        textfieldMenuItem = insertMenuItems[1]
        audioMenuItem = insertMenuItems[2]
        videoMenuItem = insertMenuItems[3]
        figureMenuItem = insertMenuItems[4]
        tableMenuItem = insertMenuItems[5]
        diagramMenuItem = insertMenuItems[6]
        wordartMenuItem = insertMenuItems[7]
        lineMenuItem = insertMenuItems[8]
        animationMenuItem = insertMenuItems[11]
        leaveCommentMenuItem = insertMenuItems[15]
        newSlideMenuItem = insertMenuItems[17]
        slideNumbersMenuItem = insertMenuItems[18]

        imageMenuItem.click()
        imageItemsList = getPanelItems(driver, 1)
        searchInternetMenuItem = imageItemsList[1]
        addFromGoogleDiskMenuItem = imageItemsList[3]
        addFromGooglePhotoMenuItem = imageItemsList[4]
        pasteURLMenuItem = imageItemsList[5]
        cameraShotMenuItem = imageItemsList[6]

        figureMenuItem.click()
        figureItemsList = getPanelItems(driver, 1)
        figuresMenuItem = figureItemsList[0]
        arrowsMenuItem = figureItemsList[1]
        referenceMenuItem = figureItemsList[2]
        formulaMenuItem = figureItemsList[3]

        tableMenuItem.click()
        tableCell = driver.findElements(By.xpath("//div[@class=\"goog-menu goog-menu-vertical docs-material\"]")).last().findElement((By.xpath("./div/div/div[2]")))

        diagramMenuItem.click()
        diagramItemsList = getPanelItems(driver, 1)
        linearMenuItem = diagramItemsList[0]
        columnarMenuItem = diagramItemsList[1]
        plotMenuItem = diagramItemsList[2]
        circularMenuItem = diagramItemsList[3]
        fromTablesMenuItem = diagramItemsList[5]

        lineMenuItem.click()
        lineItemsList = getPanelItems(driver, 1)
        firstLineMenuItem = lineItemsList[0]

        closeOuterPanel(driver)
    }
    
}