import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.firefly-iii.org/login')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/body_Welcome to the Firefly III demonstrati_d473ad'))

WebUI.setText(findTestObject('Object Repository/Page_Login to Firefly III/input_email'), 'demo@firefly')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to Firefly III/input_password'), 'PblvLzUlPsM=')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Whats playing  Firefly III/a_Bills'))

WebUI.click(findTestObject('Object Repository/Page_Bills  Firefly III/a_Create new bill'))

WebUI.setText(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/input_name'), name)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/select_Euro ()British Pound ()Hungarian for_48a2bd'), 
    '8', true)

WebUI.setText(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/input_amount_min'), min)

WebUI.setText(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/input_amount_max'), max)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/select_dailyweeklymonthlyquarterlyevery hal_79c7c6'), 
    'weekly', true)

WebUI.setText(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/input_skip'), skip)

WebUI.setText(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/textarea_notes'), note)

WebUI.setText(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/input_object_group'), group)

WebUI.click(findTestObject('Object Repository/Page_Create new bill  Bills  Firefly III/button_Store new bill'))

WebUI.closeBrowser()

