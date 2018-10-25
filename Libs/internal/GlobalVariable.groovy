package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile Testing : Pagina de intranet</p>
     */
    public static Object G_Intranet
     
    /**
     * <p></p>
     */
    public static Object G_TimeOut
     
    /**
     * <p></p>
     */
    public static Object G_Usser
     
    /**
     * <p></p>
     */
    public static Object G_Pass
     
    /**
     * <p></p>
     */
    public static Object G_OpcionPortal
     
    /**
     * <p></p>
     */
    public static Object G_CarpetaServicio
     
    /**
     * <p></p>
     */
    public static Object G_SubcarpetaServicio
     
    /**
     * <p></p>
     */
    public static Object G_Portal
     
    /**
     * <p></p>
     */
    public static Object G_Servicio
     

    static {
        def allVariables = [:]        
        allVariables.put('default', [:])
        allVariables.put('Testing', allVariables['default'] + ['G_Intranet' : 'https://test.intranet.osde/IV3/', 'G_TimeOut' : 10, 'G_Usser' : 'SS36739794', 'G_Pass' : 'intranet09', 'G_OpcionPortal' : 'suaPortal', 'G_CarpetaServicio' : 'SERVICIOS', 'G_SubcarpetaServicio' : '', 'G_Portal' : 'http://tlnxwas30.intranet.osde:11780/portalFrontend/login.do', 'G_Servicio' : 'Genesis Cobertura'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        G_Intranet = selectedVariables['G_Intranet']
        G_TimeOut = selectedVariables['G_TimeOut']
        G_Usser = selectedVariables['G_Usser']
        G_Pass = selectedVariables['G_Pass']
        G_OpcionPortal = selectedVariables['G_OpcionPortal']
        G_CarpetaServicio = selectedVariables['G_CarpetaServicio']
        G_SubcarpetaServicio = selectedVariables['G_SubcarpetaServicio']
        G_Portal = selectedVariables['G_Portal']
        G_Servicio = selectedVariables['G_Servicio']
        
    }
}
