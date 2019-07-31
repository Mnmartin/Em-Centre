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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/new_patient_regi btn'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_fname'), fname)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_mname'), mname)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_lname'), lname)

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/select_gender'))

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/d.o.b'))

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/year of birth'))

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/month of birth'))

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/date of birth'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_ssn'), ssn)

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/input_marital status'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_address'), address1)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_address2'), address2)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_city'), city)

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/input_state'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_zip'), zip)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_email'), GlobalVariable.email)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_main_mobile'), mobile)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_mobile'), mobile)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_work mobile'), mobile)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_pharmacy name'), pharmacy_name)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_pharmacy No'), mobile)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_pharmacy address'), pharmacy_address)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_contact name'), emergency_contact)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_relationship'), emergency_relationship)

WebUI.sendKeys(findTestObject('New Patient Registration Form/General Information Form/input_emergency no'), emergency_no)

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/input_ethnic'))

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/input_language'))

WebUI.click(findTestObject('New Patient Registration Form/General Information Form/general_next btn'))

