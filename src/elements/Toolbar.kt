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

class Toolbar(private val driver: WebDriver) {

    @FindBy(id = "docs-toolbar")
    lateinit var toolbarPanel: WebElement

    val toolbarItems: List<WebElement>

    val newSlideItem: WebElement
    val templatesItem: WebElement
    val undoItem: WebElement
    val redoItem: WebElement

    val scaleItem: WebElement

    val scaleItemsList: List<WebElement>
    val fiftypercentMenuItem: WebElement
    val hundredpercentMenuItem: WebElement
    val twohundredpercentMenuItem: WebElement
    val scaleUpMenuItem: WebElement
    val scaleDownMenuItem: WebElement


    val createTextFieldItem: WebElement

    val insertImageItem: WebElement

    val imageItemsList: List<WebElement>
    val searchInternetMenuItem: WebElement
    val addFromGoogleDiskMenuItem: WebElement
    val addFromGooglePhotoMenuItem: WebElement
    val pasteURLMenuItem: WebElement
    val cameraShotMenuItem: WebElement

    val insertFigureItem: WebElement

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

    val insertLineItem: WebElement
    val addCommentItem: WebElement
    val backgroundItem: WebElement
    val layoutItem: WebElement
    val themeItem: WebElement
    val transitionItem: WebElement

    init {
        PageFactory.initElements(driver, this)
        toolbarItems = toolbarPanel.findElements(By.xpath("./*"))
        newSlideItem = toolbarItems[0]
        templatesItem = toolbarItems[1]
        undoItem = toolbarItems[2]
        redoItem = toolbarItems[3]
        scaleItem = toolbarItems[8]
        createTextFieldItem = toolbarItems[11]
        insertImageItem = toolbarItems[13]
        insertFigureItem = toolbarItems[14]
        insertLineItem = toolbarItems[15]
        addCommentItem = toolbarItems[43]
        backgroundItem = toolbarItems[82]
        layoutItem = toolbarItems[84]
        themeItem = toolbarItems[86]
        transitionItem = toolbarItems[88]

        scaleItem.click()
        scaleItemsList = getPanelItems(driver, 2)
        fiftypercentMenuItem = scaleItemsList[1]
        hundredpercentMenuItem = scaleItemsList[2]
        twohundredpercentMenuItem = scaleItemsList[3]
        scaleUpMenuItem = scaleItemsList[5]
        scaleDownMenuItem = scaleItemsList[6]

        insertImageItem.click()
        imageItemsList = getPanelItems(driver, 1)
        searchInternetMenuItem = imageItemsList[1]
        addFromGoogleDiskMenuItem = imageItemsList[3]
        addFromGooglePhotoMenuItem = imageItemsList[4]
        pasteURLMenuItem = imageItemsList[5]
        cameraShotMenuItem = imageItemsList[6]

        insertFigureItem.click()
        figureItemsList = getPanelItems(driver, 1)
        figuresMenuItem = figureItemsList[0]
        arrowsMenuItem = figureItemsList[1]
        referenceMenuItem = figureItemsList[2]
        formulaMenuItem = figureItemsList[3]
    }
}