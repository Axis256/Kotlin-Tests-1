package testcases

import elements.SlideMenu
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import pages.MainPage
import util.closeOuterPanel

class SlideMenuTestCase(private val driver: WebDriver) {

    val mainPage: MainPage
    val slideMenu: SlideMenu

    init {
        mainPage = MainPage(driver)
        slideMenu = SlideMenu(driver)
    }

    private fun directCallWithPanel(element: WebElement) {
        slideMenu.slideMenuButton.click()
        element.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithoutPanel(element: WebElement) {
        slideMenu.slideMenuButton.click()
        element.click()
    }

    private fun internalCallWithoutPanel(outerElement: WebElement, innerElement: WebElement) {
        slideMenu.slideMenuButton.click()
        outerElement.click()
        innerElement.click()
    }

    private fun directCallWithCloseButton(element: WebElement, closeButton: WebElement){
        slideMenu.slideMenuButton.click()
        element.click()
        closeButton.click()
    }

    fun RunAllTest() {
        newSlideTest()
        cloneSlideTest()
        deleteSlideTest()
        skipSlideTest()
        moveSlideTest()
        changeBackgroundTest()
        transitionTest()
        changeTemplateTest()
        changeThemeTest()
    }

    private fun newSlideTest() {
        directCallWithoutPanel(slideMenu.newSlideMenuItem)
    }
    private fun cloneSlideTest() {
        directCallWithoutPanel(slideMenu.cloneSlideMenuItem)
    }
    private fun deleteSlideTest() {
        directCallWithoutPanel(slideMenu.deleteSlideMenuItem)
    }
    private fun skipSlideTest() {
        directCallWithoutPanel(slideMenu.skipSlideMenuItem)
    }
    private fun moveSlideTest() {
        internalCallWithoutPanel(slideMenu.moveSlideMenuItem, slideMenu.moveUpMenuItem)
        internalCallWithoutPanel(slideMenu.moveSlideMenuItem, slideMenu.moveDownMenuItem)
        internalCallWithoutPanel(slideMenu.moveSlideMenuItem, slideMenu.moveToHomeMenuItem)
        internalCallWithoutPanel(slideMenu.moveSlideMenuItem, slideMenu.moveToEndMenuItem)
    }
    private fun changeBackgroundTest() {
        directCallWithPanel(slideMenu.changeBackgroundMenuItem)
    }
    private fun transitionTest() {
        directCallWithCloseButton(slideMenu.transitionMenuItem, slideMenu.closeTransitionsButton)
    }
    private fun changeTemplateTest() {
        directCallWithCloseButton(slideMenu.changeTemplateMenuItem, slideMenu.closeTemplatesButton)
    }
    private fun changeThemeTest() {
        directCallWithCloseButton(slideMenu.changeThemeMenuItem, slideMenu.closeThemesButton)
    }
}