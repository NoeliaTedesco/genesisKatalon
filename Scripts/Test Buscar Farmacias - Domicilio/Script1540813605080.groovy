import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.event.KeyEvent as KeyEvent
import com.google.common.collect.Multimaps.Keys.KeysEntrySet as KeysEntrySet
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as Driver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import com.thoughtworks.selenium.Selenium as Selenium

WebUI.openBrowser(null)

WebUI.navigateToUrl(GlobalVariable.G_Intranet)

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Login_OSDE Intranet/coUsser'), GlobalVariable.G_TimeOut)

WebUI.setText(findTestObject('Login_OSDE Intranet/coUsser'), GlobalVariable.G_Usser)

WebUI.setText(findTestObject('Login_OSDE Intranet/coPassword'), GlobalVariable.G_Pass)

WebUI.click(findTestObject('Login_OSDE Intranet/btnIngresar'))

WebUI.waitForElementPresent(findTestObject('Home_OSDE Intranet V3/a_Mis Herramientas'), GlobalVariable.G_TimeOut)

WebUI.click(findTestObject('Home_OSDE Intranet V3/a_Mis Herramientas'))

WebUI.waitForElementPresent(findTestObject('Home_OSDE Intranet V3/iframe_MIS HERRAMIENTAS_frmMis'), 0)

WebUI.click(findTestObject('Home_OSDE Intranet V3/td_Portal Corporativo'))

WebUI.switchToWindowUrl(GlobalVariable.G_Portal)

WebUI.waitForElementVisible(findTestObject('Portal_Inicial/select_apiPortalDesarrolloport'), 30)

WebUI.selectOptionByValue(findTestObject('Portal_Inicial/select_apiPortalDesarrolloport'), GlobalVariable.G_OpcionPortal, 
    false)

//REVISAR ESTAS FUNCIONES
verifyIsPortalOpen()

WebUI.setText(findTestObject('Portal_Home/input_BsquedaDetallada'), nroSocio)

WebUI.click(findTestObject('Portal_Home/btn_BsquedaDetallada'))

WebUI.waitForElementPresent(findTestObject('Portal_Home/div_suaCaracteristicasSujeto'), 15)

WebUI.click(findTestObject('Portal_Home/div_collapsableLeftContainer'))

WebUI.waitForElementVisible(findTestObject('Portal_Home/btn_servicesTreeOpen'), 15)

WebUI.click(findTestObject('Portal_Home/btn_servicesTreeOpen'))

WebUI.waitForElementVisible(findTestObject('Portal_Home/a_Servicios'), 15)

WebUI.click(findTestObject('Portal_Home/a_Servicios'))

abrirServicio(GlobalVariable.G_Servicio, Driver.getWebDriver())

verifyIsGenesisCoberturaOpen()

Thread.sleep(8000)

