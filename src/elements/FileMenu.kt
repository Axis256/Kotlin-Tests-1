package elements

import org.omg.PortableServer.THREAD_POLICY_ID
import util.*
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class FileMenu(private val driver: WebDriver) {

    @FindBy(id="docs-file-menu")
    lateinit var fileMenuButton: WebElement

    @FindBy(xpath = "//*[@class=\"goog-menu goog-menu-vertical docs-material docs-menu-hide-mnemonics docs-menu-attached-button-above\"]")
    lateinit var menuPanel: WebElement

    @FindBy(id = "docs-printpreview-close")
    lateinit var printPreviewCloseButton: WebElement

    val fileMenuItems: List<WebElement>

    val sharedAccessMenuItem: WebElement

    val createMenuItem: WebElement

    val openMenuItem: WebElement

    val slideImportMenuItem: WebElement

    val createCopyMenuItem: WebElement

    val downloadAsMenuItem: WebElement

    val attachToEmailMenuItem: WebElement

    val offlineAccessMenuItem: WebElement

    val versionHistoryMenuItem: WebElement

    val renameMenuItem: WebElement

    val moveToMenuItem: WebElement

    val deleteMenuItem: WebElement

    val publishMenuItem: WebElement

    val sendCoauthorsMenuItem: WebElement

    val docInfoMenuItem: WebElement

    val languageMenuItem: WebElement

    val settingsMenuItem: WebElement

    val printSettingsMenuItem: WebElement

    val printMenuItem: WebElement

    val createMenuItems: List<WebElement>

    val createDocMenuItem: WebElement

    val createSheetMenuItem: WebElement

    val createSlideMenuItem: WebElement

    val createFormMenuItem: WebElement

    val createDrawingMenuItem: WebElement

    val createTemplateMenuItem: WebElement

    val downloadAsMenuItems: List<WebElement>

    val pptxMenuItem: WebElement

    val odpMenuItem: WebElement

    val pdfMenuItem: WebElement

    val txtMenuItem: WebElement

    val jpegMenuItem: WebElement

    val pngMenuItem: WebElement

    val svgMenuItem: WebElement

    val versionHistoryMenuItems: List<WebElement>

    val createVersionMenuItem: WebElement

    val reviseVersionsMenuItem: WebElement

    val languageMenuItems: List<WebElement>

    val engMenuItem: WebElement

    val rusMenuItem: WebElement

    init {
        PageFactory.initElements(driver, this)
        WebDriverWait(driver, 10).until<WebElement>(ExpectedConditions.elementToBeClickable(fileMenuButton)).click()

        fileMenuItems = menuPanel.findElements(By.xpath("./*"))
        sharedAccessMenuItem = fileMenuItems[2]
        createMenuItem = fileMenuItems[4]
        openMenuItem = fileMenuItems[5]
        slideImportMenuItem = fileMenuItems[6]
        createCopyMenuItem = fileMenuItems[7]
        downloadAsMenuItem = fileMenuItems[10]
        attachToEmailMenuItem = fileMenuItems[11]
        offlineAccessMenuItem = fileMenuItems[12]
        versionHistoryMenuItem = fileMenuItems[13]
        renameMenuItem = fileMenuItems[15]
        moveToMenuItem = fileMenuItems[16]
        deleteMenuItem = fileMenuItems[18]
        publishMenuItem = fileMenuItems[20]
        sendCoauthorsMenuItem = fileMenuItems[21]
        docInfoMenuItem = fileMenuItems[23]
        languageMenuItem = fileMenuItems[24]
        settingsMenuItem = fileMenuItems[25]
        printSettingsMenuItem = fileMenuItems[26]
        printMenuItem = fileMenuItems[27]

        createMenuItem.click()
        createMenuItems = getPanelItems(driver, 1)
        createDocMenuItem = createMenuItems[0]
        createSheetMenuItem = createMenuItems[1]
        createSlideMenuItem = createMenuItems[2]
        createFormMenuItem = createMenuItems[3]
        createDrawingMenuItem = createMenuItems[4]
        createTemplateMenuItem = createMenuItems[5]

        downloadAsMenuItem.click()
        downloadAsMenuItems = getPanelItems(driver, 1)
        pptxMenuItem = downloadAsMenuItems[0]
        odpMenuItem = downloadAsMenuItems[2]
        pdfMenuItem = downloadAsMenuItems[3]
        txtMenuItem = downloadAsMenuItems[4]
        jpegMenuItem = downloadAsMenuItems[5]
        pngMenuItem = downloadAsMenuItems[6]
        svgMenuItem = downloadAsMenuItems[7]

        versionHistoryMenuItem.click()
        versionHistoryMenuItems = getPanelItems(driver, 2)
        createVersionMenuItem = versionHistoryMenuItems[0]
        reviseVersionsMenuItem = versionHistoryMenuItems[1]

        Thread.sleep(200)
        languageMenuItem.click()
        languageMenuItems = getPanelItems(driver, 3)
        engMenuItem = languageMenuItems[11]
        rusMenuItem = languageMenuItems[47]
        closeOuterPanel(driver)
    }
}