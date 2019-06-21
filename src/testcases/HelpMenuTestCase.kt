package testcases

import elements.HelpMenu
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import pages.MainPage
import util.closeNewTab
import util.closeOuterPanel

class HelpMenuTestCase(private val driver: WebDriver) {

    val mainPage: MainPage
    val helpMenu: HelpMenu

    init {
        mainPage = MainPage(driver)
        helpMenu = HelpMenu(driver)
    }

    private fun directCallWithPanel(element: WebElement) {
        helpMenu.helpMenuButton.click()
        element.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithoutPanel(element: WebElement) {
        helpMenu.helpMenuButton.click()
        element.click()
    }

    fun RunAllTest() {
        helpTest()
        learnTest()
        newsTest()
        reportProblemTest()
        reportViolationTest()
        hotkeysTest()
    }

    private fun helpTest() {
        directCallWithPanel(helpMenu.helpMenuItem)
    }
    private fun learnTest() {
        directCallWithoutPanel(helpMenu.learnMenuItem)
        closeNewTab(driver)
    }
    private fun newsTest() {
        directCallWithPanel(helpMenu.newsMenuItem)
    }
    private fun reportProblemTest() {
        directCallWithPanel(helpMenu.reportProblemMenuItem)
    }
    private fun reportViolationTest() {
        directCallWithoutPanel(helpMenu.reportViolationMenuItem)
        closeNewTab(driver)
    }

    private fun hotkeysTest() {
        directCallWithPanel(helpMenu.hotkeysMenuItem)
    }
}