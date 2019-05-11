import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/LoginCase03'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'keyworddemo.customKeys.customDropDown'(findTestObject('MakeApointmentPage/drpFacilityEl'), 'Seoul CURA Healthcare Center')

WebUI.click(findTestObject('MakeApointmentPage/chbApplyForHospital'))

WebUI.click(findTestObject('MakeApointmentPage/rdMedicaid'))

WebUI.setText(findTestObject('MakeApointmentPage/txbVisitDate'), '10/10/2019')

WebUI.setText(findTestObject('MakeApointmentPage/txaComment'), 'Katalon Automation')

WebUI.click(findTestObject('MakeApointmentPage/btnBookApointment'))

WebUI.verifyElementText(findTestObject('MakeApointmentPage/txtFacilityResult'), 'Seoul CURA Healthcare Center')

WebUI.verifyElementVisible(findTestObject('MakeApointmentPage/txtTitleAppointmentConfirm'))

WebUI.click(findTestObject('MakeApointmentPage/btnGoToHomePage'))

WebUI.verifyElementVisible(findTestObject('MakeApointmentPage/txtTitleCURAHealthcareService'))

