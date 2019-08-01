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

WebUI.callTestCase(findTestCase('New Patient Registration Form/Verify Responsible Party Form'), [('name') : 'samidoh', ('party') : 'Father'
        , ('ssn') : '55554', ('phone') : '554-798-5696', ('email') : 'kamau@gmail.com', ('city') : 'Kawangware', ('zip') : '00205'
        , ('primary') : 'UAP', ('secondary') : 'Britam'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_name'), employer_name)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_phone'), employer_phone)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_address'), employer_address)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_city'), employer_city)

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_state'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_zip'), employer_zip)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/patient_carrier_name'), 
    carrier_name)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/patient_carrier_phone'), 
    carrier_phone)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/patient_claim_no'), claim_no)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/carrier_address'), claim_address)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/carrier_city'), carrier_city)

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/carrier_state'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/carrier_zip'), carrier_zip)

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/carrier_doi'))

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/date_of_injury'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/employer_contact'), employer_contact)

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/drug_screen'))

WebUI.uploadFile(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/patient_signature'), 
    patient_signature)

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/agreement_checkbox'))

WebUI.click(findTestObject('New Patient Registration Form/Work Compesation Authorisation Form/submit_btn'))

