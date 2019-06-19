package testcases

import org.openqa.selenium.WebDriver
import pages.MainPage
import elements.*
import org.openqa.selenium.support.ui.WebDriverWait
import util.GuarantiedClick
import util.closeNewTab
import util.pressEscKey

class FileMenuTestCase(private val driver: WebDriver, private val page: MainPage) {

    val fileMenu = FileMenu(driver)

    val wait = WebDriverWait(driver, 10)

    fun runAllTests() {
        SharedAccessTest()
        //CreateTest()
        OpenTest()
        SlideImportTest()
        CreateCopyTest()
        //DownloadTest()
        AttachTest()
        OfflineAccessTest()
        VersionHistoryTest()
        RenameTest()
        MoveTest()
        DeleteTest()
        PublishTest()
        InfoTest()
        LanguageTest()
        SettingsTest()
        PrintSettingsTest()
        PrintTest()
    }

    private fun SharedAccessTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.sharedAccessMenuItem.click()
        //wait.until<WebElement>(ExpectedConditions.elementToBeClickable(fileMenu.sharedAccessDoneButton)).click()
        //fileMenu.sharedAccessDoneButton.click()
        Thread.sleep(500)
        pressEscKey(driver)
    }

    private fun CreateTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.createMenuItem.click()
        fileMenu.createDocMenuItem.click()
        closeNewTab(driver)
        fileMenu.fileMenuButton.click()
        fileMenu.createMenuItem.click()
        fileMenu.createSlideMenuItem.click()
        closeNewTab(driver)
        fileMenu.fileMenuButton.click()
        fileMenu.createMenuItem.click()
        fileMenu.createSheetMenuItem.click()
        closeNewTab(driver)
        fileMenu.fileMenuButton.click()
        fileMenu.createMenuItem.click()
        fileMenu.createDrawingMenuItem.click()
        closeNewTab(driver)
        fileMenu.fileMenuButton.click()
        fileMenu.createMenuItem.click()
        fileMenu.createFormMenuItem.click()
        closeNewTab(driver)
        fileMenu.fileMenuButton.click()
        fileMenu.createMenuItem.click()
        fileMenu.createTemplateMenuItem.click()
        closeNewTab(driver)
    }

    private fun OpenTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.openMenuItem.click()
        pressEscKey(driver)
    }

    private fun SlideImportTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.slideImportMenuItem.click()
        pressEscKey(driver)
    }

    private fun CreateCopyTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.createCopyMenuItem.click()
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun DownloadTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.pptxMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.odpMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.pdfMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.txtMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.jpegMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.pngMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.downloadAsMenuItem.click()
        fileMenu.svgMenuItem.click()
    }

    private fun AttachTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.attachToEmailMenuItem.click()
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun OfflineAccessTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.offlineAccessMenuItem.click()
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun VersionHistoryTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.versionHistoryMenuItem.click()
        fileMenu.createVersionMenuItem.click()
        Thread.sleep(500)
        pressEscKey(driver)
        Thread.sleep(500)

        GuarantiedClick(driver, 5, fileMenu.fileMenuButton)
        fileMenu.versionHistoryMenuItem.click()
        fileMenu.reviseVersionsMenuItem.click()
        Thread.sleep(1000)
        pressEscKey(driver)
    }

    private fun RenameTest() {
        GuarantiedClick(driver, 10, fileMenu.fileMenuButton)
        fileMenu.renameMenuItem.click()
        pressEscKey(driver)
    }

    private fun MoveTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.moveToMenuItem.click()
        pressEscKey(driver)
    }

    private fun DeleteTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.deleteMenuItem.click()
        Thread.sleep(500)
        pressEscKey(driver)
        Thread.sleep(1000)
    }

    private fun PublishTest() {
        GuarantiedClick(driver, 5, fileMenu.fileMenuButton)
        fileMenu.publishMenuItem.click()
        Thread.sleep(500)
        pressEscKey(driver)
    }

    private fun InfoTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.docInfoMenuItem.click()
        Thread.sleep(500)
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun LanguageTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.languageMenuItem.click()
        fileMenu.engMenuItem.click()

        fileMenu.fileMenuButton.click()
        fileMenu.languageMenuItem.click()
        fileMenu.rusMenuItem.click()
    }

    private fun SettingsTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.settingsMenuItem.click()
        pressEscKey(driver)
        Thread.sleep(500)
    }

    private fun PrintSettingsTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.printSettingsMenuItem.click()
        fileMenu.printPreviewCloseButton.click()
        Thread.sleep(500)
    }

    private fun PrintTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.printMenuItem.click()
        pressEscKey(driver)
    }
}