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

class FormatMenu(private val driver: WebDriver) {

    @FindBy(id = "docs-format-menu")
    lateinit var formatMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    val formatMenuItems: List<WebElement>

    val textMenuItem: WebElement

    val textItemsList: List<WebElement>
    val boldMenuItem: WebElement
    val italicMenuItem: WebElement
    val underlinedMenuItem: WebElement
    val striketroughMenuItem: WebElement
    val upperscoreMenuItem: WebElement
    val underscoreMenuItem: WebElement
    
    val sizeMenuItem: WebElement

    val sizeItemsList: List<WebElement>
    val incSizeMenuItem: WebElement
    val decSizeMenuItem: WebElement
    val colorMenuItem: WebElement

    val textColorSelection: WebElement

    val bgcolorMenuItem: WebElement

    val bgColorSelection: WebElement

    val registerMenuItem: WebElement

    val registerItemsList: List<WebElement>
    val lowRegMenuItem: WebElement
    val highRegMenuItem: WebElement
    val ladderRegMenuItem: WebElement
    
    val alignmentMenuItem: WebElement

    val alignmentItemsList: List<WebElement>
    val leftEdgeMenuItem: WebElement
    val centerMenuItem: WebElement
    val rightEdgeMenuItem: WebElement
    val byWidthMenuItem: WebElement
    val incIndentMenuItem: WebElement
    val decIndentMenuItem: WebElement
    val upperEdgeMenuItem: WebElement
    val middleMenuItem: WebElement
    val lowerEdgeMenuItem: WebElement
    
    val intervalMenuItem: WebElement
    
    val intervalItemsList: List<WebElement>
    val singularMenuItem: WebElement
    val pointfifteenMenuItem: WebElement
    val pointfiveMenuItem: WebElement
    val doubleMenuItem: WebElement
    val addSpaceAfterPar: WebElement
    val addSpaceBeforePar: WebElement
    val intervalSettings: WebElement

    val markersMenuItem: WebElement

    val markersItemsList: List<WebElement>
    val numeratedList: WebElement

    @FindBy(xpath = "//*[@aria-label=\"Строка 1. Столбец 1. числа с десятичными знаками, строчные латинские буквы, строчные римские цифры с точкой\"]")
    lateinit var numListCell: WebElement

    val markedList: WebElement

    @FindBy(xpath = "//*[@aria-label=\"Строка 1. Столбец 1. маркер, пустотелый маркер, квадратный маркер\"]")
    lateinit var markedListCell: WebElement

    val clearFormattingMenuItem: WebElement

    val bordersMenuItem: WebElement

    val bordersItemsList: List<WebElement>

    val borderWidthMenuItem: WebElement
    val eightpxWidthMenuItem: WebElement

    val borderTypeMenuItem: WebElement
    val doubleBorderMenuItem: WebElement

    val borderStyleMenuItem: WebElement
    val dotStyleMenuItem: WebElement

    val borderDecorMenuItem: WebElement
    val roundedDecorMenuItem: WebElement

    val formattingParamsMenuItem: WebElement

    
    init {
        PageFactory.initElements(driver, this)
        selectAll(driver)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(formatMenuButton)).click()
        formatMenuItems = menuPanel.findElements(By.xpath("./*"))
        textMenuItem = formatMenuItems[3]
        alignmentMenuItem = formatMenuItems[4]
        intervalMenuItem = formatMenuItems[5]
        markersMenuItem = formatMenuItems[6]
        clearFormattingMenuItem = formatMenuItems[10]
        bordersMenuItem = formatMenuItems[12]
        formattingParamsMenuItem  = formatMenuItems[14]

        textMenuItem.click()
        textItemsList = getPanelItems(driver, 2)
        boldMenuItem = textItemsList[0]
        italicMenuItem = textItemsList[1]
        underlinedMenuItem = textItemsList[2]
        striketroughMenuItem = textItemsList[3]
        upperscoreMenuItem = textItemsList[4]
        underscoreMenuItem = textItemsList[5]
        sizeMenuItem = textItemsList[7]
        colorMenuItem = textItemsList[8]
        bgcolorMenuItem = textItemsList[9]
        registerMenuItem = textItemsList[10]

        sizeMenuItem.click()
        sizeItemsList = getPanelItems(driver, 2)
        incSizeMenuItem = sizeItemsList[0]
        decSizeMenuItem = sizeItemsList[1]

        colorMenuItem.click()
        textColorSelection = driver.findElements(By.xpath("//*[@aria-label=\"голубой\"]")).last()

        bgcolorMenuItem.click()
        bgColorSelection = driver.findElements(By.xpath("//*[@aria-label=\"оранжевый\"]")).last()

        registerMenuItem.click()
        registerItemsList = getPanelItems(driver, 1)
        lowRegMenuItem = registerItemsList[0]
        highRegMenuItem = registerItemsList[1]
        ladderRegMenuItem = registerItemsList[2]

        alignmentMenuItem.click()
        alignmentItemsList = getPanelItems(driver, 2)
        leftEdgeMenuItem = alignmentItemsList[0]
        centerMenuItem = alignmentItemsList[1]
        rightEdgeMenuItem = alignmentItemsList[2]
        byWidthMenuItem = alignmentItemsList[3]
        incIndentMenuItem = alignmentItemsList[5]
        decIndentMenuItem = alignmentItemsList[6]
        upperEdgeMenuItem = alignmentItemsList[8]
        middleMenuItem = alignmentItemsList[9]
        lowerEdgeMenuItem = alignmentItemsList[10]

        intervalMenuItem.click()
        intervalItemsList = getPanelItems(driver, 1)
        singularMenuItem = intervalItemsList[0]
        pointfifteenMenuItem = intervalItemsList[1]
        pointfiveMenuItem = intervalItemsList[2]
        doubleMenuItem = intervalItemsList[3]
        addSpaceAfterPar = intervalItemsList[6]
        addSpaceBeforePar = intervalItemsList[7]
        intervalSettings = intervalItemsList[9]

        markersMenuItem.click()
        markersItemsList = getPanelItems(driver, 1)
        numeratedList = markersItemsList[0]
        markedList = markersItemsList[1]

        bordersMenuItem.click()
        bordersItemsList = getPanelItems(driver, 1)
        borderWidthMenuItem = bordersItemsList[1]
        borderTypeMenuItem = bordersItemsList[2]
        borderStyleMenuItem = bordersItemsList[3]
        borderDecorMenuItem = bordersItemsList[4]

        borderWidthMenuItem.click()
        eightpxWidthMenuItem = getPanelItems(driver, 1)[4]

        borderTypeMenuItem.click()
        doubleBorderMenuItem = getPanelItems(driver, 2)[1]

        borderStyleMenuItem.click()
        dotStyleMenuItem = getPanelItems(driver, 1)[1]

        borderDecorMenuItem.click()
        roundedDecorMenuItem = getPanelItems(driver, 1)[0]

        closeOuterPanel(driver)
        closeOuterPanel(driver)
    }
    
}