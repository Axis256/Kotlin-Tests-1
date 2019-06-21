package testcases

import elements.ToolsMenu
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import pages.MainPage
import util.closeNewTab
import util.closeOuterPanel

class ToolsMenuTestCase(private val driver: WebDriver) {

    val mainPage: MainPage
    val toolsMenu: ToolsMenu

    init {
        mainPage = MainPage(driver)
        toolsMenu = ToolsMenu(driver)
    }

    private fun directCallWithPanel(element: WebElement) {
        toolsMenu.toolsMenuButton.click()
        element.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithoutPanel(element: WebElement) {
        toolsMenu.toolsMenuButton.click()
        element.click()
    }

    private fun internalCallWithoutPanel(outerElement: WebElement, innerElement: WebElement) {
        toolsMenu.toolsMenuButton.click()
        outerElement.click()
        innerElement.click()
    }

    private fun internalCallWithPanel(outerElement: WebElement, innerElement: WebElement) {
        toolsMenu.toolsMenuButton.click()
        outerElement.click()
        innerElement.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithCloseButton(element: WebElement, closeButton: WebElement){
        toolsMenu.toolsMenuButton.click()
        element.click()
        closeButton.click()
    }

    fun RunAllTest() {
        spellingTest()
        extendedSearchTest()
        connectedObjectsTest()
        dictionaryTest()
        questionHistoryTest()
        dictateTest()
        scriptEditorTest()
        settingsTest()
        accessabilityTest()
    }

    private fun spellingTest() {
        internalCallWithoutPanel(toolsMenu.spellingMenuItem, toolsMenu.spellingCheckMenuItem)
        internalCallWithoutPanel(toolsMenu.spellingMenuItem, toolsMenu.underlineErrorsMenuItem)
        internalCallWithoutPanel(toolsMenu.spellingMenuItem, toolsMenu.underlineErrorsMenuItem)
        internalCallWithPanel(toolsMenu.spellingMenuItem, toolsMenu.personalDictionary)
    }
    private fun extendedSearchTest() {
        directCallWithoutPanel(toolsMenu.extendedSearchMenuItem)
    }
    private fun connectedObjectsTest() {
        directCallWithoutPanel(toolsMenu.connectedObjectsMenuItem)
    }
    private fun dictionaryTest() {
        directCallWithoutPanel(toolsMenu.dictionaryMenuItem)
    }
    private fun questionHistoryTest() {
        directCallWithoutPanel(toolsMenu.questionHistoryMenuItem)
    }
    private fun dictateTest() {
        directCallWithCloseButton(toolsMenu.dictateMenuItem, toolsMenu.dictateCloseButton)
    }
    private fun scriptEditorTest() {
        directCallWithoutPanel(toolsMenu.scriptEditorMenuItem)
        closeNewTab(driver)
    }
    private fun settingsTest() {
        directCallWithPanel(toolsMenu.settingsMenuItem)
    }
    private fun accessabilityTest() {
        directCallWithPanel(toolsMenu.accessabilityMenuItem)
    }
}