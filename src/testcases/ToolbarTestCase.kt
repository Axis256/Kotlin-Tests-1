package testcases

import elements.Toolbar
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import pages.MainPage
import util.closeOuterPanel

class ToolbarTestCase(private val driver: WebDriver, private val mainPage: MainPage) {

    val toolbar: Toolbar

    init {
        toolbar = Toolbar(driver)
    }

    private fun directCallWithPanel(element: WebElement) {
        element.click()
        closeOuterPanel(driver)
    }

    private fun internalCallWithPanel(outerElement: WebElement, innerElement: WebElement) {
        outerElement.click()
        innerElement.click()
        closeOuterPanel(driver)
    }

    private fun directCallWithoutPanel(element: WebElement) {
        element.click()
    }

    private fun directCallWithDrag(element: WebElement){
        element.click()
        Actions(driver).dragAndDropBy(mainPage.textField, 100, 100).perform()
    }

    private fun internalCallWithDrag(outerElement: WebElement, innerElement: WebElement, actualElement: WebElement){
        outerElement.click()
        innerElement.click()
        actualElement.click()
        Actions(driver).dragAndDropBy(mainPage.textField, 100, 100).perform()
    }
    
    fun RunAllTest(){
        newSlideTest()
        templatesTest()
        undoTest()
        redoTest()
        scaleTest()
        createTextFieldTest()
        insertImageTest()
        insertFigureTest()
        insertLineTest()
        addCommentTest()
        backgroundTest()
        layoutTest()
        themeTest()
        transitionTest()
    }

    private fun newSlideTest() {
        directCallWithoutPanel(toolbar.newSlideItem)
    }

    private fun templatesTest() {
        directCallWithPanel(toolbar.templatesItem)
    }

    private fun undoTest() {
        directCallWithoutPanel(toolbar.undoItem)
    }

    private fun redoTest() {
        directCallWithoutPanel(toolbar.redoItem)
    }

    private fun scaleTest() {}

    private fun createTextFieldTest() {
        directCallWithDrag(toolbar.createTextFieldItem)
    }

    private fun insertImageTest() {
        internalCallWithPanel(toolbar.insertImageItem, toolbar.addFromGoogleDiskMenuItem)
        internalCallWithPanel(toolbar.insertImageItem, toolbar.searchInternetMenuItem)
        internalCallWithPanel(toolbar.insertImageItem, toolbar.addFromGooglePhotoMenuItem)
        internalCallWithPanel(toolbar.insertImageItem, toolbar.pasteURLMenuItem)
        internalCallWithPanel(toolbar.insertImageItem, toolbar.cameraShotMenuItem)
    }

    private fun insertFigureTest() {
        internalCallWithDrag(toolbar.insertFigureItem, toolbar.figuresMenuItem, toolbar.figureElement)
        internalCallWithDrag(toolbar.insertFigureItem, toolbar.arrowsMenuItem, toolbar.arrowElement)
        internalCallWithDrag(toolbar.insertFigureItem, toolbar.referenceMenuItem, toolbar.referenceElement)
        internalCallWithDrag(toolbar.insertFigureItem, toolbar.formulaMenuItem, toolbar.formulaElement)
    }

    private fun insertLineTest() {
        directCallWithDrag(toolbar.insertLineItem)
    }

    private fun addCommentTest() {
        directCallWithPanel(toolbar.addCommentItem)
    }

    private fun backgroundTest() {
        directCallWithPanel(toolbar.backgroundItem)
    }

    private fun layoutTest() {
        directCallWithPanel(toolbar.layoutItem)
    }

    private fun themeTest() {
        directCallWithoutPanel(toolbar.themeItem)
    }

    private fun transitionTest() {
        directCallWithoutPanel(toolbar.transitionItem)
    }
}