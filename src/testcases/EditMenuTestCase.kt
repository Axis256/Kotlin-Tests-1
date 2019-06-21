package testcases

import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import pages.MainPage
import elements.*
import util.closeOuterPanel

class EditMenuTestCase(private val driver: WebDriver) {

    private val mainPage: MainPage
    private val editMenu: EditMenu

    init {
        mainPage = MainPage(driver)
        editMenu = EditMenu(driver)
    }

    fun RunAllTests(){
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
        closeOuterPanel(driver)
    }

    private fun PasteWithoutFormatingTest(){
        editMenu.editMenuButton.click()
        editMenu.pasteWithoutFormatingMenuItem.click()
        closeOuterPanel(driver)
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
        closeOuterPanel(driver)
    }

}