package testcases

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.FindBy
import pages.LoginPage
import pages.MainPage
import elements.*
import util.pressEscKey

class EditMenuTestCase(private val driver: WebDriver) {

    private val mainPage: MainPage
    private val editMenu: EditMenu

    init {
        mainPage = MainPage(driver)
        editMenu = EditMenu(driver)
    }

    fun runAllTests(){
        Actions(driver).moveToElement(mainPage.firstSlide).click().perform()
        CreateCopyTest()
        UndoTest()
        RedoTest()
        CutTest()
        CopyTest()
        PasteTest()
        PasteWithoutFormatingTest()
        DeleteTest()
        SelectAllTest()
        FindAndReplaceTest()
    }

    private fun UndoTest(){
        editMenu.editMenuButton.click()
        editMenu.undoMenuItem.click()
    }

    private fun RedoTest(){
        editMenu.editMenuButton.click()
        editMenu.redoMenuItem.click()
    }

    private fun CutTest(){
        editMenu.editMenuButton.click()
        editMenu.cutMenuItem.click()
    }

    private fun CopyTest(){
        editMenu.editMenuButton.click()
        editMenu.copyMenuItem.click()
    }

    private fun PasteTest(){
        editMenu.editMenuButton.click()
        editMenu.pasteMenuItem.click()
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun PasteWithoutFormatingTest(){
        editMenu.editMenuButton.click()
        editMenu.pasteWithoutFormatingMenuItem.click()
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun DeleteTest(){
        editMenu.editMenuButton.click()
        editMenu.deleteMenuItem.click()
        UndoTest()
    }

    private fun CreateCopyTest(){
        editMenu.editMenuButton.click()
        editMenu.createCopyMenuItem.click()
    }

    private fun SelectAllTest(){
        editMenu.editMenuButton.click()
        editMenu.selectAllMenuItem.click()
    }

    private fun FindAndReplaceTest(){
        editMenu.editMenuButton.click()
        editMenu.findAndReplaceMenuItem.click()
        pressEscKey(driver)
    }

}