WebUI.click(findTestObject('Servicio/div_Medicamento'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Servicio/input_Medicamento'), busqMedicamento)

selectOptionAutocomplete()

WebUI.click(findTestObject('Servicio/btnEditarDomicilioMed'))

WebUI.waitForElementPresent(findTestObject('Servicio/select_Provincia'), 20)

WebUI.selectOptionByValue(findTestObject('Servicio/select_Provincia'), provincia, false)

WebUI.sendKeys(findTestObject('Servicio/input_Localidad'), localidad)

Thread.sleep(3000)

WebUI.sendKeys(findTestObject('Servicio/input_Localidad'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Servicio/input_Calle'), calle)

Thread.sleep(3000)

WebUI.sendKeys(findTestObject('Servicio/input_Calle'), Keys.chord(Keys.TAB))

Thread.sleep(3000)

WebUI.sendKeys(findTestObject('Servicio/input_Altura'), altura)

WebUI.click(findTestObject('Servicio/btnSeleccionar'))

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Servicio/btnAgregadMed'))

Thread.sleep(2000)

WebUI.click(findTestObject('Servicio/btnMonodroga'))

WebUI.waitForElementPresent(findTestObject('Servicio/input_Monodroga'), 20)

Thread.sleep(5000)

WebUI.sendKeys(findTestObject('Servicio/input_Monodroga'), busqMonodroga)

Thread.sleep(2000)

selectOptionMonodroga()

Thread.sleep(15000)

WebUI.click(findTestObject('Servicio/radBtn_PresentMonodroga'))

Thread.sleep(15000)

WebUI.click(findTestObject('Servicio/btnSeleccionarMed'))

Thread.sleep(3000)

WebUI.click(findTestObject('Servicio/btnBuscar'))

WebUI.waitForElementPresent(findTestObject('Servicio/div_Listado'), 20)

WebUI.click(findTestObject('Servicio/check_ResultadoListado'))

WebUI.click(findTestObject('Servicio/btnRegistrar'))

WebUI.waitForElementClickable(findTestObject('Servicio/btnCerrarMed'), 20)

Thread.sleep(3000)

WebUI.click(findTestObject('Servicio/btnCerrarMed'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Servicio/btnEnviarCorreo'))

WebUI.waitForElementPresent(findTestObject('Servicio/input_Correo'), 20)

WebUI.sendKeys(findTestObject('Servicio/input_Correo'), email)

WebUI.click(findTestObject('Servicio/btnEnviarZona'))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('Servicio/btnImprimir'), 20)

WebUI.click(findTestObject('Servicio/btnImprimir'))

WebUI.waitForElementClickable(findTestObject('Servicio/btnCerrarPopUpMed'), 20)

Thread.sleep(3000)

WebUI.click(findTestObject('Servicio/btnCerrarPopUpMed'))

WebUI.waitForElementClickable(findTestObject('Servicio/div_InfoPrestacion'), 20)

Thread.sleep(3000)

WebUI.click(findTestObject('Servicio/div_InfoPrestacion'))

WebUI.waitForElementClickable(findTestObject('Servicio/span_InfoPrestacion'), 20)

WebUI.click(findTestObject('Servicio/span_InfoPrestacion'))

verificarCargaInformacion()

WebUI.click(findTestObject('Servicio/btnVolver'))

tearDown()

void verificarCargaInformacion() {
    try {
        WebUI.waitForElementPresent(findTestObject('Servicio/form_InformacionPrestacion'), 30)

        System.out.println('Se carga correctamente formulario de prestacion')
    }
    catch (Exception e) {
        System.out.println('No se recuera información de la prestación')
    } 
}

void verifyIsGenesisCoberturaOpen() {
    try {
        Thread.sleep(3000)

        WebUI.waitForElementClickable(findTestObject('Servicio/input_Prestaciones'), 20)
    }
    catch (Exception e) {
        System.out.println('Error al cargar Servicio Genesis Cobertura')
    } 
}

void verifyIsPortalOpen() {
    try {
        Thread.sleep(20000)

        WebUI.waitForElementClickable(findTestObject('Portal_Home/input_BsquedaDetallada'), 20)
    }
    catch (Exception e) {
        reloadPortal()
    } 
}

boolean isPortalLoad() {
    try {
        WebUI.waitForElementClickable(findTestObject('Portal_Home/input_BsquedaDetallada'), 20)

        return true
    }
    catch (Exception e) {
        System.out.println('Portal no se cargo correctamente')

        return false
    } 
}

void reloadPortal() {
    while (isPortalLoad = 'false') {
        WebUI.refresh()
    }
}

void selectOptionAutocomplete() {
    Thread.sleep(5000)

    WebUI.click(findTestObject('Servicio/autocomplete_Medicamento'))
}

void selectOptionMonodroga() {
    Thread.sleep(5000)

    WebUI.click(findTestObject('Servicio/autocomplete_Monodroga'))
}

boolean abrirServicio(String NombreServicio, WebDriver driver) {
    try {
        WebElement element = driver.findElement(By.id('accordionMenuApi'))

        List<WebElement> lstRegistro = element.findElements(By.xpath('//div[contains(@class, \'treeMenuElement ellipsis_text\')]'))

        for (WebElement Registro : lstRegistro) {
            List<WebElement> itemsServicio = Registro.findElements(By.xpath('//span[contains(@class, \'serviceSpanElement\')]'))

            for (WebElement item : itemsServicio) {
                if (item.getText().equals(NombreServicio)) {
                    item.click()

                    return true
                }
            }
            
            return true
        }
    }
    catch (Exception e) {
        System.out.println((('Ocurrio un error al intentar abrir el servicio id = ' + NombreServicio) + ' - ') + e)

        return false
    } 
}

void tearDown() throws Exception {
    WebUI.closeBrowser()
}

