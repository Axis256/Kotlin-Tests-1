package testcases

import elements.ArrangeMenu
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import pages.MainPage
import util.closeOuterPanel
import util.selectAll

class ArrangeMenuTestCase(private val driver: WebDriver) {

    val mainPage: MainPage
    val arrangeMenu: ArrangeMenu

    init {
        mainPage = MainPage(driver)
        arrangeMenu = ArrangeMenu(driver)
    }

    private fun internalCallWithoutPanel(outerElement: WebElement, innerElement: WebElement) {
        arrangeMenu.arrangeMenuButton.click()
        outerElement.click()
        innerElement.click()
    }

    fun RunAllTest() {
        selectAll(driver)
        alignTest()
        centerTest()
        turnTest()
    }

    private fun alignTest(){
        internalCallWithoutPanel(arrangeMenu.alignMenuItem, arrangeMenu.leftEdgeMenuItem)
        internalCallWithoutPanel(arrangeMenu.alignMenuItem, arrangeMenu.rightEdgeMenuItem)
        internalCallWithoutPanel(arrangeMenu.alignMenuItem, arrangeMenu.centreMenuItem)
        internalCallWithoutPanel(arrangeMenu.alignMenuItem, arrangeMenu.lowerEdgeMenuItem)
        internalCallWithoutPanel(arrangeMenu.alignMenuItem, arrangeMenu.upperEdgeMenuItem)
        internalCallWithoutPanel(arrangeMenu.alignMenuItem, arrangeMenu.middleMenuItem)
    }

    private fun centerTest(){
        internalCallWithoutPanel(arrangeMenu.centerMenuItem, arrangeMenu.horCenterMenuItem)
        internalCallWithoutPanel(arrangeMenu.centerMenuItem, arrangeMenu.vertCenterMenuItem)
    }

    private fun turnTest(){
        internalCallWithoutPanel(arrangeMenu.turnMenuItem, arrangeMenu.turnClockwiseenuItem)
        internalCallWithoutPanel(arrangeMenu.turnMenuItem, arrangeMenu.turnCounterClockwiseenuItem)
        internalCallWithoutPanel(arrangeMenu.turnMenuItem, arrangeMenu.turnHorenuItem)
        internalCallWithoutPanel(arrangeMenu.turnMenuItem, arrangeMenu.turnVertenuItem)
    }
}