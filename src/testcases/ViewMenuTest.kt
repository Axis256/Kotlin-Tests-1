package testcases

import org.openqa.selenium.WebDriver
import pages.MainPage
import elements.ViewMenu
import util.pressEscKey

class ViewMenuTest(private val driver: WebDriver) {

    val mainPage: MainPage
    val viewMenu: ViewMenu

    init {
        mainPage = MainPage(driver)
        viewMenu = ViewMenu(driver)
    }

    fun RunAllTests(){
        WatchTest()
        AnimationTest()
        MasterTest()
        NetViewTest()
        ScaleTest()
        ShowRulerTest()
        GuidelineTest()
        BindingTest()
        ShowNotesTest()
        FullscreenTest()
    }

    private fun WatchTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.watchMenuItem.click()
        Thread.sleep(2000)
        pressEscKey(driver)
    }

    private fun AnimationTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.animationMenuItem.click()
        pressEscKey(driver)
    }

    private fun MasterTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.masterMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.masterMenuItem.click()
    }

    private fun NetViewTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.netViewMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.netViewMenuItem.click()
    }

    private fun ScaleTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.scaleMenuItem.click()
        viewMenu.fiftypercentMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.scaleMenuItem.click()
        viewMenu.hundredpercentMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.scaleMenuItem.click()
        viewMenu.twohundredpercentMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.scaleMenuItem.click()
        viewMenu.scaleDownMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.scaleMenuItem.click()
        viewMenu.scaleUpMenuItem.click()
    }

    private fun ShowRulerTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.showRulerMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.showRulerMenuItem.click()
    }

    private fun GuidelineTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.guidelineMenuItem.click()
        viewMenu.showMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.guidelineMenuItem.click()
        viewMenu.addVertMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.guidelineMenuItem.click()
        viewMenu.addHorMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.guidelineMenuItem.click()
        viewMenu.changeGuidelines.click()
        pressEscKey(driver)
        Thread.sleep(300)
        viewMenu.viewMenuButton.click()
        viewMenu.guidelineMenuItem.click()
        viewMenu.hideGuidelines.click()
    }

    private fun BindingTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.bindingMenuItem.click()
        viewMenu.bindtoGuidelinesMenuItem.click()
        viewMenu.viewMenuButton.click()
        viewMenu.bindingMenuItem.click()
        viewMenu.bindToRulerMenuItem.click()
    }

    private fun ShowNotesTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.showNotesMenuItem.click()
    }

    private fun FullscreenTest(){
        viewMenu.viewMenuButton.click()
        viewMenu.fullscreeMenuItem.click()
        pressEscKey(driver)
    }
}