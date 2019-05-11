package keyworddemo

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class customKeys {
	static WebDriver driver = DriverFactory.getWebDriver()
	static WebElement element

	/* SendKey to element
	 * Send to user and password for demo in Login page katalon 
	 * */
	@Keyword
	def sendKeyUserAndPass (TestObject nameLocator, TestObject passLocator, String user, String password){
		WebUI.sendKeys(nameLocator, user)
		WebUI.sendKeys(passLocator, password)
	}

	/* List elements
	 * Get list element
	 * */
	@Keyword
	List<WebElement> getWebElementsAsList(TestObject elLocator) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		List<WebElement> elements = webDriver.findElements(By.xpath(elLocator))
		return elements
	}

	/* Dropdown list
	 * Custom list item dropdown
	 * */
	@Keyword
	public static void customDropDown(TestObject elLocator, String itemText){
		List<WebElement> elements = WebUiCommonHelper.findWebElements(elLocator, 5)
		for(WebElement item : elements){
			String newItem = item.getText().trim()
			System.out.println(newItem)
			if( newItem.contains(itemText)){
				item.click()
				break
			}
		}
	}
}
