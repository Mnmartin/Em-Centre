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

WebUI.callTestCase(findTestCase('New Patient Registration Form/Verify Insurance Information Form'), [('firstname') : 'Trizah'
        , ('middlename') : 'Wambui', ('lastname') : 'Kamau', ('relationship') : 'preacher', ('ssn') : '5545'], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/Responsible party name'), name)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/Responsible Party'), party)

WebUI.click(findTestObject('New Patient Registration Form/Responsible Party Form/Responsible dob'))

WebUI.click(findTestObject('New Patient Registration Form/Responsible Party Form/year'))

WebUI.click(findTestObject('New Patient Registration Form/Responsible Party Form/month'))

WebUI.click(findTestObject('New Patient Registration Form/Responsible Party Form/date'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_ssn'), ssn)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_phone'), phone)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/mailing_address'), email)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_city'), city)

WebUI.click(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_state'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_zip'), zip)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_primary_insurance'), primary)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Responsible Party Form/responsible_secondary_insurance'), secondary)

WebUI.click(findTestObject('New Patient Registration Form/Responsible Party Form/next_btn'))

