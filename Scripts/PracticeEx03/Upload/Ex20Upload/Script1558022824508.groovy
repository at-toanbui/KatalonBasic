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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tus.io/demo.html')

String userDir = System.getProperty('user.dir')

String filePath = userDir + '/Image/imageExample.png'

WebUI.sendKeys(findTestObject('Upload/btn_ChooseFile'), filePath)

WebUI.waitForElementVisible(findTestObject('Upload/txt_UploadSuccess'), GlobalVariable.TIMEOUTMIN)

String textResult = WebUI.getText(findTestObject('Upload/txt_UploadSuccess'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Upload/txt_UploadSuccess'), 'DOWNLOAD IMAGEEXAMPLE.PNG (16641 BYTES)')

WebUI.closeBrowser()

