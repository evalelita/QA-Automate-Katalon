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

WebUI.navigateToUrl('https://www.jamtangan.com/?utm_source=google&utm_medium=sem&utm_campaign=SEM-3-febuari-general&gclid=CjwKCAjwt52mBhB5EiwA05YKo6SRXP8Zgzg6p55jSVVIG-jPAMbaVWlOqdlr0SC4A0CdLNE8aYQ4TBoCVKYQAvD_BwE')

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_Nanti Saja'))

WebUI.setText(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/input_EmailNo.Handphone_username'), 
    '081263856141')

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_Lebih cepat via whatsapp'))

WebUI.setText(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/input_Verifikasi WhatsApp_w-12 p-3 text-cen_c67940'), 
    '4')

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_Verifikasi Kode'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_Lanjutkan (1)'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/div_Pilih Pengiriman'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/div_JT EZ   2-3 Hari'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_Pilih Pembayaran'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/p_Transfer Bank'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/div_Pembayaran dikonfirmasi otomatis'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/div_Transfer Bank BCA'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/button_order sekarang'))

WebUI.click(findTestObject('Object Repository/Pemesanan/Page_Jamtangan.com - 1 Watch Store in Indonesia/span_CEK PESANAN SAYA_mw-ripple rippling-button'))

