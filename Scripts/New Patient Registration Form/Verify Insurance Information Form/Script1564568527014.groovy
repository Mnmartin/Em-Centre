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

WebUI.callTestCase(findTestCase('New Patient Registration Form/Verify General Information Form'), [('fname') : 'Mary', ('lname') : 'Mbugua'
        , ('mname') : 'wanjiku', ('ssn') : '15545', ('address1') : 'Mombasa\r\n', ('address2') : 'Nairobi', ('city') : 'nakota'
        , ('zip') : '00206', ('mobile') : '223-566-1568', ('pharmacy_name') : 'Quinsy Pharmacy', ('pharmacy_address') : '2544 luthuli'
        , ('emergency_contact') : 'Ann Waiguru', ('emergency_relationship') : 'father', ('emergency_no') : '265-666-8796'
        , ('language') : 'English'], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Insurance Information Form/Insurance Subscriber fname'), firstname)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Insurance Information Form/Insurance Subscriber mname'), middlename)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Insurance Information Form/Insurance Subscriber lname'), lastname)

WebUI.sendKeys(findTestObject('New Patient Registration Form/Insurance Information Form/Insurance Subscriber relation'), 
    relationship)

WebUI.click(findTestObject('New Patient Registration Form/Insurance Information Form/insurance dob'))

WebUI.click(findTestObject('New Patient Registration Form/Insurance Information Form/insurance year of birth'))

WebUI.click(findTestObject('New Patient Registration Form/Insurance Information Form/Insurance month of birth'))

WebUI.click(findTestObject('New Patient Registration Form/Insurance Information Form/insurance date of birth'))

WebUI.sendKeys(findTestObject('New Patient Registration Form/Insurance Information Form/Insurance Subscriber ssn'), ssn)

WebUI.click(findTestObject('New Patient Registration Form/Insurance Information Form/next_btn'))

