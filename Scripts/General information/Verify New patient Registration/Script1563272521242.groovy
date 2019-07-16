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

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('General information/new_patient_regi btn'))

WebUI.sendKeys(findTestObject('General information/input_fname'), fname)

WebUI.sendKeys(findTestObject('General information/input_lname'), lname)

WebUI.sendKeys(findTestObject('General information/input_mname'), mname)

WebUI.click(findTestObject('General information/select_gender'))

WebUI.click(findTestObject('General information/d.o.b'))

WebUI.click(findTestObject('General information/year of birth'))

WebUI.click(findTestObject('General information/month of birth'))

WebUI.click(findTestObject('General information/date of birth'))

WebUI.sendKeys(findTestObject('General information/input_ssn'), ssn)

WebUI.click(findTestObject('General information/input_marital status'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('General information/input_address'), address1)

WebUI.sendKeys(findTestObject('General information/input_address2'), address2)

WebUI.sendKeys(findTestObject('General information/input_city'), city)

WebUI.click(findTestObject('General information/input_state'))

WebUI.sendKeys(findTestObject('General information/input_zip'), zip)

WebUI.sendKeys(findTestObject('General information/input_email'), email)

WebUI.sendKeys(findTestObject('General information/input_main_mobile'), mobile)

WebUI.sendKeys(findTestObject('General information/input_mobile'), mobile)

WebUI.sendKeys(findTestObject('General information/input_work mobile'), mobile)

WebUI.sendKeys(findTestObject('General information/input_pharmacy name'), pharmacy_name)

WebUI.sendKeys(findTestObject('General information/input_pharmacy No'), mobile)

WebUI.sendKeys(findTestObject('General information/input_pharmacy address'), pharmacy_address)

WebUI.sendKeys(findTestObject('General information/input_contact name'), emergency_contact)

WebUI.sendKeys(findTestObject('General information/input_relationship'), emergency_relationship)

WebUI.sendKeys(findTestObject('General information/input_emergency no'), emergency_no)

WebUI.click(findTestObject('General information/input_ethnic'))

WebUI.sendKeys(findTestObject('General information/input_language'), language)

WebUI.delay(3)

WebUI.click(findTestObject('General information/general_next btn'))

