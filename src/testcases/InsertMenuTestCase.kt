package testcases

import elements.InsertMenu
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import pages.MainPage
import util.closeOuterPanel
import util.undo

class InsertMenuTestCase(private val driver: WebDriver) {

    val mainPage: MainPage
    val insertMenu: InsertMenu

    init {
        mainPage = MainPage(driver)
        insertMenu = InsertMenu(driver)
    }

    private fun directCallWithPanel(element: WebElement){
        insertMenu.insertMenuButton.click()
        element.click()
        closeOuterPanel(driver)
    }

    private fun internalCallWithPanel(outerElement: WebElement, innerElement: WebElement){
        insertMenu.insertMenuButton.click()
        outerElement.click()
        innerElement.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithoutPanel(element: WebElement){
        insertMenu.insertMenuButton.click()
        element.click()
    }

    private fun internalCallWithoutPanel(outerElement: WebElement, innerElement: WebElement){
        insertMenu.insertMenuButton.click()
        outerElement.click()
        innerElement.click()
    }

    private fun directCallWithDrag(element: WebElement){
        insertMenu.insertMenuButton.click()
        element.click()
        Actions(driver).dragAndDropBy(mainPage.textField, 100, 100).perform()
    }

    private fun internalCallWithDrag(outerElement: WebElement, innerElement: WebElement) {
        insertMenu.insertMenuButton.click()
        outerElement.click()
        innerElement.click()
        Actions(driver).dragAndDropBy(mainPage.textField, 100, 100).perform()
    }

    private fun doubleInternalCallWithDrag(outerElement: WebElement, innerElement: WebElement, actualElement: WebElement) {
        insertMenu.insertMenuButton.click()
        outerElement.click()
        innerElement.click()
        actualElement.click()
        Actions(driver).dragAndDropBy(mainPage.textField, 100, 100).perform()
    }

    private fun internalCallWithUndoAndWait(outerElement: WebElement, innerElement: WebElement){
        insertMenu.insertMenuButton.click()
        outerElement.click()
        innerElement.click()
        Thread.sleep(3000)
        undo(driver)
    }

    private fun directCallWithCloseButton(element: WebElement, closeButton: WebElement){
        insertMenu.insertMenuButton.click()
        element.click()
        closeButton.click()
    }

    fun RunAllTests() {
        imageTest()
        textfieldTest()
        audioTest()
        videoTest()
        figureTest()
        tableTest()
        //diagramTest()
        wordartTest()
        lineTest()
        animationTest()
        leaveCommentTest()
        newSlideTest()
        slideNumbersTest()
    }

    private fun imageTest() {
        internalCallWithPanel(insertMenu.imageMenuItem, insertMenu.addFromGoogleDiskMenuItem)
        internalCallWithPanel(insertMenu.imageMenuItem, insertMenu.searchInternetMenuItem)
        internalCallWithPanel(insertMenu.imageMenuItem, insertMenu.addFromGooglePhotoMenuItem)
        internalCallWithPanel(insertMenu.imageMenuItem, insertMenu.pasteURLMenuItem)
        internalCallWithPanel(insertMenu.imageMenuItem, insertMenu.cameraShotMenuItem)
    }

    private fun textfieldTest() {
        directCallWithDrag(insertMenu.textfieldMenuItem)
    }

    private fun audioTest() {
        directCallWithPanel(insertMenu.audioMenuItem)
    }

    private fun videoTest() {
        directCallWithPanel(insertMenu.videoMenuItem)
    }

    private fun figureTest() {
        doubleInternalCallWithDrag(insertMenu.figureMenuItem, insertMenu.figuresMenuItem, insertMenu.figureElement)
        doubleInternalCallWithDrag(insertMenu.figureMenuItem, insertMenu.arrowsMenuItem, insertMenu.arrowElement)
        doubleInternalCallWithDrag(insertMenu.figureMenuItem, insertMenu.referenceMenuItem, insertMenu.referenceElement)
        doubleInternalCallWithDrag(insertMenu.figureMenuItem, insertMenu.formulaMenuItem, insertMenu.formulaElement)
    }

    private fun tableTest() {
        internalCallWithDrag(insertMenu.tableMenuItem, insertMenu.tableCell)
    }

    private fun diagramTest() {
        internalCallWithUndoAndWait(insertMenu.diagramMenuItem, insertMenu.linearMenuItem)
        internalCallWithUndoAndWait(insertMenu.diagramMenuItem, insertMenu.columnarMenuItem)
        internalCallWithUndoAndWait(insertMenu.diagramMenuItem, insertMenu.plotMenuItem)
        internalCallWithUndoAndWait(insertMenu.diagramMenuItem, insertMenu.circularMenuItem)
        internalCallWithPanel(insertMenu.diagramMenuItem, insertMenu.fromTablesMenuItem)
    }

    private fun wordartTest() {
        directCallWithPanel(insertMenu.wordartMenuItem)
    }

    private fun lineTest() {
        internalCallWithDrag(insertMenu.lineMenuItem, insertMenu.firstLineMenuItem)
    }

    private fun animationTest() {
        directCallWithCloseButton(insertMenu.animationMenuItem, insertMenu.closeAnimationsButton)
    }

    private fun leaveCommentTest() {
        directCallWithPanel(insertMenu.leaveCommentMenuItem)
    }

    private fun newSlideTest() {
        directCallWithoutPanel(insertMenu.newSlideMenuItem)
    }

    private fun slideNumbersTest() {
        directCallWithPanel(insertMenu.slideNumbersMenuItem)
    }

}