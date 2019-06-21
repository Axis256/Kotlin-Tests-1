package testcases

import org.openqa.selenium.WebDriver
import pages.MainPage
import elements.*
import org.openqa.selenium.support.ui.WebDriverWait
import util.GuarantiedClick
import util.closeNewTab
import util.closeOuterPanel

class FileMenuTestCase(private val driver: WebDriver, private val page: MainPage) {

    val fileMenu = FileMenu(driver)

    val wait = WebDriverWait(driver, 10)

    fun RunAllTests() {
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
        //PrintTest()
    }

    private fun SharedAccessTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.sharedAccessMenuItem.click()
        closeOuterPanel(driver)
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
        closeOuterPanel(driver)
    }

    private fun SlideImportTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.slideImportMenuItem.click()
        closeOuterPanel(driver)
    }

    private fun CreateCopyTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.createCopyMenuItem.click()
        closeOuterPanel(driver)
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
        closeOuterPanel(driver)
    }

    private fun OfflineAccessTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.offlineAccessMenuItem.click()
        closeOuterPanel(driver)
    }

    private fun VersionHistoryTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.versionHistoryMenuItem.click()
        fileMenu.createVersionMenuItem.click()
        closeOuterPanel(driver)

        GuarantiedClick(driver, 5, fileMenu.fileMenuButton)
        fileMenu.versionHistoryMenuItem.click()
        fileMenu.reviseVersionsMenuItem.click()
        closeOuterPanel(driver)
    }

    private fun RenameTest() {
        GuarantiedClick(driver, 10, fileMenu.fileMenuButton)
        fileMenu.renameMenuItem.click()
        closeOuterPanel(driver)
    }

    private fun MoveTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.moveToMenuItem.click()
        closeOuterPanel(driver)
    }

    private fun DeleteTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.deleteMenuItem.click()
        closeOuterPanel(driver)
        Thread.sleep(500)
    }

    private fun PublishTest() {
        GuarantiedClick(driver, 5, fileMenu.fileMenuButton)
        fileMenu.publishMenuItem.click()
        closeOuterPanel(driver)
    }

    private fun InfoTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.docInfoMenuItem.click()
        closeOuterPanel(driver)
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
        closeOuterPanel(driver)
    }

    private fun PrintSettingsTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.printSettingsMenuItem.click()
        fileMenu.printPreviewCloseButton.click()
    }

    private fun PrintTest() {
        fileMenu.fileMenuButton.click()
        fileMenu.printMenuItem.click()
        closeOuterPanel(driver)
        //closeOuterPanel(driver)
    }
}