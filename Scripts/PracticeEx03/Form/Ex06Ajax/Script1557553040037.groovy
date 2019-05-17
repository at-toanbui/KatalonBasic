import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl('https://www.seleniumeasy.com/test/ajax-form-submit-demo.html')

WebUI.setText(findTestObject('Object Repository/SeleniumEasyDemoPage/txbName'), 'automation')

WebUI.setText(findTestObject('Object Repository/SeleniumEasyDemoPage/txaComment'), 'test')

WebUI.click(findTestObject('Object Repository/SeleniumEasyDemoPage/btnSubmitAjax'))

WebUI.waitForElementVisible(findTestObject('Object Repository/SeleniumEasyDemoPage/txtFormAjaxSuccess'), GlobalVariable.TIMEOUTMIN)

WebUI.verifyElementVisible(findTestObject('SeleniumEasyDemoPage/txtFormAjaxSuccess'))

