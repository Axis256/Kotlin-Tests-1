package testcases

import elements.FormatMenu
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import pages.MainPage
import util.closeOuterPanel
import util.selectAll

class FormatMenuTestCase(private val driver: WebDriver) {

    val mainPage: MainPage
    val formatMenu: FormatMenu

    init {
        mainPage = MainPage(driver)
        formatMenu = FormatMenu(driver)
    }

    private fun directCallWithPanel(element: WebElement) {
        formatMenu.formatMenuButton.click()
        element.click()
        closeOuterPanel(driver)
    }

    private fun internalCallWithPanel(outerElement: WebElement, innerElement: WebElement) {
        formatMenu.formatMenuButton.click()
        outerElement.click()
        innerElement.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithoutPanel(element: WebElement) {
        formatMenu.formatMenuButton.click()
        element.click()
    }

    private fun internalCallWithoutPanel(outerElement: WebElement, innerElement: WebElement) {
        formatMenu.formatMenuButton.click()
        outerElement.click()
        innerElement.click()
    }

    private fun doubleInternalCallWithoutPanel(outerElement: WebElement, innerElement: WebElement, actualElement: WebElement) {
        formatMenu.formatMenuButton.click()
        outerElement.click()
        innerElement.click()
        actualElement.click()
    }
    
    fun RunAllTest(){
        selectAll(driver)
        textTest()
        alignmentTest()
        intervalTest()
        markersTest()
        bordersTest()
        clearFormattingTest()
        formattingParamsTest()
        closeOuterPanel(driver)
    }

    private fun textTest() {
        internalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.boldMenuItem)
        internalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.italicMenuItem)
        internalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.underlinedMenuItem)
        internalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.striketroughMenuItem)
        internalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.upperscoreMenuItem)
        internalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.underscoreMenuItem)

        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.sizeMenuItem, formatMenu.incSizeMenuItem)
        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.sizeMenuItem, formatMenu.decSizeMenuItem)

        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.colorMenuItem, formatMenu.textColorSelection)

        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.bgcolorMenuItem, formatMenu.bgColorSelection)

        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.registerMenuItem, formatMenu.lowRegMenuItem)
        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.registerMenuItem, formatMenu.highRegMenuItem)
        doubleInternalCallWithoutPanel(formatMenu.textMenuItem, formatMenu.registerMenuItem, formatMenu.ladderRegMenuItem)
    }

    private fun alignmentTest() {
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.leftEdgeMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.rightEdgeMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.centerMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.byWidthMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.decIndentMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.incIndentMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.upperEdgeMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.lowerEdgeMenuItem)
        internalCallWithoutPanel(formatMenu.alignmentMenuItem, formatMenu.middleMenuItem)
    }

    private fun intervalTest() {
        internalCallWithoutPanel(formatMenu.intervalMenuItem, formatMenu.pointfifteenMenuItem)
        internalCallWithoutPanel(formatMenu.intervalMenuItem, formatMenu.pointfiveMenuItem)
        internalCallWithoutPanel(formatMenu.intervalMenuItem, formatMenu.doubleMenuItem)
        internalCallWithoutPanel(formatMenu.intervalMenuItem, formatMenu.singularMenuItem)
        internalCallWithoutPanel(formatMenu.intervalMenuItem, formatMenu.addSpaceBeforePar)
        internalCallWithoutPanel(formatMenu.intervalMenuItem, formatMenu.addSpaceAfterPar)
        internalCallWithPanel(formatMenu.intervalMenuItem, formatMenu.intervalSettings)
    }

    private fun markersTest() {
        doubleInternalCallWithoutPanel(formatMenu.markersMenuItem, formatMenu.numeratedList, formatMenu.numListCell)
        doubleInternalCallWithoutPanel(formatMenu.markersMenuItem, formatMenu.markedList, formatMenu.markedListCell)
    }

    private fun clearFormattingTest() {
        directCallWithoutPanel(formatMenu.clearFormattingMenuItem)
    }

    private fun bordersTest() {
        doubleInternalCallWithoutPanel(formatMenu.bordersMenuItem, formatMenu.borderWidthMenuItem, formatMenu.eightpxWidthMenuItem)
        doubleInternalCallWithoutPanel(formatMenu.bordersMenuItem, formatMenu.borderTypeMenuItem, formatMenu.doubleBorderMenuItem)
        doubleInternalCallWithoutPanel(formatMenu.bordersMenuItem, formatMenu.borderStyleMenuItem, formatMenu.dotStyleMenuItem)
        doubleInternalCallWithoutPanel(formatMenu.bordersMenuItem, formatMenu.borderDecorMenuItem, formatMenu.roundedDecorMenuItem)
    }

    private fun  formattingParamsTest() {
        directCallWithPanel(formatMenu.formattingParamsMenuItem)
    }
}